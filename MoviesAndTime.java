import java.util.Random;
// created two arrays and use random to get two random index
public class MoviesAndTime {
    private Random random;
    private String[] movieNames = {"The Matrix",
                                   "Inception",
                                   "Interstellar",
                                   "Avatar",
                                   "Titanic",
                                   "The Dark Knight",
                                   "Pulp Fiction",
                                   "Forrest Gump",
                                   "Gladiator",
                                   "The Godfather",
                                   "Jurassic Park",
                                   "The Avengers",
                                   "Iron Man",
                                   "Spider-Man",
                                   "Black Panther",
                                   "The Lion King",
                                   "Frozen",
                                   "Toy Story",
                                   "Finding Nemo",
                                   "Shrek",
                                   "Harry Potter",
                                   "Lord of the Rings",
                                   "Star Wars",
                                   "The Hobbit",
                                   "The Terminator",
                                   "Back to the Future",
                                   "Rocky",
                                   "Mad Max",
                                   "Die Hard",
                                   "The Incredibles",
                                   "Joker",
                                   "A Quiet Place",
                                   "Parasite",
                                   "Coco",
                                   "Moana",
                                   "Wonder Woman",
                                   "Justice League",
                                   "Doctor Strange",
                                   "Guardians of the Galaxy",
                                   "Thor"};
    private String[] movieTimes = {
        "10:00 AM", "12:30 PM", "03:00 PM", "05:30 PM", "08:00 PM", "11:00 AM",
        "01:30 PM", "04:00 PM", "06:30 PM", "09:00 PM", "09:00 AM", "11:30 AM",
        "02:00 PM", "04:30 PM", "07:00 PM", "10:30 AM", "01:00 PM", "03:30 PM",
        "06:00 PM", "08:30 PM", "11:00 AM", "01:30 PM", "04:00 PM", "06:30 PM",
        "09:00 PM", "09:30 AM", "12:00 PM", "02:30 PM", "05:00 PM", "07:30 PM",
        "10:00 AM", "12:30 PM", "03:00 PM", "05:30 PM", "08:00 PM", "11:00 AM",
        "01:30 PM", "04:00 PM", "06:30 PM", "09:00 PM"};
    public MoviesAndTime() { this.random = new Random(); }
    public String getRandomMovie() {
        int index =
            this.random.nextInt(40); // this will get a random index form 0 to
                                     // 39 and store it in index
        return this.movieNames[index];
    }
    public String getRandomTime() {
        int index = this.random.nextInt(40);
        return this.movieTimes[index];
    }
}