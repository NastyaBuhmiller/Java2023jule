package com.company.http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;

public class Server3 {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0); //создает виртуальный порт с номером 8000
        server.createContext("/", new Server3.MyHandler()); //создаем путь к обработчику запросов
        server.setExecutor(null); // creates a default executor обязательная строка
        server.start(); //запуск сервера
    }

    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException { //переменная t хранит запрос и ответ на него
            //String response = "Response to address " + t.getRequestURI();//создается текст ответа на запрос get..хранит то, что пишем в адресной строке
            String line = t.getRequestURI().toString();
            String[] arr = line.split("_");
            String file = ("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" +
                    "\n" +
                    "<svg width=\"800\" height=\"600\">\n" +
                    "<rect x=\"" + arr[1] + "\" y=\"" + arr[1] + "\" width=\"" + arr[3] + "\" stroke=\"green\" height=\"" + arr[4] + "\" fill=\"yellow\" />\n" +
                    "</svg>\n" +
                    "</body>\n" +
                    "</html>");
            t.sendResponseHeaders(200, file.length());// http статус код (200-ок)
            PrintWriter writer = new PrintWriter(t.getResponseBody());// подготовка инструмента для записи данных в ответ
            writer.write(file);// заисываем респонс

            writer.close();//заканчиваем
        }
    }
}
