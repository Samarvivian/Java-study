public class basic1{
    public static void main(String[] args){
        //整数
        System.out.println(666);

        //小数
        System.out.println(13.14);

        //字符串
        System.out.println("helloworld");

        //字符
        System.out.println('a');

        //布尔
        System.out.println(true);
        System.out.println(false);

        //空
        //java不能直接打印空，只能用字符串来打印
        System.out.println("null");

        //制表符
        //将前面字符串的长度补齐到8的整数倍，至少补一个空格，至多补8个空格
        System.out.println("name"+"\t"+"age");
        System.out.println("vivian"+"\t"+"20");
    }
}