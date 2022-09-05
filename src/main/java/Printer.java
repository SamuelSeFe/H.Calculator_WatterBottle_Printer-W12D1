public class Printer {

    private int numOfSheetsLeft;

    private int toner;

    public Printer(int _numOfSheetsLeft, int _toner){
        this.numOfSheetsLeft = _numOfSheetsLeft;
        this.toner = _toner;
    }

    public int getPaperLeft(){return this.numOfSheetsLeft;}
    public int getTonerLeft(){return this.toner;}


    public boolean canPrint(int copies, int pagesInCopy){
        if (this.numOfSheetsLeft >= copies && this.toner >= pagesInCopy*copies){
            return true;
        } else {
            return false;
        }
    }

    public void print(int copies, int pagesInCopy) {
        if (this.numOfSheetsLeft >= copies*pagesInCopy && this.toner >= pagesInCopy*copies) {
            this.numOfSheetsLeft = this.numOfSheetsLeft - (copies*pagesInCopy);
            this.toner = this.toner - (copies*pagesInCopy);
        }
    }

}
