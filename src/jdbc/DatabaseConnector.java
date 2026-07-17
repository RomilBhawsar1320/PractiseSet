package jdbc;

import java.sql.*;
import java.util.Iterator;

public class DatabaseConnector {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:postgres://localhost:5432/nitordb",
                    "postgres",
                    "Priyanshi@1320");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employees");

            while (resultSet.next()) {
                String empname = resultSet.getNString(1);
                int empId = resultSet.getInt(2);
                int age = resultSet.getInt(3);
                System.out.println("EMP NAME " + empname + " his/her id " + empId + " age is " + age);
            }
            statement.close();
            resultSet.close();
            connection.close();


        }  catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
