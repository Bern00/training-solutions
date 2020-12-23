package stringbuilder;

public class NameBuilder {

    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public NameBuilder(String familyName, String middleName, String givenName, Title title) {

        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public NameBuilder(String familyName, String middleName, String givenName) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle() {

        StringBuilder name = new StringBuilder();

        if(title != null || !title.getTitleName().isBlank()) {

            name.append(title.getTitleName());
            name.append(" ");
        }

        if(givenName.isEmpty() || givenName == null) {
            throw new IllegalArgumentException("Given name must not be empty!");
        } else {
            name.append(givenName);
            name.append(" ");
        }

        if(middleName.isEmpty() || middleName == null) {
            name.append("");
        } else {
            name.append(middleName);
            name.append(" ");
        }

        if(familyName.isEmpty() || familyName == null) {
            throw new IllegalArgumentException("Family name must not be empty!");
        } else {
            name.append(familyName);
        }

        return name.toString();

    }

    public String concatNameHungarianStyle() {

        StringBuilder name = new StringBuilder();

        if(title != null) {

            name.append(title.getTitleName());
            name.append(" ");
        }

        if(familyName.isEmpty() || familyName == null) {
            throw new IllegalArgumentException("Invalid name!");
        } else {
            name.append(familyName);
            name.append(" ");
        }

        if(givenName.isEmpty() || givenName == null) {
            throw new IllegalArgumentException();
        } else {
            name.append(givenName);
        }

        if(!middleName.isEmpty() || middleName != null) {
            name.append(middleName);
        }

        return name.toString();

    }

    public String insertTitle(String name, Title title, String where) {
        StringBuilder sb = new StringBuilder(name);
        int index = sb.indexOf(where);

        if(index == -1) {
            sb.insert(0, (title.getTitleName() + " "));
        } else {
            sb.insert(index, (title.getTitleName() + " "));
        }

        return sb.toString();
    }

    public String deleteNamePart(String name, String delete) {

        int index = name.indexOf(delete);

        StringBuilder sb = new StringBuilder(name);
        sb.delete(index, index + delete.length());

        return sb.toString();
    }


    public static void main(String[] args) {
        NameBuilder nameBuilder = new NameBuilder("Kiss", "", "János", Title.DR);
        System.out.println(nameBuilder.concatNameWesternStyle());
        System.out.println(nameBuilder.concatNameHungarianStyle());
        System.out.println(nameBuilder.insertTitle("Kiss Árpád", Title.DR, "ú"));
        System.out.println(nameBuilder.deleteNamePart("Kiss Árpád", "ss"));
    }
}
