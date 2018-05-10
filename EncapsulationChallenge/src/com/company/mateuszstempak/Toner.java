package com.company.mateuszstempak;

public class Toner {
    //Fields
    private double tonerLevel;

    //Constants for printing purpose
    private final double decreaseTonerLevelForSinglePage = 0.09;
    private final double decreaseTonerLevelForDuplexPage = 0.15;

    //Constructor
    public Toner(double tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    //Show toner level overall
    public void printTonerLevel() {
        System.out.printf("Toner level: %.1f percent.%n", getTonerLevel());
    }

    //Getter
    public double getTonerLevel() {
        return tonerLevel;
    }

    //Setter
    public void setTonerLevel(double tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    //Refill toner
    public void refillToner() {
        setTonerLevel(100.0);
        System.out.println("Refilling toner... \nState of toner: " + getTonerLevel() + " %.");
    }

    //Get constants for printing
    public double getDecreaseTonerLevelForSinglePage() {
        return decreaseTonerLevelForSinglePage;
    }

    public double getDecreaseTonerLevelForDuplexPage() {
        return decreaseTonerLevelForDuplexPage;
    }
}
