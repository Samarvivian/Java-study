
import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        //键盘录入一个三位数,输出它的个位\十位\百位在控制台
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int a=s.nextInt();

        /* int temp=a;
        while(temp>0)
        {
            System.out.println(temp%10);
            
            temp/=10;
        } */

        int num1=a%10;
        System.out.println("个位是:"+num1);

        int num2=a/10%10;
        System.out.println("十位是:"+num2);

        int num3=a/100%10;
        System.out.println("百位是:"+num3);
    }
}
