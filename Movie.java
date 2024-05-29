public class Movie {
    String title;
    Integer year;

    public Movie(String title, Integer year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            System.out.println("obj == this");
            return true;
        }

        if (!(obj instanceof Movie)) {
            System.out.println("obj is not instance of Movie");
            return false;
        }

        Movie movie = (Movie) obj;
        System.out.println("movie: " + movie + " this: " + this);
        return movie.title.equals(title) && movie.year.equals(year);
    }

    @Override
    public int hashCode() {
        return title.hashCode() + year.hashCode();
    }

    @Override
    public String toString() {
       return title + ", "  + year;
    }
}



