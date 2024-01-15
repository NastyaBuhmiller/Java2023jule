package com.company.http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.FileNotFoundException;
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
        server.createContext("/add", new ServerFilmsJDBC.Create_Handler());
        server.createContext("/add_film", new ServerFilmsJDBC.add_film_Handler());
        Class.forName("org.postgresql.Driver");
        server.setExecutor(null); // creates a default executor обязательная строка
        server.start(); //запуск сервера

    }


    public static String Read() throws SQLException,FileNotFoundException {
        String total = "";
        Connection conn = Read_config_dvdrental();
        Statement stm = conn.createStatement();
        ResultSet resultSet = stm.executeQuery("select category_id, name from category");
        while (resultSet.next()) {
            int id = resultSet.getInt("category_id");
            String name = resultSet.getString("name");
            total = total + "<li><a href=\"category?id=" + id + "\">" + name + "</a>" + "</li>";
        }
        return total;
    }

    public static String ReadFilm(HttpExchange t) throws SQLException,FileNotFoundException {
        String total = "";
        String line1 = t.getRequestURI().getQuery();
        int id = Integer.parseInt(FromAdressLineCategory_filmToWriter(line1));
        String query = ("select title, film_id from film where film_id in (select film_id from film_category where category_id= ?)");
        Connection conn = Read_config_dvdrental();
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

    public static String ReadInfoFilm(HttpExchange t)throws SQLException,FileNotFoundException {
        String total = "";
        String line1 = t.getRequestURI().getQuery();
        int id = Integer.parseInt(FromAdressLineCategory_filmToWriter(line1));
        String query = ("select film_id,title,description,release_year,length from film where film_id = ?");
        Connection conn = Read_config_dvdrental();
        PreparedStatement stm = conn.prepareStatement(query);
        stm.setInt(1, id);
        ResultSet resultSet = stm.executeQuery();
        while (resultSet.next()) {
            int id_film = resultSet.getInt("film_id");
            String title = resultSet.getString("title");
            String description = resultSet.getString("description");
            String release_year = resultSet.getString("release_year");
            String length = resultSet.getString("length");
            total = total + "<li><a href=\"film?id=" + id_film + "\">" + title +description+release_year+length+ "</a>" + "</li>";
        }
       return total;

    }

    static class Info_filmHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) { //переменная t хранит запрос и ответ на него
                try {
                String head = Head();
                String foot = Foot();
                String bodyCircle_open = BodyCircle_open();
                String body_close = Body_close();
                String file;
                String line = ReadInfoFilm(t);
                String name_actor1 = Read_actor(t);
                String inventory = Read_inventory(t);
                file = head + bodyCircle_open + "<ul>" +
                        line + name_actor1 +inventory+ "</ul>" + body_close + foot;
                t.sendResponseHeaders(200, file.getBytes().length);// http статус код (200-ок)
                PrintWriter writer1 = new PrintWriter(t.getResponseBody());// подготовка инструмента для записи данных в ответ
                writer1.write(file);
                writer1.close();
            } catch (IOException | SQLException e) {
                e.printStackTrace();
            }
        }
    }

    static class Create_Handler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) { //переменная t хранит запрос и ответ на него
                try {
                String head = Head();
                String foot = Foot();
                String Body_add_film = Body_add_film();
                String body_close = Body_close();
                String file;


                file = head + Body_add_film + "<ul>" +
                         "</ul>" + body_close + foot;
                t.sendResponseHeaders(200, file.getBytes().length);// http статус код (200-ок)
                PrintWriter writer1 = new PrintWriter(t.getResponseBody());// подготовка инструмента для записи данных в ответ
                writer1.write(file);
                writer1.close();
            } catch (IOException  e) {
                e.printStackTrace();
            }
        }
    }
    static class add_film_Handler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) { //переменная t хранит запрос и ответ на него
            try {
                String head = Head();
                String foot = Foot();
                String Body_add_film = Body_add_film();
                String body_close = Body_close();
                String file;
                String add_film=Read_add_Film(t);
                file = head + Body_add_film + "<ul>" +add_film+
                        "</ul>" + body_close + foot;
                t.sendResponseHeaders(200, file.getBytes().length);// http статус код (200-ок)
                PrintWriter writer1 = new PrintWriter(t.getResponseBody());// подготовка инструмента для записи данных в ответ
                writer1.write(file);
                writer1.close();
            } catch (IOException| SQLException  e) {
                e.printStackTrace();
            }
        }
    }
    public static String Read_add_Film(HttpExchange t)throws SQLException,FileNotFoundException {
        String total = "";
        String line1 = t.getRequestURI().getQuery();
        String query = ("insert into film (title,description,release_year, language_id,length) values (?,?,?,?,?)");
        Connection conn = Read_config_dvdrental();
        PreparedStatement stm = conn.prepareStatement(query);

        String line="";
        String[] arr = line1.split("&");
        String title, description,release_year, language_id,length;;
        int index = arr[0].indexOf("=");
        title = arr[0].substring(index + 1);
        int index1 = arr[1].indexOf("=");
        description = arr[1].substring(index1 + 1);
        int index2 = arr[2].indexOf("=");
        release_year = arr[2].substring(index2 + 1);
        int index3 = arr[3].indexOf("=");
        language_id = arr[3].substring(index3 + 1);
        int index4=arr[4].indexOf("=");
        length= arr[4].substring(index4 + 1);
        int release_year1=Integer.parseInt(release_year);
        int language_id1=Integer.parseInt(language_id);
        int length1=Integer.parseInt(length);
        stm.setString(1, title);
        stm.setString(2, description);
        stm.setInt(3, release_year1);
        stm.setInt(4, language_id1);
        stm.setInt(5, length1);
        int resultSet = stm.executeUpdate();

        total = total + "<li><a href=\"film?id=>" + title +description+release_year+ language_id+length+ "</a>" + "</li>";
        return total;

    }
    public static String Head() {
        return ("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"utf-8\"/>\n" +
                "<head/>\n");
    }

    public static String Body_add_film() {
        return "<body>\n" +
                "\n"+
                "<h1>Введите полную информацию о фильме:</h1>\n" +
                "<form action=\"/add_film\">\n" +
                "   title <input name= \"title\"><br>\n" +
                "   description <input name= \"description\"><br>\n" +
                "   release_year <input name=\"release_year\" ><br>\n" +
                "   language_id  <input name=\"language_id\" ><br>\n" +
                "   length <input name= \"length\"><br>\n" +
                "    <input type=\"submit\" value=\"Submit\">\n" +
                "</form>\n";
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

    public static String Read_actor( HttpExchange t) throws SQLException,FileNotFoundException {
        String total_get_actors= "";
        String line1 = t.getRequestURI().getQuery();
        int id = Integer.parseInt(FromAdressLineName_actorToWriter(line1));
        String query_get_actors = ("select actor_id, first_name, last_name from actor where actor_id in (select actor_id from film_actor where film_id= ?)");
        Connection conn_get_actors = Read_config_dvdrental();
        PreparedStatement stm_get_actors = conn_get_actors.prepareStatement(query_get_actors);
        stm_get_actors.setInt(1, id);
        ResultSet resultSet_get_actors = stm_get_actors.executeQuery();
        while (resultSet_get_actors.next()) {
            int actor_id = resultSet_get_actors .getInt("actor_id");
            String first_name = resultSet_get_actors .getString("first_name");
            String last_name = resultSet_get_actors .getString("last_name");
            total_get_actors = total_get_actors + "<li><a href=\"film?id=" + actor_id + "\">" + first_name + last_name +"</a>" + "</li>";
        }
         return total_get_actors;
    }

    public static String Read_inventory( HttpExchange t) throws SQLException,FileNotFoundException {
        String total = "";
        String line1 = t.getRequestURI().getQuery();
        int id = Integer.parseInt(FromAdressLineName_actorToWriter(line1));
        String query = ("select inventory_id, film_id, store_id,last_update from inventory where film_id in (select film_id from film_category where category_id= ?)");
        Connection conn = Read_config_dvdrental();
        PreparedStatement stm = conn.prepareStatement(query);
        stm.setInt(1, id);
        ResultSet resultSet = stm.executeQuery();
        while (resultSet.next()) {
            int inventory_id = resultSet.getInt("inventory_id");
            int film_id = resultSet.getInt("film_id");
            String store_id = resultSet.getString("store_id");
            String last_update = resultSet.getString("last_update");
            total = total + "<li><a href=\"film?id=" + film_id + "\">" + inventory_id + store_id + last_update + "</a>" + "</li>";
        }
        return total;
    }

    public static Connection Read_config_dvdrental()throws FileNotFoundException,SQLException{
        File dvdrental_config = new File("C:\\TMP\\dvdrental_config.txt");
        Scanner scanner_dvdrental_config = new Scanner(dvdrental_config);
        int i=0;
        scanner_dvdrental_config.nextLine();//чтение шапки файла
        String line=scanner_dvdrental_config.nextLine();
        String[] arr = line.split(";");
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+arr[0],
                arr[1],arr[2]);
      return conn;
    }

    static class MainHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) { //переменная t хранит запрос и ответ на него
                try {
                String head = Head();
                String foot = Foot();
                String bodyCircle_open = BodyCircle_open();
                String body_close = Body_close();
                String file;
                String line = Read();
                file = head + bodyCircle_open + "<ul>" +
                        line + "</ul>" + body_close + foot;
                t.sendResponseHeaders(200, file.getBytes().length);// http статус код (200-ок)
                PrintWriter writer1 = new PrintWriter(t.getResponseBody());// подготовка инструмента для записи данных в ответ
                writer1.write(file);
                writer1.close();
            } catch (IOException e) {
               e.printStackTrace();
            } catch (SQLException e) {
               e.printStackTrace();
            }

        }
    }

    static class Name_filmHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) { //переменная t хранит запрос и ответ на него
              try {
                String head = Head();
                String foot = Foot();
                String bodyCircle_open = BodyCircle_open();
                String body_close = Body_close();
                String file;
                String line = ReadFilm(t);
                file = head + bodyCircle_open + "<ul>" +
                        line + "</ul>" + body_close + foot;
                t.sendResponseHeaders(200, file.getBytes().length);// http статус код (200-ок)
                PrintWriter writer1 = new PrintWriter(t.getResponseBody());// подготовка инструмента для записи данных в ответ
                writer1.write(file);
                writer1.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

        }
    }

//    public static String ReadNameFilm(HttpExchange t) {
//       String total = "";
//       ArrayList<String> i_category = new ArrayList<>();
//       String line1 = t.getRequestURI().getQuery();
//       String film_id = FromAdressLineid_filmToWriter(line1);
//       total = infoFilm(film_id);
//        return total;
//    }


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
