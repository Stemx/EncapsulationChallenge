package com.company.mateuszstempak;

public class PrintDuplex {
    private Toner toner;
    private Page page;
    private Sheet sheet;

    public PrintDuplex(Toner toner, Page page, Sheet sheet) {
        this.toner = toner;
        this.page = page;
        this.sheet = sheet;
    }

    public void printDuplexPage(int howMany) {
        double tonerLevel = toner.getTonerLevel();
        int sheetPrintedAtTime = 0;
        int pagesPrintedAtTime = 0;
        int pagesPrintedOverall = page.getPagesPrinted();
        int sheetUsedOverall = sheet.getSheetsUsed();

        for (int i = 1; i <= howMany; i++) {
            tonerLevel -= toner.getDecreaseTonerLevelForDuplexPage();
            pagesPrintedAtTime++;
            sheetPrintedAtTime++;
        }

        sheetPrintedAtTime /= 2;

        pagesPrintedOverall += pagesPrintedAtTime;
        sheetUsedOverall += sheetPrintedAtTime / 2;
        page.setPagesPrinted(pagesPrintedOverall);
        sheet.setSheetsUsed(sheetUsedOverall);
        toner.setTonerLevel(tonerLevel);

        System.out.printf("\n--DUPLEX PRINTING--\n" + "Pages printed: %d. Sheets used: %d. Percent of toner left: %.2f%n%n",
                pagesPrintedAtTime, sheetPrintedAtTime, tonerLevel);


        if (toner.getTonerLevel() < 10.0) {
            System.out.println("Less than 10% of toner. You have to refill toner.");
            toner.refillToner();
        }

        if (sheetUsedOverall > 1500) {
            System.out.println("Out of sheets.");
            sheet.putNewSetOfSheet();
        }
    }

}
