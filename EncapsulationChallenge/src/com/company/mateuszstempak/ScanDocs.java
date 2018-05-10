package com.company.mateuszstempak;

public class ScanDocs {

    //Field
    private String docSize;

    //Constructor
    public ScanDocs(String docSize) {

        if (docSize == "A3" || docSize == "A4" || docSize == "A5")
            this.docSize = docSize;
        else
            System.out.println("Inappropriate doc format.");
    }

    //Scan document
    public void scanDocument() {
        System.out.printf("\nScanning document... size %s%n%n", getDocSize());
    }

    //Private getter
    private String getDocSize() {
        return docSize;
    }

    //Setter
    public void setDocSize(String docSize) {
        this.docSize = docSize;
    }
}
