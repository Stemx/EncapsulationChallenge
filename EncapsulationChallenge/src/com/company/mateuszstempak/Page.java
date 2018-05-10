package com.company.mateuszstempak;

public class Page {
    //Field
    private int pagesPrinted;

    //Constructor
    public Page(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    //Getter
    public int getPagesPrinted() {
        return pagesPrinted;
    }

    //Setter
    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    //Show pages printed overall
    public void printPagesUsed() {
        System.out.println("Printed pages: " + getPagesPrinted());
    }
}
