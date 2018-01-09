import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

    private Map<String,Book> bookCollection;
    private int currentDay =0;

    private LibraryCatalogue(Map<String, Book> collection){
        this.bookCollection = collection;
    }

    private Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }

    private int getCurrentDay() {
        return this.currentDay;
    }

    private int getLengthOfCheckoutPeriod() {
        return 7;
    }

    private double getInitialLateFee() {
        return 0x1.0p-1;
    }

    private double getFeePerLateDay() {
        return 0x1.0p0;
    }
    private Book getBook(String bookTitle){
       return getBookCollection().get(bookTitle);
    }

    private void nextDay(){
        currentDay++;
    }
    private void setDay(int day){
        currentDay = day;
    }

    private void checkOutBook(String title){
       Book book = getBook(title);
       if(book.getIsCheckedOut()){
           sorryBookAlreadyCheckedOut(book);
       }else {
           book.setIsCheckedOut(true,currentDay);
           System.out.println("You just checked out " + title + ". It is due on day " +(getCurrentDay() + getLengthOfCheckoutPeriod()) + "." );
       }
    }
    private void returnBook(String title){
        Book book = getBook(title);
        int daysLate  = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if(daysLate > 0){
            System.out.println("You owe thr library $" + (getInitialLateFee() + daysLate * getFeePerLateDay()) + " because your book is " + daysLate + " days overdue. ");
        }else{
            System.out.println("Book returned. Thank You!");
        }
        book.setIsCheckedOut(false,-1);
    }
    private void sorryBookAlreadyCheckedOut(Book book){
        System.out.println("Sorry, " + book.getTitle() + " is already checked out. It should be back on day " + (book.getDayCheckedOut() + getLengthOfCheckoutPeriod()) + ".");
    }

    public static void main(String[] args) {
        Map<String,Book> bookCollection = new HashMap<>();
        Book harry = new Book("Harry Potter", 54354, 9999999);
        bookCollection.put("Harry Potter",harry );
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOutBook("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOutBook("Harry Potter");
    }

}
