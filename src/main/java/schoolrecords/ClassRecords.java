package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        if(isEmpty(className)){
            throw new IllegalArgumentException();
        }
        this.className = className;
        this.rnd = rnd;
    }

    private boolean isEmpty(String s) {
        return s == null || "".equals(s.trim());
    }

    public boolean addStudent(Student student) {

        for(Student s: students) {
            if(s.getName().equalsIgnoreCase(student.getName())) {
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public boolean removeStudent(Student student) {
        for(Student s: students) {
            if(s.getName().equalsIgnoreCase(student.getName())) {
                students.remove(s);
                return true;
            }
        }
        return false;
    }

    public double calculateClassAverage() {
        if(students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }

        double number = 0;
        int counter = 0;
        for(Student s: students) {
            if(s.calculateAverage() > 0D) {
                number += s.calculateAverage();
                counter++;
            }

        }

        if(counter == 0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }

        return number / counter;


    }

    public double calculateClassAverageBySubject(Subject subject) {
        double number = 0;
        int counter = 0;
        for(Student s: students) {
            if(s.calculateSubjectAverage(subject) > 0D) {
                number += s.calculateSubjectAverage(subject);
                counter++;
            }

        }
        return number / counter;

    }

    public Student findStudentByName(String name) {
        if(students.isEmpty()) {
            throw new IllegalStateException("No students to search!");
        }


        if(isEmpty(name)){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        for(Student s: students) {
            if(s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    public Student repetition() {
        if(students.isEmpty()) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        int number = rnd.nextInt(students.size());
        return students.get(number);

    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> studyResultByNames = new ArrayList<>();
        for(Student s: students) {
            studyResultByNames.add(new StudyResultByName(s.getName(), s.calculateAverage()));
        }
        return studyResultByNames;
    }

    public String listStudentNames() {
        StringBuilder sb = new StringBuilder();
        String prefix = "";
        for(Student s: students) {
            sb.append(prefix);
            prefix = ", ";
            sb.append(s.getName());
        }
        return sb.toString();
    }

    public String getClassName() {
        return className;
    }
}
