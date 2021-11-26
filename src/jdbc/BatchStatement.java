package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registration of driver

            Connection connection
                    = DriverManager.getConnection("jdbc:mysql://localhost:3306/java16sept", "root", "password");

            String insert = "insert into employee(id,name,address) values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insert);

            for (int i = 1; i <= 10; i++) {
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, "name=" + i);
                preparedStatement.setString(3, "address=" + i);
                preparedStatement.addBatch();
            }

            int[] arr = preparedStatement.executeBatch();
            System.out.println("Record added" + arr.length);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
