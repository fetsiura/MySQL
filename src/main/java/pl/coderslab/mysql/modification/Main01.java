package pl.coderslab.mysql.modification;

public class Main01 {

    String str ="select count(*) from tickets;\n" +
            "\n" +
            "select type FROM payments group by type;\n" +
            "select * from payments;\n" +
            "select AVG(price) from tickets;\n" +
            "select * from payments limit 2,5;\n" +
            "select  type, count(*) as size from payments group by type having size >1;\n" +
            "\n" +
            "select SUM(quantity) from tickets where price > 23.15";

}
