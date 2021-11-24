package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registration of driver

            Connection connection
                    = DriverManager.getConnection("jdbc:mysql://localhost:3306/java16sept", "root", "password");

            Statement statement = connection.createStatement();

            String insert = "insert into employee(id,name,address) values(1,'Suhas','pune')";

            int i = statement.executeUpdate(insert);
            System.out.println("Record inserted=> " + i);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }
}
