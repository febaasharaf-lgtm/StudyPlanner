package model;

public class Task {
    private String name;
    private int durationMinutes;
    private int timeSpent;

    public Task(String name, int durationMinutes) {
        this.name = name;
        this.durationMinutes = durationMinutes;
        this.timeSpent = 0;
    }

    public String getName() { return name; }
    public int getDurationMinutes() { return durationMinutes; }
    public int getTimeSpent() { return timeSpent; }

    public void addTimeSpent(int minutes) {
        this.timeSpent += minutes;
    }

    public double getProgress() {
        return (double) timeSpent / durationMinutes;
    }
}
