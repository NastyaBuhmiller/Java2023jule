package com.company.http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class Server_Films {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0); //создает виртуальный порт с номером 8000
        server.createContext("/", new MainHandler()); //создаем путь к обработчику запросов
        server.setExecutor(null); // creates a default executor обязательная строка
        server.start(); //запуск сервера
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
                file = head + bodyCircle_open +"<ul>"+
                        line +"</ul>"+ body_close + foot;
                t.sendResponseHeaders(200, file.getBytes().length);// http статус код (200-ок)
                PrintWriter writer1 = new PrintWriter(t.getResponseBody());// подготовка инструмента для записи данных в ответ
                writer1.write(file);
                writer1.close();
            } catch (IOException e) {
                System.out.println(f.getAbsolutePath());
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

    public static String Read(Scanner s) {
        Scanner k = new Scanner(System.in);
        String[] num;
        String total = "";
        while (s.hasNext()) {
            String line = s.nextLine();
            if (line.isEmpty()) {

            } else {
                num = line.split("\t");
                if (num.length < 2) {

                } else {
                    total = total +"<li><a href=\"category?id="+num[0]+"\">"+ num[1]+"</a>"+"</li>";
                    }
                }
            }
        return total;
    }
}


