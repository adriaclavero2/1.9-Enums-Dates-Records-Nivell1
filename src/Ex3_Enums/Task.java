package Ex3_Enums;

public class Task {
    private String name;
    private Level level;

    public Task(String name, Level level) {
        this.name = name;
        this.level = level;
    }

    public void printTaskPriorityLevel() {
        System.out.println("Task: " + name +
                " → Level: " + level +
                " → Color: " + level.getColor());
    }
}