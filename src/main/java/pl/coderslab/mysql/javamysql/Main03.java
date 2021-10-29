package pl.coderslab.mysql.javamysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main03 {
    public static String insertCinemaSQL ="insert into cinemas (name, address) VALUES (?,?)";


    public static void main(String[] args) {


        addCinema("Korona","ul. Niedwedzia");
    }

    static void addCinema(String name, String address){

        try(Connection connection = DBUtil.connect()){

            DBUtil.insert(connection,insertCinemaSQL,name,address);
            System.out.println("cinema added");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
