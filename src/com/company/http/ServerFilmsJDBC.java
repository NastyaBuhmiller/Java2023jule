package com.company.http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ServerFilmsJDBC {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0); //создает виртуальный порт с номером 8000
        server.createContext("/", new ServerFilmsJDBC.MainHandler()); //создаем путь к обработчику запросов
        server.createContext("/category", new ServerFilmsJDBC.Name_filmHandler());
        server.createContext("/film", new ServerFilmsJDBC.Info_filmHandler());
        Class.forName("org.postgresql.Driver");
        server.setExecutor(null); // creates a default executor обязательная строка
        server.start(); //запуск сервера

    }


    public static String Read(Scanner s) throws SQLException {
        String total = "";
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dvdrental_pg94",
                "postgres", "iris1997");
        Statement stm = conn.createStatement();
        ResultSet resultSet = stm.executeQuery("select category_id, name from category");
        while (resultSet.next()) {
            int id = resultSet.getInt("category_id");
            String name = resultSet.getString("name");
            total = total + "<li><a href=\"category?id=" + id + "\">" + name + "</a>" + "</li>";
        }
        return total;
    }

    public static String ReadFilm(Scanner scanner_film, Scanner scanner_category, Scanner scanner_film_category, HttpExchange t) throws SQLException {
        String total = "";
        String line1 = t.getRequestURI().getQuery();
        int id = Integer.parseInt(FromAdressLineCategory_filmToWriter(line1));
        String query = ("select title, film_id from film where film_id in (select film_id from film_category where category_id= ?)");
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dvdrental_pg94",
                "postgres", "iris1997");
        PreparedStatement stm = conn.prepareStatement(query);
        stm.setInt(1, id);
        ResultSet resultSet = stm.executeQuery();
        while (resultSet.next()) {
            int id_film = resultSet.getInt("film_id");
            String title = resultSet.getString("title");
            total = total + "<li><a href=\"film?id=" + id_film + "\">" + title + "</a>" + "</li>";
        }


        return total;
    }

    static class Info_filmHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) { //переменная t хранит запрос и ответ на него
            File file_film = new File("RES/film.dat");
            File file_category = new File("RES/category.dat");
            File file_film_category = new File("RES/film_category.dat");
            File id_actor = new File("RES/film_actor.dat");
            File name_actor = new File("RES/actor.dat");
            try {
                Scanner scanner_film = new Scanner(file_film);
                Scanner scanner_category = new Scanner(file_category);
                Scanner scanner_film_category = new Scanner(file_film_category);
                Scanner scanner_id_actor = new Scanner(id_actor);
                Scanner scanner_name_actor = new Scanner(name_actor);
                if (!file_film.exists()) {
                    file_film.createNewFile();
                }
                String head = Head();
                String foot = Foot();
                String bodyCircle_open = BodyCircle_open();
                String body_close = Body_close();
                String file;
                String line = ReadNameFilm(scanner_film, scanner_film_category, t);
                scanner_film_category = new Scanner(file_film_category);
                String name_actor1 = Read_actor(scanner_film_category, scanner_id_actor, scanner_name_actor, t);
                file = head + bodyCircle_open + "<ul>" +
                        line + name_actor1 + "</ul>" + body_close + foot;
                t.sendResponseHeaders(200, file.getBytes().length);// http статус код (200-ок)
                PrintWriter writer1 = new PrintWriter(t.getResponseBody());// подготовка инструмента для записи данных в ответ
                writer1.write(file);
                writer1.close();
            } catch (IOException e) {
                System.out.println(file_film.getAbsolutePath());
                e.printStackTrace();
            }

        }
    }


    public static String Head() {
        return ("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"utf-8\"/>\n" +
                "<head/>\n");
    }

    public static String BodyCircle_open() {
        return "<body>\n" +
                "\n";
    }

    public static String Body_close() {
        return "</body>\n";
    }

    public static String Foot() {
        return "</html>";
    }

    public static String Read_actor(Scanner scanner_film_category, Scanner scanner_id_actor, Scanner scanner_name_actor, HttpExchange t) throws SQLException {
        String total = "";
        String line1 = t.getRequestURI().getQuery();
        int id = Integer.parseInt(FromAdressLineName_actorToWriter(line1));
        String query = ("inventory_id, film_id, store_id,last_update from inventory where film_id in (select film_id from film_category where category_id= ?)");
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dvdrental_pg94",
                "postgres", "iris1997");
        PreparedStatement stm = conn.prepareStatement(query);
        stm.setInt(1, id);
        ResultSet resultSet = stm.executeQuery();
//        String film_id = FromAdressLineName_actorToWriter(line1);
//        while (scanner_id_actor.hasNext()) {
//            String[] arr;
//            String line2 = scanner_id_actor.nextLine();
//            arr = line2.split("\t");
//            if (arr.length > 2 && arr[1].equals(film_id)) {
//                id_actor.add(arr[0]);
//            }
//        }
//        while (scanner_name_actor.hasNext()) {
//            String[] arr1;
//            String line3 = scanner_name_actor.nextLine();
//            arr1 = line3.split("\t");
//            if (arr1.length > 2 && id_actor.contains(arr1[0])) {
//                total = total + "<li><a href=\"film?id=" + arr1[0] + "\">" + arr1[1] + arr1[2] + "</a>" + "</li>";

//}
//select first_name, last_name from actor where actor_id in (select actor_id from film_actor where film_id=194 )
        while (resultSet.next()) {
            int inventory_id = resultSet.getInt("inventory_id");
            int film_id = resultSet.getInt("film_id");
            String store_id = resultSet.getString("store_id");
            String last_update = resultSet.getString("last_update");
            total = total + "<li><a href=\"film?id=" + film_id + "\">" + inventory_id + store_id + last_update + "</a>" + "</li>";
        }
        return total;
    }

    static class MainHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) { //переменная t хранит запрос и ответ на него
            File f = new File("RES/category.dat");
            File j = new File("RES/film_category.dat");
            try {
                Scanner s = new Scanner(f);
                Scanner h = new Scanner(j);
                if (!f.exists()) {
                    f.createNewFile();
                }
                String head = Head();
                String foot = Foot();
                String bodyCircle_open = BodyCircle_open();
                String body_close = Body_close();
                String file;
                String line = Read(s);
                file = head + bodyCircle_open + "<ul>" +
                        line + "</ul>" + body_close + foot;
                t.sendResponseHeaders(200, file.getBytes().length);// http статус код (200-ок)
                PrintWriter writer1 = new PrintWriter(t.getResponseBody());// подготовка инструмента для записи данных в ответ
                writer1.write(file);
                writer1.close();
            } catch (IOException e) {
                System.out.println(f.getAbsolutePath());
                e.printStackTrace();
            } catch (SQLException e) {
                System.out.println(f.getAbsolutePath());
                e.printStackTrace();
            }

        }
    }

    static class Name_filmHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) { //переменная t хранит запрос и ответ на него
            File file_film = new File("RES/film.dat");
            File file_category = new File("RES/category.dat");
            File file_film_category = new File("RES/film_category.dat");

            try {
                Scanner scanner_film = new Scanner(file_film);
                Scanner scanner_category = new Scanner(file_category);
                Scanner scanner_film_category = new Scanner(file_film_category);

                if (!file_film.exists()) {
                    file_film.createNewFile();
                }
                String head = Head();
                String foot = Foot();
                String bodyCircle_open = BodyCircle_open();
                String body_close = Body_close();
                String file;
                String line = ReadFilm(scanner_film, scanner_category, scanner_film_category, t);

                file = head + bodyCircle_open + "<ul>" +
                        line + "</ul>" + body_close + foot;
                t.sendResponseHeaders(200, file.getBytes().length);// http статус код (200-ок)
                PrintWriter writer1 = new PrintWriter(t.getResponseBody());// подготовка инструмента для записи данных в ответ
                writer1.write(file);
                writer1.close();
            } catch (IOException e) {
                System.out.println(file_film.getAbsolutePath());
                e.printStackTrace();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

        }
    }

    public static String ReadNameFilm(Scanner scanner_film, Scanner scanner_film_category, HttpExchange t) {
        String total = "";
        ArrayList<String> i_category = new ArrayList<>();
        String line1 = t.getRequestURI().getQuery();
        String film_id = FromAdressLineid_filmToWriter(line1);
        total = infoFilm(scanner_film, film_id);
        return total;
    }

    public static String FromAdressLineCategory_filmToWriter(String line) {
        String[] arr = line.split("&");
        String id;
        int index = arr[0].indexOf("=");
        id = arr[0].substring(index + 1);
        return id;
    }

    public static String FromAdressLineName_actorToWriter(String line) {
        String[] arr = line.split("&");
        String id;
        int index = arr[0].indexOf("=");
        id = arr[0].substring(index + 1);
        return id;
    }


    public static String FromAdressLineid_filmToWriter(String line) {
        String[] arr = line.split("&");
        String id;
        int index = arr[0].indexOf("=");
        id = arr[0].substring(index + 1);
        return id;
    }

    public static String infoFilm(Scanner scanner_film, String film_id) {
        String total = "";
        while (scanner_film.hasNext()) {
            String[] arr1;
            String line3 = scanner_film.nextLine();
            arr1 = line3.split("\t");

            if (arr1.length > 2 && film_id.equals(arr1[0])) {
                total = total + "<li><a href=\"film?id=" + arr1[0] + "\">" + arr1[1] + arr1[2] + arr1[3] + arr1[7] + arr1[9] + "</a>" + "</li>";
            }
        }
        return total;
    }

    public static String id_category(Scanner scanner_film_category, String id) {
        String film_id = "";
        while (scanner_film_category.hasNext()) {
            String[] arr;
            String line2 = scanner_film_category.nextLine();
            arr = line2.split("\t");
            if (arr.length > 2 && arr[0].equals(id)) {
                film_id = arr[1];
            }
        }
        return film_id;
    }
}
