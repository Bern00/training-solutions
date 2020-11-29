package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {

        PrimitiveTypes primitiveTypes = new PrimitiveTypes();
        String szamKettesSzamrendszerben = primitiveTypes.toBinaryString(53);
        System.out.println(szamKettesSzamrendszerben);
        System.out.println(Integer.toBinaryString(53).equals(szamKettesSzamrendszerben));

    }
}
