import java.util.ArrayList;

public class EmpManage {      //Detta är våran Employee-List

    static ArrayList<Book> books = new ArrayList<>();
    //Metoden för att addera böcker
    public static void addBook(){
        System.out.println("Enter name of book: ");
        String bookName = TestRun.lineInputMethod();

        System.out.println("Enter name of author: ");
        String authorName = TestRun.lineInputMethod();

        Book book = new Book(bookName, authorName);
        books.add(book);

        System.out.println("Book is created: " + book);

    }
    //Metoden för att radera bok efter namn
    public static void removeBookName(){
        System.out.println("Enter name to erase book: ");
        String name = TestRun.lineInputMethod();

        for (int i = books.size() -1; i >= 0; i--) {
            if (books.get(i).getBookName().equalsIgnoreCase(name)){
                books.remove(books.get(i));
            }
        }
    }
    //Metoden som raderar bok efter ID
    public static void removeBookId(){
        System.out.println("Enter ID to erase book: ");
        int iD = TestRun.intInputMethod();

        for (int i = books.size() -1; i >= 0; i--) {

            if (books.get(i).getId() == iD){
                books.remove(books.get(i));
            }
        }
    }
    //Metoden som visar bok efter ID
    public static void showBookId(){
        System.out.println("Search book by ID: ");
        int bookId = TestRun.intInputMethod();

        for (Book book : books) {

            if (book.getId() == bookId) {
                System.out.println("Result from ID-Search: " + book);
            }
        }
    }
    //Metoden för att uppdatera ett Boknamn
    public static void updateBookName(){
        System.out.println("Enter ID for book: ");
        int iD = TestRun.intInputMethod();

        for (Book book : books) {

            if (book.getId() == iD){
                System.out.println("Update name for book: ");
                String bookName = TestRun.lineInputMethod();
                book.setBookName(bookName);
                System.out.println("Book is now updated as: " + book);
            }else{
                System.out.println("Book ID not found!");
            }
        }
    }
    public static void numberOfBooks(){
        System.out.println("Number of books present in Library: " + books.size());
    }
    //Metoden för att visa alla böcker
    public static void showAllBooks(){
        System.out.println("All books present in Library: " + books);
    }
}

