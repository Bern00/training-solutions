package catalog;
/*
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AudioFeatures implements Feature{

    private List<String> composer;
    private int length;
    private List<String> performers;
    private String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        this.length = length;
        this.performers = performers;
        this.title = title;
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        this.composer = composer;
        this.length = length;
        this.performers = performers;
        this.title = title;
    }

    @Override
    public List<String> getContributors() {
        List<String> result = new ArrayList<>();
        Set<String> unionList = union(composer, performers);
        for(String s: unionList){
            result.add(s);
        }
        return result;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    private Set<String> union(List<String> first, List<String> second){
        Set<String> union = new HashSet<>();
        for(String s: first){
            union.add(s);
        }
        for(String s: second){
            union.add(s);
        }
        return union;
    }
}
*/