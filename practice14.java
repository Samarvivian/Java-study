
import java.util.Scanner;

public class practice14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个大于2的整数");
        int num=sc.nextInt();
        //下面这种方法是错的,若i恰好为num的平方根就没有问题,但如果不是,那么i*i>num不符合题意
        /* int i=1;
        while(i*i<num)
        {
            i++;
        }
        System.out.println(i); */

        for(int i=1;i<=num;i++)
        {
            if(i*i==num)
            {
                System.out.println(i);
                break;
            }
            else if(i*i>num)
            {
                System.out.println(i-1);
                break;
            }
        }
    }
}
