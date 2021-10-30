package pl.coderslab.mysql.javamysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main07 {

    public static final String query ="select * from cinemas";


    public static void main(String[] args) {
        showAllCinemas();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do yo like to do?");

        while (scanner.hasNextLine()){
            String input = scanner.nextLine();
            showAllCinemas();
            switch (input){
                case "e":
                    showAllCinemas();
                    edit();
                    break;
                case "x":
                    System.out.println("Bye");
                    System.exit(0);
                case "z":
                    showAllCinemas();
                    delete();
                    break;
                case "s":
                    showAllCinemas();
                    break;
                case "a":
                    showAllCinemas();
                    add();
                    break;
                default:
                    System.out.println("Select a correct option");
            }
            System.out.println("What do yo like to do?");
        }
    }

    public static void add (){
        String add = "insert into  cinemas(name, address) VALUES (?,?)";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name");
        String name = scanner.nextLine();

        System.out.println("Write address");
        String address = scanner.nextLine();
        try ( Connection connection = DBUtil.connect()){

            DBUtil.add(connection,add,name,address);
            System.out.println("Cinema added");
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
    public static void delete (){
        String delete = "delete from cinemas where id = ?";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write id");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("its not a number");
        }
        int id = scanner.nextInt();
        System.out.println("seriously ? Y or N");
        String answer = scanner.next();
        if(answer.equals("y")){
            try ( Connection connection = DBUtil.connect()){

                DBUtil.delete(connection,delete,id);
                System.out.println("Cinema deleted");
            }catch (SQLException e){
                e.printStackTrace();
            }
        }


    }
    public static void edit (){
        String update = "update cinemas set name = ? where id = ?";
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Write name");
        String name = scanner.nextLine();

        System.out.println("Write id");
        while (!scanner1.hasNextInt()){
            scanner1.next();
            System.out.println("its not a number");
        }
        int id = scanner1.nextInt();

        try ( Connection connection = DBUtil.connect()){

            DBUtil.edit(connection,update,name,id);
            System.out.println("Cinema updated");
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static void showAllCinemas(){

        try(Connection connection = DBUtil.connect()){

            printMovie(connection,query);

        }catch (SQLException e){
            e.printStackTrace();
        }
    }


    public static void printMovie(Connection conn, String query) throws SQLException {

        try (PreparedStatement statement = conn.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");

                System.out.println(id+". "+name+" "+address);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
