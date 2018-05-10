package com.company.mateuszstempak;

public class PrintPage {
    //Fields
    private Toner toner;
    private Page page;
    private Sheet sheet;

    //Constructor
    public PrintPage(Toner toner, Page singlePage, Sheet sheet) {
        this.toner = toner;
        this.page = singlePage;
        this.sheet = sheet;
    }

    //printPage method
    public void printPage(int howMany) {

        //Local variable tonerLevel is equal to global toner level
        double tonerLevel = toner.getTonerLevel();

        //Sheets and Pages printed at one use of printPage method
        int sheetPrintedAtTime = 0;
        int pagesPrintedAtTime = 0;

        //Global value of pages printed and sheets used
        int pagesPrintedOverall = getPage().getPagesPrinted();
        int sheetUsedOverall = getSheet().getSheetsUsed();

        //Printing client request at loop
        for (int i = 1; i <= howMany; i++) {
            tonerLevel -= toner.getDecreaseTonerLevelForSinglePage();
            pagesPrintedAtTime++;
            sheetPrintedAtTime++;
        }

        //Local values added to overall variable
        pagesPrintedOverall += pagesPrintedAtTime;
        sheetUsedOverall += sheetPrintedAtTime;

        //Add overall values to global variables
        page.setPagesPrinted(pagesPrintedOverall);
        sheet.setSheetsUsed(sheetUsedOverall);
        toner.setTonerLevel(tonerLevel);

        //Print values of single printing
        System.out.printf("\n--STANDARD PRINTING--\n" + "Pages printed: %d. Sheets used: %d. Percent of toner left: %.2f%n%n",
                pagesPrintedAtTime, sheetPrintedAtTime, tonerLevel);

        //Refill toner if there is less than 10 percent of toner
        if (toner.getTonerLevel() < 10.0) {
            System.out.println("Less than 10% of toner. You have to refill toner.");
            toner.refillToner();
        }

        //Change sheets if there is more than 1500 sheets printed
        if (sheetUsedOverall > 1500) {
            System.out.println("Out of sheets.");
            sheet.putNewSetOfSheet();
        }
    }

    //Getters and Setters
    public Toner getToner() {
        return toner;
    }

    public Page getPage() {
        return page;
    }

    public Sheet getSheet() {
        return sheet;
    }
}
