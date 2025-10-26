package ua.opnu;

public class TimeSpan {

    private int hours;
    private int minutes;

    public TimeSpan() {
        this.hours = 0;
        this.minutes = 0;
    }

    public TimeSpan(int minutes) {
        if (minutes < 0) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            this.hours = minutes / 60;
            this.minutes = minutes % 60;
        }
    }

    public TimeSpan(int hours, int minutes) {
        int totalMinutes = (hours * 60) + minutes;
        if (totalMinutes < 0) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            this.hours = totalMinutes / 60;
            this.minutes = totalMinutes % 60;
        }
    }

    public TimeSpan(TimeSpan other) {
        if (other == null) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            this.hours = other.hours;
            this.minutes = other.minutes;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public double getTotalHours() {
        return hours + minutes / 60.0;
    }

    public int getTotalMinutes() {
        return hours * 60 + minutes;
    }

    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0) return;

        int totalMinutes = this.getTotalMinutes() + (hours * 60) + minutes;
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    public void add(int minutes) {
        this.add(0, minutes);
    }

    public void add(TimeSpan timespan) {
        if (timespan == null) return;
        this.add(timespan.hours, timespan.minutes);
    }

    public void subtract(int hours, int minutes) {
        if (hours < 0 || minutes < 0) return;

        int totalMinutesThis = this.getTotalMinutes();
        int totalMinutesToSubtract = (hours * 60) + minutes;
        int resultMinutes = totalMinutesThis - totalMinutesToSubtract;

        if (resultMinutes < 0) {
            return;
        }

        this.hours = resultMinutes / 60;
        this.minutes = resultMinutes % 60;
    }

    public void subtract(int minutes) {
        this.subtract(0, minutes);
    }

    public void subtract(TimeSpan span) {
        if (span == null) return;
        this.subtract(span.hours, span.minutes);
    }

    public void scale(int factor) {
        if (factor <= 0) return;
        int totalMinutes = this.getTotalMinutes() * factor;
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }
}