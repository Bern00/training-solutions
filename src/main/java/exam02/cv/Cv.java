package exam02.cv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class Cv {

    private String name;

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    private List<Skill> skills = new ArrayList<>();

    public void addSkills(String... skill) {
        List<String> skills = Arrays.asList(skill);
        for(String s: skills) {

            int number = Integer.parseInt(s.substring(s.length() - 3).substring(1));
            String skillName = s.substring(0, s.length() - 4);
            Skill sk = new Skill(skillName, number);
            this.skills.add(sk);
        }
    }

    public List<Skill> getSkills() {
        return skills;
    }


}
