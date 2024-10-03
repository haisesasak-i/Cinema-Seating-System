public class Seat {
    static int seatNumber;
    private boolean isBooked;
    private String customerName;
    static { seatNumber = 0; }
    public Seat(String customerName) {
        this.customerName = customerName;
        isBooked = true;
        seatNumber++;
    }
    public void cancel() { this.isBooked = false; }
    public String toString() {
        if (this.isBooked == true)
            return this.bookStatus() + "\nCustomer Name:" + this.customerName;
        return this.bookStatus();
    }
    private String bookStatus() {
        return "Seat Number:" + seatNumber + "\nBook status:" + this.isBooked;
    }
}