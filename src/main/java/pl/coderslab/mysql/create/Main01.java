package pl.coderslab.mysql.create;

public class Main01 {

    public static void main(String[] args) {
        String str = "CREATE database products_ex\n" +
                "CHARACTER SET utf8mb4\n" +
                "Collate utf8mb4_unicode_ci;\n" +
                "\n" +
                "use products_ex";
    }
}
