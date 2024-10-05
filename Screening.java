public class Screening {
    private String movieName;
    private String showTime;
    private Cinema cinema;

    public Screening(String movieName, String showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
        this.cinema = new Cinema("Galaxy Theatres", 8, 5);
    }
}
