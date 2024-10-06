public class Main {
    public static void main(String[] args) {
        MoviesAndTime moviesAndTime = new MoviesAndTime();
        Screening screening = new Screening(moviesAndTime.getRandomMovie(),
                                            moviesAndTime.getRandomTime());
        UserInterface interface1 = new UserInterface(screening);
        interface1.start();
    }
}
