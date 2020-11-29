package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {

        Integer proba = new Integer(1) + new Integer(2);

        PrimitiveTypes primitiveTypes = new PrimitiveTypes();
        String szamKettesSzamrendszerben = primitiveTypes.toBinaryString(53);
        System.out.println(szamKettesSzamrendszerben);
        System.out.println(Integer.toBinaryString(53).equals(szamKettesSzamrendszerben));

        System.out.println(proba);

    }
}
