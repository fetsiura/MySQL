package pl.coderslab.mysql.onetomany;

public class Main01 {
    String str = "create table opinions (\n" +
            "    id int auto_increment ,\n" +
            "    product_id int,\n" +
            "    description VARCHAR(80),\n" +
            "    PRIMARY KEY (id),\n" +
            "    FOREIGN KEY (product_id)\n" +
            "                      REFERENCES products(id)\n" +
            ");\n" +
            "\n" +
            "select * from products;\n" +
            "select * from opinions;\n" +
            "\n" +
            "insert into products VALUES (2,'Juice', 'orange', 5.99);\n" +
            "\n" +
            "INSERT into opinions VALUES(3,2,'middle');\n";
}
