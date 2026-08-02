public class Member extends User {
    final int MAX_BORROW_LIMIT = 5;

    public Member(String name, String contactInfo) {
        super(name, contactInfo);
    }

    @Override
    public void displayDashboard() {
        System.out.println("User ID: " + getUserId());
        System.out.println("Name: " + getName());
        System.out.println("ContactInfo: " + getContactInfo());
        System.out.println("Borrowed Books count: " + getBorrowedBooksCount());
    }

    @Override
    public boolean canBorrowBooks() {
        return getBorrowedBooksCount() < MAX_BORROW_LIMIT;

    }
}




