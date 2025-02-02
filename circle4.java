public class circle4 {
    public static void main(String[] args) {
        double h=8844430;
        double h1=0.1;
        long cnt=0L;
        while(h1<h)
        {
            h1*=2;
            cnt++;
        }
        System.out.println(cnt);
    }
}
