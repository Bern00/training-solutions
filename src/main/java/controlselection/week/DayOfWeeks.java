package controlselection.week;

public class DayOfWeeks {

    public String week(String day) {

        String weekDay = null;

        switch (day.toUpperCase()){
            case "Hétfő":
                weekDay = "Hét eleje";
                break;
            case "KEDD":
            case "SZERDA":
            case "CSÜTÖRTÖK":
                weekDay = "Hét közepe";
                break;
            case "PÉNTEK":
                weekDay = "Majdnem hétvége";
                break;
            case "SZOMBAT":
            case "VASÁRNAP":
                weekDay = "Hét vége";
                break;
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }
        return weekDay;
    }

    public static void main(String[] args) {
        DayOfWeeks dayOfWeeks = new DayOfWeeks();
        System.out.println(dayOfWeeks.week("szERdA"));
    }
}
