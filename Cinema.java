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
        if (this.checkForInvalidSeats(row, column)) {
            return;
        }
        if (seats[row][column].getBookStatus()) {
            System.out.println("The seat is already book");
            return;
        }
        seats[row][column].bookSeat(customerName);
        System.out.println("The seat is booked successfully!");
        System.out.println("");
    }
    public void displaySeating() {
        for (Seat currentRowOfSeats[] : seats) {
            for (Seat currentSeat : currentRowOfSeats) {
                System.out.println(currentSeat);
                System.out.println("");
            }
        }
    }
    public void cancelSeating(int row, int column) {
        if (this.checkForInvalidSeats(row, column)) {
            return;
        }

        if (!this.seats[row][column].getBookStatus()) {
            System.out.println("This seat is not booked.\nYou need to book a "
                               + "seat first in order to cancel it.");
            System.out.println("");
            return;
        }
        this.seats[row][column].setBooked(false);
        System.out.println("The seat is cancelled successfully!");
        System.out.println("");
    }
    private boolean checkForInvalidSeats(int row, int column) {
        if (row >= this.rows || column >= this.columns || row < 0 ||
            column < 0) {
            System.out.println("The seat does not exist\nThere are total " +
                               (this.rows * this.columns) +
                               " seats available and seating plan is " +
                               this.rows + "x" + this.columns + ".\n");
            return true;
        }
        return false;
    }
    public String toString() {
        return "Welcome to " + this.name +
            " Cinema\nWhere imagination comes to reality!";
    }
}
