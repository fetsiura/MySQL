package pl.coderslab.mysql.manytomany;

public class Main01 {
String str = "create table products_orders(\n" +
        "    id int auto_increment primary key ,\n" +
        "    product_id int not null,\n" +
        "    order_id int not null ,\n" +
        "    FOREIGN KEY (product_id) REFERENCES products(id),\n" +
        "    FOREIGN KEY (order_id) REFERENCES orders(id)\n" +
        ");\n" +
        "\n" +
        "insert into products_orders(product_id, order_id) VALUES (1,2),(2,2);";
}
