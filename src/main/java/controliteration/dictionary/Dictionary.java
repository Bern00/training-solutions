package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Dictionary {

    private List<DictionaryItem> dictionaryItems = new ArrayList<>();

    public void addItem(String word, List<String> translations) {

        DictionaryItem dictionaryItem = new DictionaryItem(word, translations);

        if(!dictionaryItems.contains(dictionaryItem)) {
            dictionaryItems.add(dictionaryItem);
        }

    }

    public List<String> findTranslations(String szo) {

        for(DictionaryItem dictionaryItem: dictionaryItems) {

            if(dictionaryItem.getWord().equals(szo)) {
                return dictionaryItem.getTranslations();
            }

        }
        return new ArrayList<>();
    }


    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();

        List<String> i = Arrays.asList("big", "huge");
        dictionary.addItem("nagy", i);

        List<String> j = Arrays.asList("small", "little", "tiny");
        dictionary.addItem("kicsi", j);

        System.out.println(dictionary.findTranslations("értelem").toString());

    }


}
