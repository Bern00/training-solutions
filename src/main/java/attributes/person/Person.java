package attributes.person;

public class Person {
    private String name;
    private String identificationCard;
    private Address address;

    public String personToString() {
        return name + " " + identificationCard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    public void correctData() {
        this.name = name;
        this.identificationCard = identificationCard;
    }


    public void moveTo(Address barmi) {
        address = barmi;
    }

    public Address getAddress() {
        return address;
    }

    public static void main(String[] args) {
        Person person = new Person();
        Address address = new Address("kiss", "Debrecen", "666", "1025");
        person.moveTo(address);
        person.getAddress();

    }
}
