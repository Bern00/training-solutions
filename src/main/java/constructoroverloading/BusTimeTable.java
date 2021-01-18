package constructoroverloading;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable;

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        List<SimpleTime> generatedTimeTable = new ArrayList<>();
        for (int i = firstHour; i <= lastHour; i++) {
            generatedTimeTable.add(new SimpleTime(i, everyMinute));
        }
        timeTable = generatedTimeTable;
    }

    public SimpleTime nextBus(SimpleTime actual) {

        for(int i = 0; i < timeTable.size(); i++) {
            if(timeTable.get(i).difference(actual) >= 0) {
                return timeTable.get(i);
            }
        }
        throw new IllegalArgumentException("No more buses today!");
    }
}