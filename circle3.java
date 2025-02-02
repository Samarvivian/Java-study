
import java.util.Scanner;

public class circle3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两个数字");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2)
        {
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        int cnt=0;
        for(int i=num1;i<=num2;i++)
        {
            if(i%3==0&&i%5==0)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
