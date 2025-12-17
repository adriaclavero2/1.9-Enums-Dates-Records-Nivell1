package Ex2_Enums;

public class Task {
    private String name;
    private Level level;

    public Task(String name, Level level) {
        this.name = name;
        this.level = level;
    }

    public void execute() {
        switch (level) {
            case LOW:
                System.out.println("Task: " + name + " → Executing with low priority.");
                break;
            case MEDIUM:
                System.out.println("Task: " + name + " → Executing with medium priority.");
                break;
            case HIGH:
                System.out.println("Task: " + name + " → Executing with HIGH priority!");
                break;
        }
    }
}