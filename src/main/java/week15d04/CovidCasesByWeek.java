package week15d04;

public class CovidCasesByWeek implements Comparable<CovidCasesByWeek>{

    private String week;
    private int cases;


    public CovidCasesByWeek(String week, int cases) {
        this.week = week;
        this.cases = cases;
    }

    public String getWeek() {
        return week;
    }

    public int getCases() {
        return cases;
    }

    @Override
    public String toString() {
        return "CovidCasesByWeek{" +
                "week='" + week + '\'' +
                ", cases='" + cases + '\'' +
                '}';
    }

    @Override
    public int compareTo(CovidCasesByWeek o) {
        return o.cases - this.cases;
    }

}
