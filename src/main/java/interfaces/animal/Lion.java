package interfaces.animal;

public class Lion implements Animal {
    private String name = "Lion";
    public static final int NUMBER_OF_LEGS = 4;

    @Override
    public int getNumberOfLegs() {
        return NUMBER_OF_LEGS;
    }

    @Override
    public String getName() {
        return name;
    }
}
