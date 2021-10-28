package pl.coderslab.mysql.jointable;

public class Main05 {
String str ="select * from cinemas c\n" +
        "inner join cinemas_movies cm on c.id = cm.cinema_id\n" +
        "where movie_id=1;\n" +
        "\n" +
        "select * from movies m\n" +
        "inner join cinemas_movies cm on m.id = cm.movie_id\n" +
        "where cinema_id=1;";
}
