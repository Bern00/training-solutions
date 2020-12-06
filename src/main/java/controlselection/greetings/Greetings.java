package controlselection.greetings;

import java.time.LocalTime;

public class Greetings {

    public String koszones(LocalTime localTime) {

        String kiiras = null;

        LocalTime time_5 = LocalTime.of(5, 0);
        LocalTime time_9 = LocalTime.of(9, 0);
        LocalTime time_18_30 = LocalTime.of(18, 30);
        LocalTime time_20 = LocalTime.of(20, 0);

        if(localTime.isAfter(time_5) && localTime.isBefore(time_9)) {
            kiiras = "Jó reggelt!";
        }

        if(localTime.isAfter(time_9) && localTime.isBefore(time_18_30)) {
            kiiras = "Jó napot!";
        }

        if(localTime.isAfter(time_18_30) && localTime.isBefore(time_20)) {
            kiiras = "Jó estét!";
        }

        if(localTime.isAfter(time_20) || localTime.isBefore(time_5)) {
            kiiras = "Jó éjt!";
        }

        return kiiras;
    }

    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        System.out.println(greetings.koszones(LocalTime.of(2, 35)));
    }
}
