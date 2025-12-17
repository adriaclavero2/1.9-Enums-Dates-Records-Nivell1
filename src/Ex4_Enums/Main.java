package Ex4_Enums;

public class Main {
    public static void main(String[] args) {

        convertStringToEnum("HIGH");

        convertStringToEnum("SUPER");
    }

    public static void convertStringToEnum(String input) {
        try {
            Level level = Level.valueOf(input.toUpperCase());
            System.out.println("Converted string '" + input + "' → Enum: " + level);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: '" + input + "' is not a valid Level.");
        }
    }
}