package ReadBook;

import java.io.Console;

public class ReadBook2 {

    public static void main(String[] args) {
        Console cons = System.console();
        System.out.println("1111111");
        String username = cons.readLine("User name");
        char[] passwd = cons.readPassword("Password");
    }
}
