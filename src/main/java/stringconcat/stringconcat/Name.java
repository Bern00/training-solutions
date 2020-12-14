package stringconcat.stringconcat;

public class Name {

    private String firstName;
    private String middleName;
    private String lastName;
    private Title title;

    public Name(String firstName, String middleName, String lastName, Title title) {

        if(isEmpty(firstName) || isEmpty(lastName)) {
            throw new IllegalArgumentException("Not valid information.");
        }

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.title = title;
    }

    public Name(String firstName, String middleName, String lastName) {

        if(isEmpty(firstName) || isEmpty(lastName)) {
            throw new IllegalArgumentException("Not valid information.");
        }

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String concatNameWesternStyle() {

        String totalName = "";

        if(title != null) {
            totalName = totalName.concat(title.getTitleString());
            totalName = totalName.concat(" ");
        }

        totalName = totalName.concat(firstName);
        totalName = totalName.concat(" ");

        if(!isEmpty(middleName)) {
            totalName = totalName.concat(middleName);
            totalName = totalName.concat(" ");
        }

        totalName = totalName.concat(lastName);

        return totalName;
    }

    public String concatNameHungarianStyle() {

        String totalName = "";

        if(title != null) {
            totalName += title.getTitleString() + " ";
        }

        totalName += lastName + " ";

        if(!isEmpty(middleName)) {
            totalName += middleName + " ";
        }

        totalName += firstName;

        return totalName;
    }

    public boolean isEmpty(String a) {
        return (a.equals("") || a == null);
    }

    public static void main(String[] args) {
        Name name = new Name("Ábel", "Áron", "Kiss", Title.DR);
        System.out.println(name.concatNameWesternStyle());
        System.out.println(name.concatNameHungarianStyle());
    }


}
