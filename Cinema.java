public class Cinema {
    private String name;
    private int rows;
    private int columns;
    private Seat[][] seats;

    public Cinema(String name, int rows, int columns) {
        this.name = name;
        this.columns = columns;
        this.rows = rows;
        this.seats = new Seat[rows][columns];
    }
}
