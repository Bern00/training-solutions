package controliteration;

public class Pi {

    private String pi =     "Nem a régi s durva közelítés,\n" +
                            "Mi szótól szóig így kijön\n" +
                            "Betűiket számlálva.\n" +
                            "Ludolph eredménye már,\n" +
                            "Ha itt végezzük húsz jegyen.\n" +
                            "De rendre kijő még tíz pontosan,\n" +
                            "Azt is bízvást ígérhetem ";

    public String piErteke() {

        String piErteke = "";
        int szamlalo = 0;

        for(int i = 0; i < pi.length(); i++) {

            if(pi.charAt(i) != ' ' && pi.charAt(i) != ',' && pi.charAt(i) != '.' && pi.charAt(i) != '\n') {
                szamlalo++;

            } else {
                piErteke = piErteke +""+ szamlalo;
                szamlalo = 0;
            }

            if(piErteke.length() == 1) {
                piErteke = piErteke + ",";
            }
        }
        return piErteke;
    }

    public static void main(String[] args) {
        Pi pi = new Pi();
        System.out.println(pi.piErteke());
    }
}
