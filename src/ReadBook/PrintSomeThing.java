package ReadBook;

public class PrintSomeThing {
    public static void main(String[] args) {
    // 这条命令将以 x 对应的数据类型所允许的最大非 0 数字位数打印输出 X
        double x = 100000.0/3.0;
        System.out.print("1."+x);   //print的话没有换行,注意打印结果的结尾2.
        System.out.println("2."+" ");
        System.out.println("3."+x);
    // 可以用 8 个字符的宽度和小数点后两个字符的精度打印 x
        System.out.printf("%8.2f",x);
        System.out.println(" ");
    // 逗号标志增加了分组的分隔符
        System.out.printf("%,.2f",x);
    // String.format
        String name = "阿拉蕾";
        int     age = 18 ;
        System.out.println(" ");
        String message = String.format("Hello, %s. Next year , you'll be %d", name, age+1) ;
        System.out.println(message);
    }
}
