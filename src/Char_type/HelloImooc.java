package Char_type;
import java.util.Scanner;
public class HelloImooc {
    public static void main(String[] args) {
        char c = 'a';
        System.out.println(c);

//        定义一个数组,存储int格式
//        动态初始化,int数组,5个
        int[] arr = new int[5];
        System.out.println(arr);
//        数组赋值
        arr[0]=9;
        arr[1]=8;
        arr[2]=7;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("数组的长度:"+arr.length);


//       静态初始化
        char[] ch = {'a','b','c'};
        System.out.println(ch[0]);
        System.out.println(ch[1]);
        System.out.println(ch[2]);

        int[] a = new int[5];

        //为数组c的第3个元素赋值为'C'
        a[2]='C';

        //输出第3个元素的值
        System.out.println(a[2]);

        //用静态初始化方式创建一个整型数组b，值为1,2,3,4
        char[] b={'1','2','3','4'};

        //输出数组b的长度

        System.out.println(b.length);
        //输出数组b的第2个元素
        System.out.println(b[2]);


//        评分系统
//        1.使用数组存储正确的答案
        char[] answer={'A','B','C','D'};
//        2.存储我们录入的答案
        char[] youAn = new char[answer.length];
        Scanner sc = new Scanner(System.in);
        int number=0;

    for (int i = 0;i< answer.length;i++) {
//        3.创建键盘录入

        System.out.println("请输入您的答案...第"+(i+1)+"题");
        // A --"A"
        // A -- 'A'
        // tochararry  A--->char{'A'}
        char chars = sc.next().toCharArray()[0];

//        4.存储我们键盘录入答案
        youAn[i] = chars;
        if (youAn[i] == answer[i]){
            number++;
        }
    }
        System.out.println("答对个数:"+number+"; 得分是:"+number*2);
    }
}
