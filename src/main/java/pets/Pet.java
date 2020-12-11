package pets;

public class Pet {

    private String name;
    private int yearOfBirth;
    private String gender;
    private String registrationNumber;

    public Pet(String name, int yearOfBirth, String gender, String registrationNumber) {

        if(!gender.equals("unknown") || !gender.equals("male") || !gender.equals("female")) {
            throw new IllegalArgumentException("Gender is not valid.");
        }

        if(registrationNumber.length() != 6) {
            throw new IllegalArgumentException("Number is not valid.");
        }

        try{

            Integer.parseInt(registrationNumber);
        } catch (IllegalArgumentException ae) {
            throw new IllegalArgumentException();

        }

        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
