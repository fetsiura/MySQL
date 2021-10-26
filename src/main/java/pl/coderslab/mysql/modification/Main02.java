package pl.coderslab.mysql.modification;

public class Main02 {

    String str ="select * from movies where title like 'D%';\n" +
            "select * from tickets where price > 15.30;\n" +
            "select * from tickets where quantity >3;\n" +
            "select * from movies where rating > 6.5;\n" +
            "select * from movies order by rating desc limit 1;";

}
