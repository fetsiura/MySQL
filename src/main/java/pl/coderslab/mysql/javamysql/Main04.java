package pl.coderslab.mysql.javamysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main04 {

    public static String allSQL ="select * from cinemas";


    public static void main(String[] args) {


        try(Connection connection = DBUtil.connect()){

            DBUtil.printData(connection, allSQL,"name");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
