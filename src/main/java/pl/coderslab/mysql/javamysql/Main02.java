package pl.coderslab.mysql.javamysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main02 {
    public static void main(String[] args) {


        String insert = "INSERT into clients(name, surname) VALUES (?,?)";

        try(Connection connection = DBUtil.connect()){
            DBUtil.insert(connection,insert,"Leo","Messi");
            DBUtil.insert(connection,insert,"Cristiano","Ronaldo");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
