
import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你衣服的时髦程度:");
        int degree1=sc.nextInt();
        System.out.println("请输入你相亲对象衣服的时髦程度:");
        int degree2=sc.nextInt();
        /* if(degree1>degree2)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        } */
       boolean result=degree1>degree2;
       System.out.println(result);
    }
}
