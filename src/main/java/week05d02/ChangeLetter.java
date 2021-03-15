package week05d02;

public class ChangeLetter {

    public String changeVowels(String str) {
        StringBuilder starredWord = new StringBuilder();
        for(char c: str.toCharArray()) {
            if(englishVowel(c)){
                starredWord.append('*');
            } else {
                starredWord.append(c);
            }

        }
        return starredWord.toString();
    }

    private boolean englishVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ChangeLetter changeLetter = new ChangeLetter();
        System.out.println(changeLetter.changeVowels("Nincsen olyan név, hogy adambatyam. Hahahaha"));
    }
}
