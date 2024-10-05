
import java.util.Scanner;
public class UserInterface {
    private Screening screening;
    private Scanner scanner;
    public UserInterface(Screening screening) {
        this.scanner = new Scanner(System.in);
        this.screening = screening;
    }
    public void start() {
        int choiceFromMenu = 0;
        while (true) {
            System.out.println("<-------------------------- Cinema Booking "
                               + "----------------------------->");
            while (true) {
                System.out.print(
                    "Enter \"1\" to book a seat.\nEnter \"2\" to cancel a "
                    + "booking.\nEnter \"3\" to view seating.\nEnter \"4\" "
                    + "to view "
                    + "seating details.\nEnter \"5\" to exit.\nEnter your "
                    + "choice:");

                choiceFromMenu = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                if (choiceFromMenu <= 0 || choiceFromMenu > 5) {
                    System.out.println("");
                    System.out.println(
                        "You have entered an invalid number\nThe "
                        + "choice must be from 1 to 5");
                    System.out.println("");
                } else
                    break;
            }
            switch (choiceFromMenu) {
            case 1: {
                String name = "";

                System.out.println("The seating layout is 8x5");
                System.out.println("Enter your row number:");
                int row = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter your column number:");
                int column = Integer.valueOf(scanner.nextLine());

                while (true) {
                    System.out.println("Enter your name:");
                    name = scanner.nextLine();
                    if (!name.isEmpty()) {
                        break;
                    }
                    System.out.println(
                        "You have entered an invalid name\n Try again!");
                    System.out.println("");
                }
                name = this.capitalizeName(name);
                this.screening.bookSeatForScreening(row, column, name);

                break;
            }
            case 2: {

                break;
            }
            case 3: {

                break;
            }
            case 4: {

                break;
            }
            default: {
                System.out.println(
                    "Thanks! for using our cinema booking service.\n");
                return;
            }
            }
            System.out.println("Would you like to continue using our cinema "
                               + "booking service:(true)/(false)");
            boolean userChoice = Boolean.valueOf(scanner.nextLine());
            System.out.println("");
            if (!userChoice) {
                System.out.println("Thanks! for using our cinema booking "
                                   + "service\nKindly rate us out of 5");
                System.out.println("");
                this.ratingSystem();
                return;
            }
        }
    }
    private void printRatingstars(int totalStars) {

        for (int i = 0; i < totalStars; i++) {
            System.out.print("* ");
        }
        System.out.println("");
    }
    private void ratingSystem() {
        while (true) {
            this.printRatingstars(5);
            System.out.print("How many stars would you like to "
                             + "give us out of 5:");
            int userGivenRating = Integer.valueOf(scanner.nextLine());
            if (userGivenRating < 0 || userGivenRating > 5) {
                System.out.println("\nRating must be between 0 and "
                                   + "5 (wholeNumber)\nKindly try again!");

            } else {
                System.out.println("");
                this.printRatingstars(userGivenRating);
                System.out.println("Thanks! for giving us " + userGivenRating +
                                   " stars!");
                break;
            }
        }
    }
    private String capitalizeName(String name) {
        if (name == null || name.isEmpty()) {
            return "Invalid Name";
        }
        return name.substring(0, 1).toUpperCase().substring(1).toLowerCase();
    }
}
