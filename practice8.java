public class practice8 {
    public static void main(String[] args) {
        int h1=240;
        int h2=210;
        int h3=270;

        int max=(h1<h2)?(h2>h3?h2:h3):(h1>h3?h1:h3);
        System.out.println(max);
    }
}
