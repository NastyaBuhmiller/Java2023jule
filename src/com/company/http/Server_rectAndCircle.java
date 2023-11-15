//package com.company.http;
//
//import com.sun.net.httpserver.HttpExchange;
//import com.sun.net.httpserver.HttpHandler;
//import com.sun.net.httpserver.HttpServer;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.net.InetSocketAddress;
//import java.util.Scanner;
//
//public class Server_rectAndCircle {
//    public static void main(String[] args) throws Exception {
//        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0); //создает виртуальный порт с номером 8000
//        server.createContext("/rect", new RectHandler()); //создаем путь к обработчику запросов
//        server.createContext("/circle", new CircleHandler()); //создаем путь к обработчику запросов
//        server.createContext("/", new MainHandler()); //создаем путь к обработчику запросов
//        server.setExecutor(null); // creates a default executor обязательная строка
//        server.start(); //запуск сервера
//    }
//
//    public static String Head() {
//        return ("<!DOCTYPE html>\n" +
//                "<html>\n" +
//                "<head>\n" +
//                "<meta charset=\"utf-8\"/>\n" +
//                "<head/>\n");
//    }
//
//    public static String BodyCircle_open() {
//        return "<body>\n" +
//                "\n" +
//                "<h1>Круг</h1>\n" +
//                "<form action=\"/circle\">\n" +
//                "    <input type=\"range\" name=\"cx\" min=\"0\" max=\"800\"><br>\n" +
//                "    <input type=\"range\" name=\"cy\" min=\"0\"max=\"600\"><br>\n" +
//                "    <input type=\"range\" name=\"r\" min=\"0\"max=\"1000\"><br>\n" +
//                "    <input type=\"range\" name=\"stroke-width\" min=\"0\" max=\"10\"><br>\n" +
//                "    <input type=\"submit\" value=\"Submit\">\n" +
//                "</form>\n" +
//                "<h1>Прямоугольник</h1>\n" +
//                "<form action=\"/rect\">\n" +
//                "    <input type=\"range\" name=\"x\" min=\"0\" max=\"800\"><br>\n" +
//                "    <input type=\"range\" name=\"y\" min=\"0\"max=\"600\"><br>\n" +
//                "    <input type=\"range\" name=\"height\" min=\"0\"max=\"1000\"><br>\n" +
//                "    <input type=\"range\" name=\"width\" min=\"0\" max=\"1000\"><br>\n" +
//                "    <input type=\"submit\" value=\"Submit\">\n" +
//                "</form>\n";
//
//    }
//
//    static class MainHandler implements HttpHandler {
//        @Override
//        public void handle(HttpExchange t) throws IOException { //переменная t хранит запрос и ответ на него
//            GeneralHandler(t);
//            //String response = "Response to address " + t.getRequestURI();//создается текст ответа на запрос get..хранит то, что пишем в адресной строке
////            File f = new File("RES/Shapes.csv");
////            System.out.println(f.getAbsolutePath());
////            try {
////                if (!f.exists()) {
////                    f.createNewFile();
////                }
////                String head = Head();
////                String foot = Foot();
////                String bodyCircle_open = BodyCircle_open();
////                String body_close = Body_close();
////                String file;
////                Scanner s=new Scanner(f);
////                String line2 = Read(s);
////                    file = head
////                            + "<svg width=\"800\" height=\"600\">\n"
////                            + line2
////                            + "</svg>\n"
////                            + body_close
////                            + foot
////                    ;
////                    file =file+ head + bodyCircle_open +
////                            "<svg width=\"800\" height=\"600\">\n" + line2 +
////                            "</svg>\n" + body_close + foot;
////
////                t.sendResponseHeaders(200, file.getBytes().length);// http статус код (200-ок)
////                PrintWriter writer1 = new PrintWriter(t.getResponseBody());// подготовка инструмента для записи данных в ответ
////                writer1.write(file);// заисываем респонс
////                writer1.close();//заканчиваем
////
////            } catch (IOException e) {
////                e.printStackTrace();
////            }
////        }
//        }
//
//        static class CircleHandler implements HttpHandler {
//            @Override
//            public void handle(HttpExchange t) throws IOException { //переменная t хранит запрос и ответ на него
//                //String response = "Response to address " + t.getRequestURI();//создается текст ответа на запрос get..хранит то, что пишем в адресной строке
//                GeneralHandler(t);
////            File f = new File("RES/Shapes.csv");
////            System.out.println(f.getAbsolutePath());
////            try {
////                if (!f.exists()) {
////                    f.createNewFile();
////                }
////                PrintWriter writer_rect = new PrintWriter(new FileOutputStream(f, true));
////
////                String line = t.getRequestURI().getQuery();//cx=400&cy=300&r=200&stroke-width=5
////                String head = Head();
////                String foot = Foot();
////                String bodyCircle_open = BodyCircle_open();
////
////                String body_close = Body_close();
////                String file;
////                if (line == null) {
////                    Scanner s = new Scanner(f);
////                    String line2 = Read(s);
////                    file = head
////                            + "<svg width=\"800\" height=\"600\">\n"
////                            + line2
////                            + "</svg>\n"
////                            + body_close
////                            + foot
////                    ;
////                    file =file+ head + bodyCircle_open +
////                            "<svg width=\"800\" height=\"600\">\n" + line2 +
////                            "</svg>\n" + body_close + foot;
////                } else {
////                    String[] num = null;
////                    FromAdressLineCircleToWriter(line, writer_rect);
////                    writer_rect.close();
////                    Scanner s = new Scanner(f);
////                    String total = "";
////                    total = Read(s);
////                    file = head +
////                            "</svg>\n" + body_close + foot;
////                    file = file+head + bodyCircle_open +
////                            "<svg width=\"800\" height=\"600\">\n" + total +
////                            "</svg>\n" + body_close + foot;
////                }
////                t.sendResponseHeaders(200, file.getBytes().length);// http статус код (200-ок)
////                PrintWriter writer1 = new PrintWriter(t.getResponseBody());// подготовка инструмента для записи данных в ответ
////                writer1.write(file);// заисываем респонс
////                writer1.close();//заканчиваем
////
////            } catch (IOException e) {
////                e.printStackTrace();
////            }
////        }
//            }
//
//            static class RectHandler implements HttpHandler {
//                @Override
//                public void handle(HttpExchange t) throws IOException { //переменная t хранит запрос и ответ на него
//                    GeneralHandler(t);
//                    //String response = "Response to address " + t.getRequestURI();//создается текст ответа на запрос get..хранит то, что пишем в адресной строке
////            File f = new File("RES/Shapes.csv");
////            System.out.println(f.getAbsolutePath());
////            try {
////                if (!f.exists()) {
////                    f.createNewFile();
////                }
////                PrintWriter writer_rect = new PrintWriter(new FileOutputStream(f, true));
////
////                String line = t.getRequestURI().getQuery();//cx=400&cy=300&r=200&stroke-width=5
////                String x, y, height, width;
////                String head = Head();
////                String foot = Foot();
//////                String bodyRect_open = BodyRect_open();
////                String bodyCircle_open = BodyCircle_open();
////                String body_close = Body_close();
////                String file;
////                if (line == null) {
////                    Scanner s = new Scanner(f);
////                    String line2 = Read(s);
////                    file = head
//////                            + bodyRect_open
////                            + "<svg width=\"800\" height=\"600\">\n"
////                            + line2
////                            + "</svg>\n"
////                            + body_close
////                            + foot
////                    ;
////                    file =file+ head + bodyCircle_open +
////                            "<svg width=\"800\" height=\"600\">\n" + line2 +
////                            "</svg>\n" + body_close + foot;
////                } else {
////                    String[] num = null;
////                    FromAdressLineRectToWriter(line, writer_rect);
////                    writer_rect.close();
////                    Scanner s = new Scanner(f);
////                    String total = "";
////                    total = Read(s);
////                    file = head + //bodyRect_open +
////                            "</svg>\n" + body_close + foot;
////                    file = file+head + bodyCircle_open +
////                            "<svg width=\"800\" height=\"600\">\n" + total +
////                            "</svg>\n" + body_close + foot;
////                }
////                t.sendResponseHeaders(200, file.getBytes().length);// http статус код (200-ок)
////                PrintWriter writer1 = new PrintWriter(t.getResponseBody());// подготовка инструмента для записи данных в ответ
////                writer1.write(file);// заисываем респонс
////                writer1.close();//заканчиваем
////
////            } catch (IOException e) {
////                e.printStackTrace();
////            }
////        }
//                }
//
//                public static void GeneralHandler(HttpExchange t) throws IOException {
//                    File f = new File("RES/Shapes.csv");
//                    System.out.println(f.getAbsolutePath());
//                    try {
//                        if (!f.exists()) {
//                            f.createNewFile();
//                        }
//                        String head = Head();
//                        String foot = Foot();
//                        String bodyCircle_open = BodyCircle_open();
//                        String body_close = Body_close();
//                        String file;
//                        Scanner s = new Scanner(f);
//                        String line2 = Read(s);
//                    }
//                }
//
//
//                public static void RectAndCircle(HttpExchange t) throws IOException {
//                    File f = new File("RES/Shapes.csv");
//                    System.out.println(f.getAbsolutePath());
//                    String line = t.getRequestURI().getQuery();//cx=400&cy=300&r=200&stroke-width=5
//                    PrintWriter writer_rect = new PrintWriter(new FileOutputStream(f, true));
//                    String head = Head();
//                    String foot = Foot();
//                    String bodyCircle_open = BodyCircle_open();
//
//                    String body_close = Body_close();
//                    String file;
//                    if (line == null) {
//                        Scanner s = new Scanner(f);
//                        String line2 = Read(s);
//                        file = head
//                                + "<svg width=\"800\" height=\"600\">\n"
//                                + line2
//                                + "</svg>\n"
//                                + body_close
//                                + foot;
//                        file = file + head + bodyCircle_open +
//                                "<svg width=\"800\" height=\"600\">\n" + line2 +
//                                "</svg>\n" + body_close + foot;
//                    } else {
//                        String[] num = null;
//                        FromAdressLineCircleToWriter(line, writer_rect);
//                        writer_rect.close();
//                        Scanner s = new Scanner(f);
//                        String total = "";
//                        total = Read(s);
//                        file = head +
//                                "</svg>\n" + body_close + foot;
//                        file = file + head + bodyCircle_open +
//                                "<svg width=\"800\" height=\"600\">\n" + total +
//                                "</svg>\n" + body_close + foot;
//                    }
//                }
//            }
//
//            public static String Body_close() {
//                return "</body>\n";
//            }
//
//            public static String Foot() {
//                return "</html>";
//            }
//
//            public static String Rect(String[] args) {
//                String rect = "<rect x=\"" + args[1] + "\" y=\"" + args[2] + "\" height=\"" + args[3] + "\" stroke=\"green\" width=\"" + args[4] + "\" opacity=\"0.1" + "\" fill=\"yellow\" />\n";
//                return rect;
//            }
//
//            public static String Circle(String[] args) {
//                String circle = "<circle cx=\"" + args[1] + "\" cy=\"" + args[2] + "\" r=\"" + args[3] + "\" stroke=\"green\"  stroke-width=\"" + args[4] + "\" opacity=\"0.1" + "\" fill=\"yellow\" />\n";
//                return circle;
//            }
//
//            public static void FromAdressLineCircleToWriter(String line, PrintWriter writer_rect) {
//                String[] arr = line.split("&");
//                String cx, cy, r, stroke_width;
//                int index = arr[0].indexOf("=");
//                cx = arr[0].substring(index + 1);
//                int index1 = arr[1].indexOf("=");
//                cy = arr[1].substring(index1 + 1);
//                int index2 = arr[2].indexOf("=");
//                r = arr[2].substring(index2 + 1);
//                int index3 = arr[3].indexOf("=");
//                stroke_width = arr[3].substring(index3 + 1);
//                writer_rect.println("circle" + ";" + cx + ";" + cy + ";" + r + ";" + stroke_width);
//
//            }
//
//            public static void FromAdressLineRectToWriter(String line, PrintWriter writer_rect) {
//                String[] arr = line.split("&");
//                String x, y, height, width;
//                int index = arr[0].indexOf("=");
//                x = arr[0].substring(index + 1);
//                int index1 = arr[1].indexOf("=");
//                y = arr[1].substring(index1 + 1);
//                int index2 = arr[2].indexOf("=");
//                height = arr[2].substring(index2 + 1);
//                int index3 = arr[3].indexOf("=");
//                width = arr[3].substring(index3 + 1);
//                writer_rect.println("rect" + ";" + x + ";" + y + ";" + height + ";" + width);
//
//            }
//
//            public static String Read(Scanner s) {
//                String[] num;
//                String total = "";
//                while (s.hasNext()) {
//                    String line1 = s.nextLine();
//                    if (line1.isEmpty()) {
//
//                    } else {
//                        num = line1.split(";");
//                        if (num[0].equals("rect")) {
//                            total = total + Rect(num);
//                        } else {
//                            if (num[0].equals("circle")) {
//                                total = total + Circle(num);
//                            }
//                        }
//                    }
//                }
//                return total;
//            }
//        }
