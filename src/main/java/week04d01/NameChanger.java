package week04d01;

public class NameChanger {
    private String fullName;

    public NameChanger(String fullName) {
        if(isEmpty(fullName)) {
            throw new IllegalArgumentException("Invalid name: " + fullName);
        }
        this.fullName = fullName;
    }

    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

    public void changeFirstName(String firstName) {

        String[] names = fullName.split(" ");
        this.fullName = firstName + " " + names[1];

    }

}
