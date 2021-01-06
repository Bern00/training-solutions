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

            int number = Integer.parseInt(s.substring(s.length() - 3).substring(1, 2));

            String skillName = s.substring(0, s.length() - 4).trim();
            Skill sk = new Skill(skillName, number);
            this.skills.add(sk);
            System.out.println(skillName);
        }
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public int findSkillLevelByName(String s) throws SkillNotFoundException {
        for (Skill skill: skills) {
            if(skill.getName().equalsIgnoreCase(s)) {
                return skill.getLevel();
            }
        }
        throw new SkillNotFoundException(s);
    }

}
