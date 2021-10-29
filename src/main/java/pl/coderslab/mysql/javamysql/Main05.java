package pl.coderslab.mysql.javamysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main05 {

    public static void main(String[] args) {


        try (Connection connection = DBUtil.connect()){
            DBUtil.remove( connection, "cinemas", 12);
            System.out.println("cinemas removed");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
