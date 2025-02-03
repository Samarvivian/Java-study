public class array {
    public static void main(String[] args) {
        int[] arr1=new int[]{19,20,21,22};
        String[] arr2={"GD","大s","邓紫棋"};
        double[] arr3={1.94,2.01,3.09};
        //System.out.println(arr3);//[D@4617c264

        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
        //快速进行数组遍历:数组名:fori
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
