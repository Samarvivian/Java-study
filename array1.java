public class array1 {
    public static void main(String[] args) {
        //数组动态初始化
        int[] arr=new int[3];
        arr[0]=1;
        arr[1]=2;

        //若没有赋值,则由虚拟机给出默认类型
        //整数:0
        //小数:0.0
        //布尔:false
        //字符:空格
        //引用:null
        arr:for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String[] arr1=new String[4];
        arr1[0]="张三";
        arr1:for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
