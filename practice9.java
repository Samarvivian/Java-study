
import java.util.Scanner;

public class practice9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你身上的钱");
        int money=sc.nextInt();
        if(money>=100){
            System.out.println("去网红餐厅");
        } else{
            System.out.println("去沙县小吃");
        }
    }
}
