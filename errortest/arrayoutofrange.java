package errortest;

public class arrayoutofrange {
    public static void main(String[] args) {
        //数组索引越界
        int[] arr={1,2,3,4,5};
        System.out.println(arr[10]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
        //at errortest.arrayoutofrange.main(arrayoutofrange.java:7)
    }
}
