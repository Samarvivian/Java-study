
import java.util.Scanner;

public class practice7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int num1=sc.nextInt();
        System.out.println("请输入第二个整数:");
        int num2=sc.nextInt();
        boolean res= num1==6||num2==6||(num1+num2)%6==0;
        System.out.println(res);
    }
}
