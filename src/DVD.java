public abstract class DVD implements Borrowable {
    private int duration;
    private String rating;
    private String genre;

    public DVD(String itemId, String title, String author, int duration, String rating, String genre) {
        super();
        this.duration = duration;
        setRating(rating);
        this.genre = genre;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        if (duration > 0) {
            this.duration = duration;
        }
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        if (rating.equals("G") || rating.equals("PG") || rating.equals("PG-13") || rating.equals("R") || rating.equals("NC-17")) {
            this.rating = rating;
        }
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public String getItemType() {
        return "DVD";
    }
    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 1.00;
    }
    @Override
    public void BorrowItem(String borrowerName) {

    }
    @Override
    public void borrowItem(String borrowerName) {
        checkOut(borrowerName);
    }
    private void checkOut(String borrowerName) {
    }
    @Override
    public void returnItem() {
        checkIn();
    }
    private void checkIn() {
    }
    @Override
    public int getBorrowingPeriod() {
        return 5; // DVDs can be borrowed for 5 days
    }
    @Override
    public String getBorrowingStatus() {
        return "DVD: " + Borrowable.super.getBorrowingStatus();
    }
}
