package Ex3_Enums;

public class Main {
    public static void main(String[] args) {
        Task t1 = new Task("Write documentation", Level.LOW);
        Task t2 = new Task("Fix bug", Level.MEDIUM);
        Task t3 = new Task("Deploy to production", Level.HIGH);

        t1.printTaskPriorityLevel();
        t2.printTaskPriorityLevel();
        t3.printTaskPriorityLevel();
    }
}