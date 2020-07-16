package ReadBook;
import java.util.*;
public class ReadBook1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.nextLine();
//在这里， 使用 nextLine 方法是因为在输人行中有可能包含空格。要想读取一个单词（以空白符作为分隔符，) 就调用
        System.out.print("What is your 性别? ");
        String sex = in.next();
//        要想读取一个整数， 就调用 nextlnt 方法。
        System.out.print("How old are you? ");
        int age = in.nextInt();
//        与此类似，要想读取下一个浮点数， 就调用 nextDouble 方法。
        System.out.print("How tall are you? (m)");
        double tall = in.nextDouble();
// display output on console
        System.out.println("Hello, " + name +". 性别:"+sex+". Next year, you'll be " + (age + 1)+ ". 身高是:"+ tall);
    }
}

