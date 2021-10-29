package pl.coderslab.mysql.javamysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main06 {

    final static String queryAVG = "SELECT AVG(rating) FROM movies";

    public static void main(String[] args) {

        try (Connection connection = DBUtil.connect()){

            double rating = AVG(connection,queryAVG, "AVG(rating)" );
            String query = "select * from movies where rating >"+rating;

            DBUtil.printData(connection,query,"title");


        }catch (SQLException e){
            e.printStackTrace();
        }
    }


    public static double AVG (Connection connection, String query, String tableName){

        double res =0;

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)){

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                res = resultSet.getDouble(tableName);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return res;
    }
}
