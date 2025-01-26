
import java.util.Scanner;

public class practice4 {

    public static void main(String[] args) {
        /* Scanner a1 = new Scanner(System.in);
        Scanner a2 = new Scanner(System.in);

        System.out.println("请输入两个整数");

        int s1 = a1.nextInt();
        int s2 = a2.nextInt();

        System.out.println(s1 + s2); */

        //方法二:
        Scanner a = new Scanner(System.in);

        System.out.println("请输入第一个数字");
        int s1 = a.nextInt();

        System.out.println("请输入第二个数字");
        int s2 = a.nextInt();

        System.out.println(s1 + s2);
    }
}
