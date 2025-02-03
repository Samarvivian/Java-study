public class practice16 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
