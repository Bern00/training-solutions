package array;

public class ArrayMain {
    public static void main(String[] args) {

        String[] days = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        System.out.println(days[1]);
        System.out.println(days.length);

        int[] hatvany = new int[5];
        hatvany[0] = 1;

        for (int i = 1; i < hatvany.length; i++) {
            hatvany[i] = hatvany[i - 1] * 2;

        }
        for (int szam: hatvany) {
             System.out.println(szam);
        }

        boolean[] tomb = new boolean[6];
        tomb[0] = false;
        for (int i = 1; i < tomb.length; i++) {
            tomb[i] = !tomb[i - 1];
        }

        for (boolean dontes: tomb) {
            System.out.println(dontes);
        }




    }
}
