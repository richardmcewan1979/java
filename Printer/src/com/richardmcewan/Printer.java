package com.richardmcewan;



public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }


    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100 ) {
                return -1;
            }
            else {
                return this.tonerLevel += tonerAmount;
            }
        }
        return -1;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(duplex){
            pagesToPrint  = (pages/ 2) + (pages % 2);
            this.pagesPrinted = pagesToPrint;
            return pagesToPrint;
        } else {
            this.pagesPrinted = pagesToPrint;
            return pagesToPrint;
        }

    }

}