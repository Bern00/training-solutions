package controliteration.dictionary;

import java.util.List;
import java.util.Objects;

public class DictionaryItem {

    private String word;
    private List<String> translations;

    public DictionaryItem(String word, List<String> translations) {
        this.word = word;
        this.translations = translations;
    }

    public void addTranslations(String word) {

        if(!translations.contains(word)){
            translations.add(word);
        }

    }

    public String getWord() {
        return word;
    }

    public List<String> getTranslations() {
        return translations;
    }

    @Override
    public boolean equals(Object obj) {
        return ((DictionaryItem)obj).getWord().equals(this.word);
    }
}
