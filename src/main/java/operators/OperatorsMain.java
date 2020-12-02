package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();
        System.out.println(operators.isEven(5));

        System.out.println(Integer.toBinaryString(16 << 1));
        System.out.println(Integer.toBinaryString(16 >> 1));
        System.out.println(Integer.toBinaryString(13 << 1));
        System.out.println(Integer.toBinaryString(13 >> 1));

        String szamKettesbenTolva = operators.multiplyByPowerOfTwo(13, 3);
        System.out.println(szamKettesbenTolva);
    }
}
