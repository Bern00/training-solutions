package localvariables;

public class DistanceMain {
    public static void main(String[] args) {

        Distance distance = new Distance(3.5, true);
        System.out.println(distance.getDistanceLnKm() +": "+ distance.isExact());

        int a = (int) distance.getDistanceLnKm();
        System.out.println(a);
    }
}
