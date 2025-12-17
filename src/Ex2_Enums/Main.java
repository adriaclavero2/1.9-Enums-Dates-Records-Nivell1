package Ex2_Enums;

public class Main {
    public static void main(String[] args) {
        Task t1 = new Task("Write documentation", Level.LOW);
        Task t2 = new Task("Fix bug", Level.MEDIUM);
        Task t3 = new Task("Deploy to production", Level.HIGH);

        t1.execute();
        t2.execute();
        t3.execute();
    }
}