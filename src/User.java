import java.util.ArrayList;

abstract class User {
    private String userId;
    private String name;
    private String email;
    private ArrayList<LibraryItem> borrowedItems;

    public User(String userId, String name, String email){
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.borrowedItems = new ArrayList<>();
    }
    public String getUserId(){
        return userId;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getBorrowedItemsCount(){
        return BorrowedItems.size();
    }
    public void addBorrowedItem(LibraryItem item){
        borrowedItems.add(item);
    }
    public void removeBorrowedItems(LibraryItem item){
        borrowedItems.remove(item);
    }
    public void displayBorrowedItems() {
        for (LibraryItem item : borrowedItems) {
            System.out.println(item.getItemInfo());
        }
    }
    public abstract int getMaxBorrowLimit();

    private static class BorrowedItems {
        public static int size() {
            return 0;
        }
    }
}
