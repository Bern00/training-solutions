package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {


        Person firstVariable = new Person("Sanyi", 35);

        Person secondVariable = firstVariable;

        secondVariable.setName("Béla");

        System.out.println(firstVariable.getName());
        System.out.println(secondVariable.getName());

        int firstNumber = 24;
        int secondNumber = firstNumber;
        secondNumber++;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        secondVariable = new Person("Gizi", 14);

        System.out.println(firstVariable.getName());
        System.out.println(secondVariable.getName());

    }
}
