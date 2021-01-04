package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if(isEmpty(name)){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark) {
        if(mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateAverage() {

        if(marks.isEmpty()) {
            return 0.0;
        }
        double number = 0;
        for(Mark mark: marks) {
            number += mark.getMarkType().getValue();
        }

        return number / marks.size();

    }

    public double calculateSubjectAverage(Subject subject) {
        if(marks.isEmpty()) {
            return 0.0;
        }

        double sumNumber = 0;
        int countPerSubject = 0;
        for (Mark mark: marks) {
            if(mark.getSubject().getSubjectName().equalsIgnoreCase(subject.getSubjectName())) {
                sumNumber += mark.getMarkType().getValue();
                countPerSubject++;
            }
        }
        if(countPerSubject == 0) {
            return 0.0;
        }
        return sumNumber / countPerSubject;
    }


    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append(getName());
       sb.append(" ");
       sb.append("marks: ");
       for(Mark mark: marks) {
           sb.append(mark.getSubject().getSubjectName());
           sb.append(": ");
           sb.append(mark.getMarkType().getDescription());
           sb.append("(");
           sb.append(mark.getMarkType().getValue());
           sb.append(")");
       }
        return sb.toString();
    }

    private boolean isEmpty(String s) {
        return s == null || "".equals(s.trim());
    }
}
