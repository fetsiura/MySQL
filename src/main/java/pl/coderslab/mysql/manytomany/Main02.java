package pl.coderslab.mysql.manytomany;

public class Main02 {
String str ="create table cinemas_movies (\n" +
        "    id int auto_increment primary key ,\n" +
        "    cinema_id int not null,\n" +
        "    movie_id int not null ,\n" +
        "    FOREIGN KEY (cinema_id) REFERENCES cinemas(id),\n" +
        "    FOREIGN KEY (movie_id) REFERENCES movies(id)\n" +
        ");\n" +
        "\n" +
        "insert into cinemas_movies( cinema_id, movie_id) VALUES (1,1),(1,2),(1,3),(2,5),(2,6);";
}
