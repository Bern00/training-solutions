package exam02.cv;

public class Skill {

    private String name;
    private int level;

    public Skill(String name, int level) {
        if(level > 5 || level < 1) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
