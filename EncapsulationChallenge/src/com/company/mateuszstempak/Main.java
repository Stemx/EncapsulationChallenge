package com.company.mateuszstempak;

public class Main {

    //Start application
    public static void main(String[] args) {
        //Create new Toner object
        Toner toner = new Toner(100);

        //Create new Page object
        Page page = new Page(0);

        //Create new Sheet object
        Sheet sheet = new Sheet(0);

        //Create new printPage object
        PrintPage printPage = new PrintPage(toner, page, sheet);

        //Create new printDuplex object
        PrintDuplex printDuplex = new PrintDuplex(toner, page, sheet);

        //Create new ScanDocs object
        ScanDocs scanDocs = new ScanDocs("A4");

        //Create new Printer object - main object of app
        Printer printer = new Printer(page, sheet, toner, printPage, printDuplex, scanDocs);

        //Invoked methods
        printer.onOff(true);
        printer.getPrintPage().printPage(10);
        printer.getPrintPage().printPage(10);
        printer.getPrintDuplex().printDuplexPage(10);
        printer.getPrintPage().printPage(100);
        printer.getPrintPage().printPage(259);
        printer.getPrintPage().printPage(342);
        printer.getPrintPage().printPage(300);
        printer.getPrintPage().printPage(2);
        printer.getPrintDuplex().printDuplexPage(300);
        printer.printPrinterState();
        printer.getScanDocs().scanDocument();
        printer.onOff(false);

        //Nadal nie zapamiętuje

    }
}
