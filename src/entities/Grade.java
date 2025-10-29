package entities;

public class Grade {
    public String name;
    public double scoreOne;
    public double scoreTwo;
    public double scoreThree;
    public double result;

    public String toString() {
        result = scoreOne + scoreTwo + scoreThree;
        if (result >= 60) {
            return "FINAL GRADE = "
                    + String.format("%.2f", result)
                    + "\nPASS";
        }
        else {
            return "FINAL GRADE = "
                    + String.format("%.2f", result)
                    + "\nFAILED"
                    + "\nMISSING "
                    + String.format("%.2f", (60 - result))
                    + " POINTS";
        }
    }
}
