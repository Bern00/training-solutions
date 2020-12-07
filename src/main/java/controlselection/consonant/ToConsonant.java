package controlselection.consonant;

public class ToConsonant {

    public String abc(String character) {

        String abcCharacter = null;

        switch (character.toUpperCase()) {
            case "A":
                abcCharacter = "b";
                break;
            case "E":
                abcCharacter = "f";
                break;
            case "I":
                abcCharacter = "j";
                break;
            case "O":
                abcCharacter = "p";
                break;
            case "U":
                abcCharacter = "v";
                break;
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
                abcCharacter = character;
                break;
            default:
                throw new IllegalArgumentException("Invalid charcter: " + character);
        }
        return abcCharacter;
    }

    public static void main(String[] args) {
        ToConsonant toConsonant = new ToConsonant();
        System.out.println(toConsonant.abc("k"));
    }
}
