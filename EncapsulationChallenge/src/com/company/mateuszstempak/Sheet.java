package com.company.mateuszstempak;

public class Sheet {
    //Field
    private int sheetsUsed;

    //Constructor
    public Sheet(int sheetsUsed) {
        this.sheetsUsed = sheetsUsed;
    }

    //Show sheets used overall
    public void printSheetsUsed() {
        System.out.println("Sheets used: " + getSheetsUsed());
    }

    //Setter
    public void setSheetsUsed(int sheetsUsed) {
        this.sheetsUsed = sheetsUsed;
    }

    //New set of sheets
    public void putNewSetOfSheet() {
        setSheetsUsed(1500);
        System.out.println("Putting new set of sheets... \nActual amount of sheets: " + getSheetsUsed() + ".");
    }

    //Getter
    public int getSheetsUsed() {
        return sheetsUsed;
    }
}
