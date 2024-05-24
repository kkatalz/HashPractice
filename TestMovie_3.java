import java.util.HashMap;

public class TestMovie_3 {
    public static void main(String[] args) {
        Movie movie = new Movie("The Godfather", 1972);
        Movie movie1 = new Movie("Batman", 1989);
        Movie movie2 = new Movie("Batman", 1989);

        MovieIncorrect incorrectMovie = new MovieIncorrect("The Godfather", 1972);
        MovieIncorrect incorrectMovie1 = new MovieIncorrect("Batman", 1989);
        MovieIncorrect incorrectMovie2 = new MovieIncorrect("Batman", 1989);

        System.out.println("Movie with correct equals and hashCode methods");
        System.out.println("Check if " + movie + " is equal to " + movie2 + ". Equal? - " + movie.equals(movie2));
        System.out.println("Check if " + movie1 + " is equal to " + movie2 + ". Equal? - " + movie1.equals(movie2));
        System.out.println(movie+ " -> " +movie.hashCode());
        System.out.println(movie1+ " -> " +movie1.hashCode());
        System.out.println(movie2+ " -> " +movie2.hashCode());


        System.out.println("\nMovieIncorrect with incorrect equals and hashCode methods");
        System.out.println("Check if " + incorrectMovie + " is equal to " + incorrectMovie2 + ". Equal? - " + incorrectMovie.equals(incorrectMovie2));
        System.out.println("Check if " + incorrectMovie1 + " is equal to " + incorrectMovie2 + ". Equal? - " + incorrectMovie1.equals(incorrectMovie2));
        System.out.println(incorrectMovie+ " -> " +incorrectMovie.hashCode());
        System.out.println(incorrectMovie1+ " -> " +incorrectMovie1.hashCode());
        System.out.println(incorrectMovie2+ " -> " +incorrectMovie2.hashCode());


        System.out.println("\n Usage of HashMap");
        HashMap<Movie, String> map1 = new HashMap<>();
        map1.put(movie, "First movie from correct class");
        map1.put(movie1, "Second movie from correct class");
        map1.put(movie2, "Third movie from correct class");


        HashMap<MovieIncorrect, String> map2 = new HashMap<>();
        map2.put(incorrectMovie, "First movie from incorrect class");
        map2.put(incorrectMovie1, "Second movie from incorrect class");
        map2.put(incorrectMovie2, "Third movie from incorrect class");


        System.out.println("Movie with correct equals and hashCode methods: " + map1.size());
        System.out.println("Movie with incorrect equals and hashCode methods: " + map2.size());

    }
}
