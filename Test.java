public class Test {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("Alberto Cinema", 2, 2);
        cinema.displaySeating();
        cinema.cancelSeating(1, 1);
        cinema.bookSeat(1, 1, "alexa");
        cinema.displaySeating();
        cinema.cancelSeating(1, 1);
        cinema.displaySeating();
    }
}
