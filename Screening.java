public class Screening {
    private String movieName;
    private String showTime;
    private Cinema cinema;

    public Screening(String movieName, String showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
        this.cinema = new Cinema("Galaxy Theatres", 8, 5);
    }
    public void bookSeatForScreening(int row, int column, String customerName) {
        this.cinema.bookSeat(row, column, customerName);
    }
    public void cancelBookingForScreening(int row, int column) {
        this.cinema.cancelSeating(row, column);
    }
    public void displaySeatingForScreening() { this.cinema.displaySeating(); }
    public String getScreeningDetails() {
        return "Movie Name: " + this.movieName +
            "\n\nShow Time: " + this.showTime + " Today"
            + "\n\nSeating Layout:(8x5)\n\nSeats:";
    }
}
