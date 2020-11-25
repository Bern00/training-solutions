package literals;

public class LiteralsMain {


    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        String c = a + "" + b;

        double quotient = 3D / 4;

        long big = 3_244_444_444L;

        String s = "árvíztűrőtükörfúrógép";
        String word = "title";

        Integer e = 1;
        Integer f = -2;


        System.out.println(c);
        System.out.println(quotient);
        System.out.println(big);
        System.out.println(word.toUpperCase());
        System.out.println(Integer.toBinaryString(f));
    }
}
