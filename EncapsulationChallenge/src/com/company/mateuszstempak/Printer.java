package com.company.mateuszstempak;

public class Printer {
    //Printer fields
    private Page page;
    private Sheet sheet;
    private Toner toner;
    private PrintPage printPage;
    private PrintDuplex printDuplex;
    private ScanDocs scanDocs;

    //Constructor
    public Printer(Page page, Sheet sheet, Toner toner, PrintPage printPage, PrintDuplex printDuplex, ScanDocs scanDocs) {
        this.toner = toner;
        this.printPage = printPage;
        this.printDuplex = printDuplex;
        this.scanDocs = scanDocs;
        this.sheet = sheet;
        this.page = page;
    }

    //Start or close Printer
    public void onOff (boolean switchOnOff) {
        if (switchOnOff == true)
            System.out.println("Printer is ready to work.");
        else
            System.out.println("Closing printer...\nPrinter closed.");
    }

    //Print state of a Printer object
    public void printPrinterState() {
        toner.printTonerLevel();
        page.printPagesUsed();
        sheet.printSheetsUsed();
    }

    //Getters and Setters
    public Toner getToner() {
        return toner;
    }

    public PrintPage getPrintPage() {
        return printPage;
    }

    public PrintDuplex getPrintDuplex() {
        return printDuplex;
    }

    public ScanDocs getScanDocs() {
        return scanDocs;
    }
}
