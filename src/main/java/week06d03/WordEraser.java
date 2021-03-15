package week06d03;

public class WordEraser {

    public String eraseWord(String words, String word){
        StringBuilder sb = new StringBuilder();
        String[] wordArray = words.split(" ");
        for(String str: wordArray){
            if(!str.equals(word)){
                sb.append(str + " ");
            }
        }
        return sb.toString().trim();
    }
}
