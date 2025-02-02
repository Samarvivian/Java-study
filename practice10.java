
import java.util.Scanner;

public class practice10 {
    public static void main(String[] args) {
        int price=1000;
        Scanner sc=new Scanner(System.in);
        System.out.println(("请输入你的会员级别"));
        int degree=sc.nextInt();
        if(degree==1){
            System.out.println(price*0.9);

        } else if(degree==2){
            System.out.println(price*0.8);
        } else if(degree==3){
            System.out.println(price*0.7);
        } else{
            System.out.println("不打折");
        }

    }
}
