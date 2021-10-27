package pl.coderslab.mysql.onetomany;

public class Main02 {

    String str = "select * from categories;\n" +
            "select * from categories_sub;\n" +
            "create table categories (\n" +
            "    id int auto_increment primary key ,\n" +
            "    name VARCHAR(80)\n" +
            ");\n" +
            "\n" +
            "create table categories_sub (\n" +
            "    id int auto_increment primary key ,\n" +
            "    main_id int REFERENCES categories(id),\n" +
            "    name varchar(80)\n" +
            ");";

}
