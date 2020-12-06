package controlselection.month;

public class DayInMonth {

    public int napopkSzama(int year, String month) {

        String monthName = month.toUpperCase();
        int szam;

        if(year%4 != 0) {
            switch(monthName) {
                case "JANUÁR":
                case "MÁRCIUS":
                case "MÁJUS":
                case "JÚLIUS":
                case "AUGUSZTUS":
                case "OKTÓBER":
                case "DECEMBER":
                    szam = 31;
                    break;
                case "FEBRUÁR":
                case "JÚNIUS":
                case "SZEPTEMBER":
                case "NOVEMBER":
                    szam = 30;
                    break;
                case "ÁPLIRIS":
                    szam = 28;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid month: " + month);
            }
        } else {
            switch(monthName) {
                case "JANUÁR":
                case "MÁRCIUS":
                case "MÁJUS":
                case "JÚLIUS":
                case "AUGUSZTUS":
                case "OKTÓBER":
                case "DECEMBER":
                    szam = 31;
                    break;
                case "FEBRUÁR":
                case "JÚNIUS":
                case "SZEPTEMBER":
                case "NOVEMBER":
                    szam = 30;
                    break;
                case "ÁPLIRIS":
                    szam = 29;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid month: " + month);
            }
        }

        return szam;
    }

    public static void main(String[] args) {
        DayInMonth dayInMonth = new DayInMonth();
        System.out.println(dayInMonth.napopkSzama(1760, "ÁplIRis"));
    }
}
