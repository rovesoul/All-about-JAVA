package class_five_scores;

import java.util.Scanner;

public class Averagescore {
    public static void main(String[] args) {
        //        评分系统

        Scanner sc = new Scanner(System.in);
//        1.定义一个长度为5的double类型的数组score，用于存储成绩
        double[] scores=new double[5];

//        2.定义整型变量n，用于统计个数，值为1
        int n=0;
//        3.定义整型变量num，用于统计大于90分的成绩，值为0
        int num =0;
//        4、定义double类型变量sum，用于统计成绩的和，值为0.0
        double sum = 0.0;
//        5、使用for循环，从键盘接收数据为数组元素赋值，并进行成绩和大于90分的人数的统计。
        for(int i = 0;i< scores.length;i++){
            System.out.println("请输入第"+(i+1)+"题的成绩");
            double cool= sc.nextDouble();

            scores[i]=cool;

            if (cool>90){
                num++;
            }
            sum = sum+cool;
            n ++;
        }


        System.out.println("平均分数;"+sum);
        System.out.println("成绩大于90分人数:"+num);
        System.out.println("平均分数;"+sum/n);
    }
}
