package week03d04;

public class PhoneParser {

    public Phone parse(String str) {

        if(!str.contains("-")) {
            throw new IllegalArgumentException("No hyphen");
        }

        String[] numbers = strSplit(str);
        String prefix = numbers[0];
        String number = numbers[1];

        Phone phone = new Phone(prefix, number);
        return phone;
    }

    private String[] strSplit(String str) {
        String[] numbers = str.split("-");
        if(numbers.length != 2 || !parseStringToInteger(numbers[0]) || !parseStringToInteger(numbers[1])) {
            throw new IllegalArgumentException("Cannot be converted to a number");
        }
        return numbers;
    }

    private boolean parseStringToInteger(String str) {
        try {
            int number = Integer.parseInt(str);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }

    }

    public static void main(String[] args) {
        PhoneParser phoneParser = new PhoneParser();
        System.out.println(phoneParser.parse("225478963-").toString());
    }
}
