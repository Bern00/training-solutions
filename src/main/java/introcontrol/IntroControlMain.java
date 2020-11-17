package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introcontrol = new IntroControl();
        int szam = introcontrol.subtractTenIfGreaterThanTen(18);
        System.out.println(szam);
        String zero = introcontrol.describeNumber(0);
        System.out.println(zero);
        String name = introcontrol.greetingToJoe("Joe");
        System.out.println(name);
        int sale = introcontrol.calculateBonus(520000);
        System.out.println(sale);
        int kolonbseg = introcontrol.calculateConsumption(3652, 9652);
        System.out.println(kolonbseg);

        introcontrol.printNumbers(12);
        introcontrol.printNumbersBetween(24, 31);
        introcontrol.printNumbersBetweenAnyDirection(12, 17);
        introcontrol.printNumbersBetweenAnyDirection(17, 12);
        introcontrol.printOddNumbers(8);
    }
}