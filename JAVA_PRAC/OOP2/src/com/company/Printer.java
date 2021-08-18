package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,boolean duplex){
        if(tonerLevel>=0 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }
        else{
            this.tonerLevel=-1;
        }
        this.duplex=duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            return this.tonerLevel += tonerAmount;
        }
        else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint=pages;

        if(true){
            this.pagesPrinted=this.pagesPrinted+pagesToPrint+2;
        }
        else{
            this.pagesPrinted+=pagesToPrint;
        }
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }

}
