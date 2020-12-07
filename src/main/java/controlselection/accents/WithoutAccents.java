package controlselection.accents;

public class WithoutAccents {

    public String nincsekezet(String betu) {

        String betuEkezetNelkul = null;

        switch (betu.toUpperCase()) {
            case "Á":
                betuEkezetNelkul = "a";
                break;
            case "É":
                betuEkezetNelkul = "e";
                break;
            case "Í":
                betuEkezetNelkul = "i";
                break;
            case "Ó":
            case "Ö":
            case "Ő":
                betuEkezetNelkul = "o";
                break;
            case "Ú":
            case "Ü":
            case "Ű":
                betuEkezetNelkul = "u";
                break;
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "B":
            case "C":
            case "D":
            case "F":
            case "G":
            case "H":
            case "J":
            case "K":
            case "L":
            case "M":
            case "N":
            case "P":
            case "Q":
            case "R":
            case "S":
            case "V":
            case "W":
            case "X":
            case "Y":
            case "Z":
                betuEkezetNelkul = betu;
                break;
            default:
                throw new IllegalArgumentException("Invalid charcter: " + betu);
        }
        return betuEkezetNelkul;
    }

    public static void main(String[] args) {
        WithoutAccents withoutAccents = new WithoutAccents();
        System.out.println(withoutAccents.nincsekezet("á"));
    }
}
