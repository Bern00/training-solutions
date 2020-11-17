package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        Performance performance = new Performance(LocalDate.of(2020, 5, 24),
                "Queen",
                LocalTime.of(20, 15),
                LocalTime.of(22, 30));

        System.out.println(performance.getInfo());
    }
}
