package com.company.http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class Server_rect {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0); //создает виртуальный порт с номером 8000
        server.createContext("/", new Server_rect.MainHandler()); //создаем путь к обработчику запросов
        server.setExecutor(null); // creates a default executor обязательная строка
        server.start(); //запуск сервера
    }

    static class CircleHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException { //переменная t хранит запрос и ответ на него
            //String response = "Response to address " + t.getRequestURI();//создается текст ответа на запрос get..хранит то, что пишем в адресной строке
            String line = t.getRequestURI().getQuery();//cx=400&cy=300&r=200&stroke-width=5
            String x, y, height, width;
            String[] arr = line.split("&");
            int index = arr[0].indexOf("=");
            x = arr[0].substring(index + 1);
            int index1 = arr[1].indexOf("=");
            y = arr[1].substring(index1 + 1);
            int index2 = arr[2].indexOf("=");
            height = arr[2].substring(index2 + 1);
            int index3 = arr[3].indexOf("=");
            width = arr[3].substring(index3 + 1);
            String file = ("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" +
                    "\n" +
                    "<svg width=\"800\" height=\"600\">\n" +
                    "<rect x=\"" + x + "\" y=\"" + y + "\" height=\"" + height + "\" stroke=\"green\" width=\"" + width + "\" fill=\"yellow\" />\n" +
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
            File f = new File("RES/Rect.html");
            System.out.println(f.getAbsolutePath());
            try {
                if (!f.exists()) {
                    f.createNewFile();
                }
                PrintWriter writer_rect = new PrintWriter(new FileOutputStream(f,true));

                String line = t.getRequestURI().getQuery();//cx=400&cy=300&r=200&stroke-width=5
                String x, y, height, width;
                String head = ("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\"/>\n" +
                        "<head/>\n");
                String foot = "</html>";
                String body_open = "<body>\n" +
                        "\n" +
                        "<form action=\"/rect\">\n" +
                        "    <input type=\"range\" name=\"x\" min=\"0\" max=\"800\"><br>\n" +
                        "    <input type=\"range\" name=\"y\" min=\"0\"max=\"600\"><br>\n" +
                        "    <input type=\"range\" name=\"height\" min=\"0\"max=\"1000\"><br>\n" +
                        "    <input type=\"range\" name=\"width\" min=\"0\" max=\"1000\"><br>\n" +
                        "    <input type=\"submit\" value=\"Submit\">\n" +
                        "</form>\n";
                ;
                String body_close = "</body>\n";
                String file;
                if (line == null) {
                    file = head + body_open + body_close + foot;
                } else {
                    String[] arr = line.split("&");
                    int index = arr[0].indexOf("=");
                    x = arr[0].substring(index + 1);
                    int index1 = arr[1].indexOf("=");
                    y = arr[1].substring(index1 + 1);
                    int index2 = arr[2].indexOf("=");
                    height = arr[2].substring(index2 + 1);
                    int index3 = arr[3].indexOf("=");
                    width = arr[3].substring(index3 + 1);
                    writer_rect.println(x + ";" + y + ";" + height + ";" + width);
                    writer_rect.close();
                    Scanner s = new Scanner(f);

                    String[] num=null;
                    String total="";
                    while(s.hasNext()) {
                        String line1=s.nextLine();
                        num = line1.split(";");
                        total=total+"<rect x=\"" + num[0] + "\" y=\"" + num[1] + "\" height=\"" + num[2] + "\" opacity=\"0.1"+"\" stroke=\"green\" width=\"" + num[3] + "\" fill=\"yellow\" />\n" ;
                    }
                    file = head + body_open +
                            "<svg width=\"800\" height=\"600\">\n" +
                            "<rect x=\"" + x + "\" y=\"" + y + "\" height=\"" + height + "\" stroke=\"green\" width=\"" + width +"\" opacity=\"0.1"+ "\" fill=\"yellow\" />\n" +
                           total+
                            "</svg>\n" + body_close + foot;
                }

                    t.sendResponseHeaders(200, file.length());// http статус код (200-ок)
                    PrintWriter writer1 = new PrintWriter(t.getResponseBody());// подготовка инструмента для записи данных в ответ
                    writer1.write(file);// заисываем респонс
                    writer1.close();//заканчиваем

                } catch(IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }


