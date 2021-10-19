package pl.coderslab.mysql.change;

public class Main02 {
    String str = "use cinemas_ex;\n" +
            "\n" +
            "alter table movies add watchCount  int;\n" +
            "\n" +
            "alter table movies add isTop tinyint default 0;\n" +
            "\n" +
            "alter table cinemas add openTime TIMESTAMP;\n" +
            "alter table cinemas add closeTime TIMESTAMP;\n" +
            "describe cinemas;";
}
