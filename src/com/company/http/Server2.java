package com.company.http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;

public class Server2 {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0); //создает виртуальный порт с номером 8000
        server.createContext("/circle", new CircleHandler()); //создаем путь к обработчику запросов
        server.createContext("/", new MainHandler()); //создаем путь к обработчику запросов
        server.setExecutor(null); // creates a default executor обязательная строка
        server.start(); //запуск сервера
    }

    static class CircleHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException { //переменная t хранит запрос и ответ на него
            //String response = "Response to address " + t.getRequestURI();//создается текст ответа на запрос get..хранит то, что пишем в адресной строке
  String line=t.getRequestURI().getQuery();//cx=400&cy=300&r=200&stroke-width=5
  String cx,cy,r,stroke_width;
  String[] arr=line.split("&");
  int index=arr[0].indexOf("=");
  cx=arr[0].substring(index+1);
  int index1=arr[1].indexOf("=");
  cy=arr[1].substring(index1+1);
  int index2=arr[2].indexOf("=");
  r=arr[2].substring(index2+1);
  int index3=arr[3].indexOf("=");
  stroke_width=arr[3].substring(index3+1);
              String file= ("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" +
                    "\n" +
                    "<svg width=\"800\" height=\"600\">\n"+
                    "<circle cx=\""+cx+"\" cy=\""+cy+"\" r=\""+r+"\" stroke=\"green\" stroke-width=\""+stroke_width+"\" fill=\"yellow\" />\n"+
            "</svg>\n" +
                    "</body>\n" +
                    "</html>");
            t.sendResponseHeaders(200, file.length());// http статус код (200-ок)
            PrintWriter writer = new PrintWriter(t.getResponseBody());// подготовка инструмента для записи данных в ответ
            writer.write(file);// заисываем респонс

            writer.close();//заканчиваем
        }
    }

    static class MainHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException { //переменная t хранит запрос и ответ на него
            //String response = "Response to address " + t.getRequestURI();//создается текст ответа на запрос get..хранит то, что пишем в адресной строке

            String file= "<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>Title</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<form action=\"/circle\">\n" +
                    "    <input type=\"range\" name=\"cx\" min=\"0\" max=\"800\"><br>\n" +
                    "    <input type=\"range\" name=\"cy\" min=\"0\"max=\"600\"><br>\n" +
                    "    <input type=\"range\" name=\"r\" min=\"0\"max=\"1000\"><br>\n" +
                    "    <input type=\"range\" name=\"stroke-width\" min=\"0\" max=\"10\"><br>\n" +
                    "    <input type=\"submit\" value=\"Submit\">\n" +
                    "</form>\n" +
                    "</body>\n" +
                    "</html>";
            t.sendResponseHeaders(200, file.length());// http статус код (200-ок)
            PrintWriter writer = new PrintWriter(t.getResponseBody());// подготовка инструмента для записи данных в ответ
            writer.write(file);// заисываем респонс

            writer.close();//заканчиваем
        }
    }

}

