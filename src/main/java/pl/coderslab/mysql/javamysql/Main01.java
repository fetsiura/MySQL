package pl.coderslab.mysql.javamysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main01 {

    public static void main(String[] args) {

        try (Connection connection = DBUtil.connect()){


        } catch (SQLException e){
            e.printStackTrace();
        }
    }

}
