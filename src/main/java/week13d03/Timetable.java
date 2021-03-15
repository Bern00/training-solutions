package week13d03;

public class Timetable {

    private String name;
    private String subject;
    private String group;
    private int numberOfHours;

    public Timetable(String name, String subject, String group, int numberOfHours) {
        this.name = name;
        this.subject = subject;
        this.group = group;
        this.numberOfHours = numberOfHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
