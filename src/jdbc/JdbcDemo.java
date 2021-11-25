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

//            String insert = "insert into employee(id,name,address) values(1,'Suhas','pune')";
//            String update = "update employee set address='Mumbai' where id = 1";
            String delete = "delete from employee where  id = 1";

            int i = statement.executeUpdate(delete);
            System.out.println("Record updated=> " + i);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }
}
