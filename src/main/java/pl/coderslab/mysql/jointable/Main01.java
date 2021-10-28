package pl.coderslab.mysql.jointable;

public class Main01 {
    String str = "select * from tickets join payments p on tickets.id = p.id\n" +
            "where type = 'cash';\n" +
            "\n" +
            "select * from tickets Left join payments p on tickets.id = p.id\n" +
            "where p.id is null;";
}
