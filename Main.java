public class Main {
    public static void main(String[] args) {

        Screening screening = new Screening("iron man", "12:30PM");
        UserInterface interface1 = new UserInterface(screening);
        interface1.start();
    }
}
