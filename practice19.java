
import java.util.Random;

public class practice19 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int sum=0;
        Random r=new Random();
        arr:for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(100)+1;
            System.out.println(arr[i]);
            sum+=arr[i];
        }
        double average=sum/10;
        System.out.println(average);
        int cnt=0;
        arr:for (int i = 0; i < arr.length; i++) {
            if(arr[i]<average){
                cnt++;
            }
        }
        System.out.println(cnt);

        //小技巧:打印时不换行
        arr:for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
