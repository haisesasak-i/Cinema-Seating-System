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
        {
            for (int i = 0; i < this.seats.length; i++) {
                for (int j = 0; j < seats[i].length; j++) {
                    seats[i][j] = new Seat();
                }
            }
        }
    }
    public void bookSeat(int row, int column, String customerName) {
        if (seats[row][column].getBookStatus()) {
            System.out.println("The seat is already book");
            return;
        }
        seats[row][column].bookSeat(customerName);
    }
    public void displaySeating() {
        for (Seat currentRowOfSeats[] : seats) {
            for (Seat currentSeat : currentRowOfSeats) {
                System.out.println(currentSeat);
            }
        }
    }
}
