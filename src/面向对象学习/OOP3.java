package 面向对象学习;


public class OOP3 {
    public static void main(String[] args) {

        // 创建对象，对象名为hello
        OOP3 hello = new OOP3();

        // 调用方法，传入两门课程的成绩
        double chengji = hello.calcAvg(94, 81);
        System.out.println(chengji);
    }

    /*
     * 功能：计算两门课程考试成绩的平均分并输出平均分
     * 定义一个包含两个参数的方法，用来传入两门课程的成绩
     */


    public double calcAvg(double num1,double num2 ){
        double avgs=(num1+num2)/2;
        return avgs ;
    }











}