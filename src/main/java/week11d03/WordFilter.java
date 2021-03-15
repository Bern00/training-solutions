package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c){

        if(words == null){
            throw new NullPointerException("Invalid parameter");
        }
        List<String> wordList = new ArrayList<>();
        for(String str: words){
            boolean putIn = false;
            for(char ch: str.toCharArray()){
                if(c == ch){
                    putIn = true;
                }
            }
            if(putIn){
                wordList.add(str);
            }
        }
        return wordList;
    }
}
