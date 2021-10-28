package pl.coderslab.mysql.jointable;

public class Main03 {
String str ="\n" +
        "select * from products JOIN opinions o on products.id = o.product_id;\n" +
        "\n" +
        "select * from products LEFT JOIN opinions o on products.id = o.product_id;\n" +
        "\n" +
        "select * from opinions RIGHT JOIN products p on p.id = opinions.product_id\n" +
        "where product_id=1;";
}
