import java.awt.print.Book;

public class Librarian extends User {
    private String employeeNumber;


    void addNewBook(Book book){

    }
    void removeBook(Book book){

    }
    public Librarian(String name, String contactInfo, String employeeNumber){
        super(name,contactInfo);
        this.employeeNumber=employeeNumber;

    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    @Override
    public void displayDashboard() {
        System.out.println("User ID: "+getUserId());
        System.out.println("Name: "+getName());
        System.out.println("ContactInfo: "+getContactInfo());
        System.out.println("EmployeeNumber "+employeeNumber);
    }
}
