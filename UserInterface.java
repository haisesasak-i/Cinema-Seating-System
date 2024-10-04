
import java.util.Scanner;
public class UserInterface {
    private Screening screening;
    private Scanner scanner;
    public UserInterface(Screening screening) {
        this.scanner = new Scanner(System.in);
        this.screening = screening;
    }
    public void start() {
        int choice = 0;
        System.out.println("<-------------------------- Cinema Booking "
                           + "----------------------------->");
        while (true) {
            System.out.print(
                "Enter \"1\" to book a seat.\nEnter \"2\" to cancel a "
                + "booking.\nEnter \"3\" to view seating.\nEnter \"4\" to view "
                + "seating details.\nEnter \"5\" to exit.\nEnter your choice:");
            choice = Integer.valueOf(scanner.nextLine());
            if (choice <= 0 || choice > 5) {
                System.out.println("");
                System.out.println("You have entered an invalid number\nThe "
                                   + "choice must be from 1 to 5");
                System.out.println("");
            } else
                break;
        }

        /*
        Book a seat.
        Cancel a booking.
        View seating.
        View screening details.
        Exit.
        The things that are needed to be done

         */
    }
}
