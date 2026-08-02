public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(){
        isAvailable=true;
    }

    public Book(String isbn, String title, String author){
        super();
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        isAvailable=true;

    }
    public Book(Book other){
        this(other.isbn,other.title,other.author);
    }
    public abstract void displayBookDetails();

    @Override
    public boolean lend(User user){
        if(isAvailable && user.canBorrowBooks()){
            isAvailable=false;
            user.borrowedBook();
            return true;
        }
        System.out.println("Book not available");
        return false;

    }

    @Override
    public void returnItem(User user){
        isAvailable=true;
        user.returnedBook();
        System.out.println("Book returned");
    }
    public boolean isAvailable(){
        return isAvailable;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
