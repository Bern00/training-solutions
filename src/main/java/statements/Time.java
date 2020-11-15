package statements;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getInMinutes() {
        return minutes + hours * 60;
    }

    public int getInSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public boolean earlierThan(Time other) {
        int thisTimeInSeconds = this.getInSeconds();
        int otherTimeInSeconds = other.getInSeconds();
        return thisTimeInSeconds < otherTimeInSeconds;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
