
public class Test {
    public static void main(String[] args) {
        Screening screening = new Screening("Iron man 2", "07:30 PM");
        screening.bookSeatForScreening(8, 5, "me");
        screening.bookSeatForScreening(4, 4, "aqib");
        screening.cinema.displaySeating();
        screening.cancelBookingForScreening(4, 4);
        screening.cinema.displaySeating();
    }
}
