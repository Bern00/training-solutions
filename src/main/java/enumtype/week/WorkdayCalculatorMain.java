package enumtype.week;

import java.util.List;

public class WorkdayCalculatorMain {
    public static void main(String[] args) {

        WorkdayCalculator workdayCalculator = new WorkdayCalculator();
        List<DayType> dayTypes = workdayCalculator.dayTypes(Day.TUESDAY, 5);
        System.out.println(dayTypes);
    }
}
