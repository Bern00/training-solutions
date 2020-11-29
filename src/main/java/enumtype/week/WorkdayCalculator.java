package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    public List<DayType> dayTypes(Day firstDay, int numberOfDays) {
        System.out.println(firstDay + " " + numberOfDays);
        List<DayType> dayTypeList = new ArrayList<>();

        Day d = firstDay;

        for(int i = 0; i < numberOfDays; i++) {

            dayTypeList.add(d.getDayType());
            d = nextDay(d);
        }
        return dayTypeList;
    }



    private Day nextDay(Day day) {

        Day[] days = Day.values();

        if ( day.ordinal() != 6) {

           return days[day.ordinal() +1];

        } else return days[0];

    }
}
