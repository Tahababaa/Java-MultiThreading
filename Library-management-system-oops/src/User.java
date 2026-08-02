public abstract class User{
    private final String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers;
    private static int uniqueId=1000;
    private int borrowedBooksCount;
    private static  String genUniqueId(){
        return ("USR00"+uniqueId);
    }
    private User(){
        this.userId=genUniqueId();
        totalUsers++;
        uniqueId++;
    }
    public User(String name, String contactInfo){
        this();
        this.name=name;
        this.contactInfo=contactInfo;

    }
    public User(User other){
        this(other.name,other.contactInfo);

    }

    public void borrowedBook(){
        borrowedBooksCount++;
    }
    public void returnedBook(){
        borrowedBooksCount--;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getUserId() {
        return userId;
    }
    public int getTotalUsers(){
        return totalUsers;
    }
    public void setName(String name) {
        if(name!=null && !name.isEmpty()){
            this.name = name;
        }
        else{
            System.out.println("Invalid name entered");
        }
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();

    public static int getUniqueId() {
        return uniqueId;
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }
}


