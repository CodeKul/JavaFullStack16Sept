package jdbc;

import java.sql.*;

public class SelectDemo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registration of driver

            Connection connection
                    = DriverManager.getConnection("jdbc:mysql://localhost:3306/java16sept", "root", "password");

            Statement statement = connection.createStatement();
            String str = "select * from employee";
            ResultSet rs = statement.executeQuery(str);
            ResultSetMetaData rms = rs.getMetaData();
            System.out.println(rms.getColumnName(1)+" "+rms.getColumnName(2)+ " "+rms.getColumnName(3));

            while (rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("address"));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
