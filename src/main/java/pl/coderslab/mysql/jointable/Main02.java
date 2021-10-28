package pl.coderslab.mysql.jointable;

public class Main02 {
String str ="\n" +
        "select * from orders inner JOIN products_orders po on orders.id = po.order_id\n" +
        "where po.product_id =1;\n" +
        "\n" +
        "select * from products INNER  join products_orders po on products.id = po.product_id\n" +
        "where po.order_id =1 ;";
}
