package catalog;
/*
import java.util.ArrayList;
import java.util.List;

public class CatalogItem {

    private List<Feature> features;
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, List<Feature> features) {
        this.features = features;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int fullLengthAtOneItem(){
        int result = 0;

        for(Feature f: features){
            if(hasAudioFeature()){
                AudioFeatures audioFeatures = (AudioFeatures)f;
                result += audioFeatures.getLength();
            }
        }
        return result;
    }

    public List<String> getContributors(){
        List<String> result = new ArrayList<>();
        for(Feature f: features){
            result.addAll(f.getContributors());
        }
        return result;
    }

    public List<String> getTitles(){
        List<String> result = new ArrayList<>();
        for(Feature f: features){
            result.add(f.getTitle());
        }
        return result;
    }

    public boolean hasAudioFeature(){

        return feature instanceof AudioFeatures;
    }

    public boolean hasPrintedFeature(){
        return feature instanceof PrintedFeatures;
    }

    public int numberOfPagesAtOneItem(){
        int result = 0;
        for(Feature f: features){
            AudioFeatures audioFeatures = (AudioFeatures) f;
            result += audioFeatures.getLength();
        }
        return result;
    }

    public List<Feature> getFeatures(){
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
*/