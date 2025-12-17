package Ex3_Enums;

public enum Level {
    LOW("Green"),
    MEDIUM("Yellow"),
    HIGH("Red");

    private final String color;

    // Constructor per assignar el color a cada nivell
    Level(String color) {
        this.color = color;
    }

    // Mètode per obtenir el color associat
    public String getColor() {
        return color;
    }
}


