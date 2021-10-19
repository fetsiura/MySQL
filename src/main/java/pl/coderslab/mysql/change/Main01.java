package pl.coderslab.mysql.change;

public class Main01 {
    String str = "alter table tickets add  priceUSD DECIMAL(10,2);\n" +
            "alter table movies add director char(80);\n" +
            "alter table movies modify director varchar(50);\n" +
            "alter table tickets drop priceUSD;";
}
