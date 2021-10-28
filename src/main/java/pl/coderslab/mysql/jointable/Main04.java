package pl.coderslab.mysql.jointable;

public class Main04 {
String str ="select * from opinions RIGHT JOIN products p on p.id = opinions.product_id\n" +
        "where product_id=1;\n" +
        "\n" +
        "\n" +
        "select * from categories_sub cs\n" +
        "inner join categories c on cs.main_id = c.id\n" +
        "where c.id=4;";
}
