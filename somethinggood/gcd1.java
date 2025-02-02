package somethinggood;

import java.util.Scanner;

public class gcd1 {
    public static void main(String[] args) {
        //给定两个正数,分别作为被除数与除数
        //在不使用乘号\除号\取余的情况下,求出它们的商与余数
        //思路:例如100与10
        //100-10=90
        //90-10=80
        //一直下去
        //就能找到商与余数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两个正数");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int shang=0;
        while(num1>=num2)
        {
            num1=num1-num2;
            shang++;
        }
        System.out.println("商:"+shang);
        System.out.println("余数:"+num1);
    }
}
