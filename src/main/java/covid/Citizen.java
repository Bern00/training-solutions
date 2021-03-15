package covid;

public class Citizen {

    private int pk;
    private String name;
    private int postalCode;
    private int age;
    private String email;
    private String ssn;

    public Citizen(String name, int postalCode, int age, String email, String ssn) {
        this.name = name;
        this.postalCode = postalCode;
        this.age = age;
        this.email = email;
        this.ssn = ssn;
    }

    public Citizen(int pk, String name, int postalCode, int age, String email, String ssn) {
        this.pk = pk;
        this.name = name;
        this.postalCode = postalCode;
        this.age = age;
        this.email = email;
        this.ssn = ssn;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
