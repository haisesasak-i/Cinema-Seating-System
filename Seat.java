public class Seat {
    // attributes
    private int seatNumber;
    private static int seatCount;
    private boolean isBooked;
    private String customerName;
    static {
        seatCount = 0;
    } // as static block runs only if class is loaded in memory so it will
      // initialize the seatNumber variable

    public Seat() {
        this.customerName = "No Customer";
        this.isBooked = false;
        this.seatNumber = ++seatCount;
    }
    public void bookSeat(String customerName) {
        this.customerName = customerName;
        this.isBooked = true;
    }
    public void cancel() { this.isBooked = false; }
    @Override
    public String toString() {
        if (this.isBooked == true)
            return this.bookStatus() + "\nCustomer Name:" + this.customerName;
        return this.bookStatus();
    }
    // As both return statements in toString were returning one same part I
    // implemented it in another method to avoid redundancy
    private String bookStatus() {
        return "Seat Number:" + seatNumber + "\nBook status:" + this.isBooked;
    }
    public String getCustomerName() { return this.customerName; }
    public boolean getBookStatus() { return this.isBooked; }
    public int getSeatNumber() { return seatNumber; }
    public void setSeatNumber(int seatNumber) { this.seatNumber = seatNumber; }
    public void setBooked(boolean isBooked) { this.isBooked = isBooked; }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}