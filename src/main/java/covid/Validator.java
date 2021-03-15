package covid;

public class Validator {

    SettlementDao settlementDao;

    public Validator(SettlementDao settlementDao) {
        this.settlementDao = settlementDao;
    }

    private boolean isEmpty(String str) {
        return str != null && "".trim() != str;
    }

    private String settlementName(int postalCode) {
        if(isEmpty(settlementDao.findSettlementByPostalCode(postalCode))) {
            throw new IllegalArgumentException("This postal code does not exist!");
        }
        return settlementDao.findSettlementByPostalCode(postalCode);
    }

    private boolean validAge(int age) {
        return age > 10 && age < 150;
    }

    private boolean validEmail(String email) {
        return email.trim().length() >= 3 && email.equals("@");
    }

    private boolean validSsn(String ssn) {
        if(ssn.length() != 9) {
            throw new IllegalArgumentException("Invalid ssn.");
        }
        String ssnFirstEightNumber = ssn.substring(0, ssn.length() -2);
        int lastNumber = Integer.parseInt(ssn.substring(ssn.length() -1));

        return lastNumber == calculationFromSsn(ssnFirstEightNumber);
    }

    private int calculationFromSsn(String ssnFirstEightNumber) {
        int oddNumber = 0;
        int evenNumber = 0;
        for (int i = 0; i < ssnFirstEightNumber.length(); i++) {
            int number = Integer.parseInt(ssnFirstEightNumber.substring(i, i + 1));
            if(i%2 == 0) {
                oddNumber += number;
            }
            if(i%2 != 0) {
                evenNumber += number;
            }
        }
        return (oddNumber * 3 + evenNumber * 7) % 10;
    }
}
