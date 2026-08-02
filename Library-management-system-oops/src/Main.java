import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book b1 = new TextBook("ABC123","Basic Science", "Mr Kimi","Science",7);
        Book b2 = new NovelBook("NVL12121","Laws of Love","Mathew Love","Self help");
        Book b3 = new TextBook("NM123","Basic MATHS", "Mr Loiwaq","Maths",7);
        Book b4 = new NovelBook("NOOL2121","Stupidity ","Basel seed Love","Love");
        Book b5 = new TextBook("YBH1LL22"," Science for all", "Mr Moron","Science",7);
        Book b6 = new NovelBook("NSSS121","Thirsty crow","Partyl Love","Crime");
        Book b7 = new TextBook("ANNN3","Political Science", "Floror","Science",7);
        Book b8 = new NovelBook("NFGY121","Mean Love","Bozo","Mystery");


        LibraryManagementSystem library = new LibraryManagementSystem();
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addBook(b5);
        library.addBook(b6);
        library.addBook(b7);
        library.addBook(b8);

        b1.displayBookDetails();
        b2.displayBookDetails();
        b3.displayBookDetails();

        Member m1 = new Member("Taha Baba", "9876543210");
        Member m2 = new Member("Aisha Khan", "9876543211");
        Member m3 = new Member("Rahul Sharma", "9876543212");
        Member m4 = new Member("Zoya Ali", "9876543213");
        Member m5 = new Member("Arjun Patel", "9876543214");
        Member m6 = new Member("Sara Ahmed", "9876543215");
        Member m7 = new Member("Bilal Mir", "9876543216");
        Member m8 = new Member("Neha Kapoor", "9876543217");
        Member m9 = new Member("Imran Sheikh", "9876543218");
        Member m10 = new Member("Priya Verma", "9876543219");
        library.registerUser(m1);
        library.registerUser(m2);
        library.registerUser(m3);
        library.registerUser(m5);
        library.registerUser(m4);
        library.registerUser(m6);
        library.registerUser(m7);
        library.registerUser(m8);
        library.registerUser(m9);
        library.registerUser(m10);

        System.out.println("-------------------------------------");

        m1.displayDashboard();
        System.out.println("-------------------------------------");

        m5.displayDashboard();
        System.out.println("-------------------------------------");

        b1.lend(m2);
        m2.displayDashboard();
        m2.borrowedBook();
        m3.borrowedBook();
        m2.displayDashboard();
        m3.displayDashboard();
        System.out.println("-------------------------------------");

        System.out.println(m3.canBorrowBooks());
        b2.lend(m2);
        b3.lend(m2);
        b5.lend(m2);

        b6.lend(m2);
        b6.lend(m3);

        System.out.println("-------------------------------------");

        m2.displayDashboard();
        System.out.println("-------------------------------------");

        List<Book> books = library.searchBooks("science");
        System.out.println(library.getBookInventory().size());
        for(Book book : books){
            book.displayBookDetails();
        }
        System.out.println("-------------------------------------");



    }

}