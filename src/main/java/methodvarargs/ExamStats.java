package methodvarargs;

public class ExamStats {

    private double maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {

        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }

        int aboveThePointLimit = 0;

        for (int point: results) {
            if( (point / maxPoints) *100 > limitInPercent) {
                aboveThePointLimit++;
            }
        }

        return aboveThePointLimit;

    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {

        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }

        double minPoint = maxPoints;

        for (int point: results) {
            if( point < minPoint) {
                minPoint = point;
            }
        }

        return minPoint < (limitInPercent * maxPoints) / 100;
    }

}
