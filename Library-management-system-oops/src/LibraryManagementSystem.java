import java.awt.image.CropImageFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class LibraryManagementSystem {
    private List<Book> bookInventory;
    private List<User> registeredUsers;

    public LibraryManagementSystem(){
        registeredUsers= new ArrayList<>();
        bookInventory=new ArrayList<>();

    }

    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }

    public List<Book> getBookInventory() {
        return bookInventory;
    }

    public void addBook(Book book){
        bookInventory.add(book);
    }
    public void registerUser(User user){
        registeredUsers.add(user);
    }
    public List<Book> searchBooks(String criteria){
        List<Book> result = new ArrayList<>();
        for(Book book:bookInventory){
            if(book.getTitle().toLowerCase().contains(criteria.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(criteria.toLowerCase())){
                result.add(book);
            }

        }
        return result;

    }
    public List<Book> searchBooks(String criteria, String type){
        List<Book> result = new ArrayList<>();
        List<Book> halfResult = searchBooks(criteria);
        for(Book book: halfResult){
            if(type.equalsIgnoreCase("TEXTBOOK")&& book instanceof TextBook){
               result.add(book);
            }
            else if(type.equalsIgnoreCase("NOVELBOOK")&& book instanceof NovelBook){
                result.add(book);
            }
        }
        return result;

    }

}
