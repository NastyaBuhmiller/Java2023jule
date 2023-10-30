package com.company.http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;

public class Server1 {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0); //создает виртуальный порт с номером 8000
        server.createContext("/", new MyHandler()); //создаем путь к обработчику запросов
        server.setExecutor(null); // creates a default executor обязательная строка
        server.start(); //запуск сервера
    }

    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException { //переменная t хранит запрос и ответ на него
            String response = "Response to address " + t.getRequestURI();//создается текст ответа на запрос get..хранит то, что пишем в адресной строке
            t.sendResponseHeaders(200, response.length());// http статус код (200-ок)
            PrintWriter writer = new PrintWriter(t.getResponseBody());// подготовка инструмента для записи данных в ответ
            writer.write(response);// заисываем респонс
            writer.close();//заканчиваем
        }
    }

}
