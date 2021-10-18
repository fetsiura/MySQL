package pl.coderslab.mysql.create;

public class Main02 {

    public static void main(String[] args) {
        String str = "create table products (\n" +
                "    id int AUTO_INCREMENT primary key ,\n" +
                "    name VARCHAR(255),\n" +
                "    description VARCHAR(255),\n" +
                "    price DECIMAL\n" +
                ");\n" +
                "\n" +
                "create table orders (\n" +
                "    id int AUTO_INCREMENT primary key ,\n" +
                "    description VARCHAR(255)\n" +
                ");\n" +
                "\n" +
                "create table  clients (\n" +
                "    id int auto_increment primary key,\n" +
                "    name VARCHAR(255),\n" +
                "    surname VARCHAR(255)\n" +
                ");";
    }
}
