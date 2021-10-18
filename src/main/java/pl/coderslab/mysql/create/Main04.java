package pl.coderslab.mysql.create;

public class Main04 {

    public static void main(String[] args) {
        String str = "create table cinemas (\n" +
                "    id int AUTO_INCREMENT primary key ,\n" +
                "    name VARCHAR(255),\n" +
                "    address VARCHAR(255)\n" +
                ");\n" +
                "\n" +
                "create table movies(\n" +
                "    id int auto_increment primary key ,\n" +
                "    title VARCHAR(255),\n" +
                "    description VARCHAR(255),\n" +
                "    rating decimal(2)\n" +
                ");\n" +
                "\n" +
                "create table tickets(\n" +
                "    id int auto_increment primary key,\n" +
                "    quantity int,\n" +
                "    price decimal(2),\n" +
                "    status TINYINT\n" +
                ");\n" +
                "\n" +
                "create table payments (\n" +
                "    id int auto_increment primary key ,\n" +
                "    type VARCHAR(255),\n" +
                "    payment_date DATE\n" +
                ");";
    }
}
