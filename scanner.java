//1.导包,要写在类上面

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        //2.创建对象
        Scanner a = new Scanner(System.in);

        System.out.println("请输入整数");

        //3.接收数据,Scanner只能接收整数
        int i = a.nextInt();
        System.out.println(i);
    }
}
