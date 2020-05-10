package ReadBook;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadTxtFile {
    public static void main(String[] args) throws IOException {
        // 读文件
        Scanner in = new Scanner(Paths.get("src/ReadBook/yttl.txt"),"UTF-8");
        while (in.hasNextLine()){
            String m =in.nextLine();
            System.out.println(m);
        }
//        System.out.println(in);
        // 写文件
//        PrintWriter out = new PrintWriter("mytext.txt","UTF-8");

    }
}
