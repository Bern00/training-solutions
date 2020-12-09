package introexception.patient;

public class SsnValidator {

    public boolean isValidSsn(String socialSecurityNumber) {

        int a = 0;

        try {
            for(int i = 0; i < socialSecurityNumber.length() - 1; i++) {

                int b = Character.getNumericValue(socialSecurityNumber.charAt(i));

                if(b == -1 || b == -2) {
                    throw new ArithmeticException();
                }


                if(i%2 == 1) {

                    a = a + Character.getNumericValue(socialSecurityNumber.charAt(i)) * 3;

                } else {
                    a = a + Character.getNumericValue(socialSecurityNumber.charAt(i)) * 7;
                }
            }

            int c = Character.getNumericValue(socialSecurityNumber.charAt(8));

            if(c == -1 || c == -2) {
                throw new ArithmeticException();
            }

            if(socialSecurityNumber.length() == 9
                    && a%10 == c) {
                return true;
            } return false;

        } catch (ArithmeticException ae) {
            return false;
        }

    }
}
