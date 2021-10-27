package pl.coderslab.mysql.onetoone;

public class Main03 {

    String str = "ALTER TABLE payments add constraint foreign key (id) REFERENCES tickets(id);\n" +
            "INSERT into payments (id, type, payment_date) VALUES (12, 'cash','2021-12-31');";

}
