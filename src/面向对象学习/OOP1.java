package 面向对象学习;


public class OOP1 {

    public static void main(String[] args) {

        // 创建名为hello的对象
        OOP1 hello = new OOP1();

        // 调用hello对象的calcAvg()方法，并将返回值保存在变量avg中
        double avg = hello.calcAvg();

        System.out.println("平均成绩为：" + avg);
    }

    // 定义一个返回值为double类型的方法
    public   double    calcAvg() {

        double java = 92.5;
        double php = 83.0;
        double avg = (java + php) / 2; // 计算平均值

        // 使用return返回值
        return avg ;

    }
}