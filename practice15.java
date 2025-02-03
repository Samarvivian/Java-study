import java.util.Scanner;

public class practice15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个大于2的整数");
        int num=sc.nextInt();
        int i=2;
        for(i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println(num+"不是质数");
                break;
            }
        }
        if(i*i>num)
        {
            System.out.println(num+"是质数");
        }
    }
}
