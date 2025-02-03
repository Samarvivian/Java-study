public class practice18 {
    public static void main(String[] args) {
        int[] arr={33,22,4,55};
        int max=arr[0];
        arr:for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
