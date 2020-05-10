package guess_num;

import java.util.Scanner;


public class Gustnum {
    public static void main(String[] args) {
        //    1 键盘录入
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入1-10整数");

        //    2 程序生成随机数
        int num = (int) (Math.random() * 10) + 1;

        while (true ){
            int guess = sc.nextInt();

            // 3 比较系统生成的随机数和猜的数字比较大小

            if (guess < num) {
                System.out.println("您猜小了");
            } else if (guess > num) {
                System.out.println("您猜大了");
            } else {
                System.out.println("恭喜您,猜对了");
                break;
            }
        }
    }
}
