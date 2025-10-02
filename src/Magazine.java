public abstract class Magazine extends LibraryItem implements Borrowable {
    private int issueNumber;
    private String publicationMonth;
    private boolean isLatestIssue;

    public Magazine(String itemId, String title, String author, int issueNumber, String publicationMonth, boolean isLatestIssue) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
        this.publicationMonth = publicationMonth;
        this.isLatestIssue = isLatestIssue;
    }
    public int getIssueNumber() {
        return issueNumber;
    }
    public void setIssueNumber(int issueNumber) {
        if (issueNumber > 0) {
            this.issueNumber = issueNumber;
        }
    }
    public String getPublicationMonth() {
        return publicationMonth;
    }
    public void setPublicationMonth(String publicationMonth) {
        this.publicationMonth = publicationMonth;
    }
    public boolean isLatestIssue() {
        return isLatestIssue;
    }
    public void setLatestIssue(boolean isLatestIssue) {
        this.isLatestIssue = isLatestIssue;
    }
    @Override
    public String getItemType() {
        return "Magazine";
    }
    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 0.25;
    }
    @Override
    public void borrowItem(String borrowerName) {
        checkOut(borrowerName);
    }
    @Override
    public void returnItem() {
        checkIn();
    }
    @Override
    public boolean isAvailable() {
        return !isCheckedOut;
    }
    @Override
    public int getBorrowingPeriod() {
        return 7; // Magazines can be borrowed for 7 days
    }
}