
import java.util.Random;

public class practice21 {
    public static void main(String[] args) {
        //打乱数组元素的顺序
        int[] arr={1,2,3,4,5};
        Random r=new Random();
        int number=r.nextInt(arr.length);
        for(int i=0;i+number<arr.length;i++)
        {
            int temp=arr[i];
            arr[i]=arr[i+number];
            arr[i+number]=temp;
        }
        arr:for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
