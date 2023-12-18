import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.Callable;
import java.sql.*;
public class PostgresSelectCategory {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String query="select film_id, title from film";

        Class.forName("org.postgresql.Driver");//загрузка класса, который содержит драйвер СУБД. Делаем один раз за запуск
        Connection conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/dvdrental",
                "postgres","123");//открытие подключения к базе данных


        Statement stm=conn.createStatement(); //нужна для вызова executeQuery
        ResultSet resultSet=stm.executeQuery (query);//отправляет запрос на сервер СУБД, получает результат
        System.out.println("id\ttile");
        while (resultSet.next()){
            int id=resultSet.getInt("film_id");
            String title =resultSet.getString("title");
            System.out.println(id+"\t"+title);
        }
     resultSet.close();
        stm.close();
        conn.close();
    }
}
