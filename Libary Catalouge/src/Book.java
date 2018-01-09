public class Book {
    private String title ;
    private int pageCount;
    private int ISBN;
    private boolean isCheckedOut;
    private int dayCheckedOut = -1;

    Book(String bookTitle, int bookPageCount, int ISBN){
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = ISBN;
        isCheckedOut = false;
    }

    public String getTitle() {return this.title;}

    public int getPageCount() {return this.pageCount; }

    public int getISBN() {return this.ISBN;}

    public boolean getIsCheckedOut() {return this.isCheckedOut;}

    public int getDayCheckedOut() {return this.dayCheckedOut;}

    public void setIsCheckedOut(boolean newIscheckedOut, int currentDayCheckedOut){
        this.isCheckedOut = newIscheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }
    private void setDayCheckedOut(int day){
        this.dayCheckedOut = day;
    }
}
