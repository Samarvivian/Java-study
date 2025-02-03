
import java.util.Random;

public class random {
    public static void main(String[] args) {
        //生成随机数
        Random r=new Random();

        //小括号中一定是从0开始,到括号中的数-1
        int number=r.nextInt(100);//生成0-99

        //如果想要生成7-15呢
        //1.7-7=0,15-7=8;
        //bound:8 + 7
        int newnumber=r.nextInt(9)+7;
    }
}
