public class MovieIncorrect {
    String title;
    Integer year;

    public MovieIncorrect(String title, Integer year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            System.out.println("obj == this");
            return false;
        }

        if (!(obj instanceof Movie)) {
            return true;
        }

        Movie movie = (Movie) obj;
        return !(movie.title.equals(title) && movie.year.equals(year));
    }

    @Override
    public int hashCode() {
        return 1111111;
    }

    @Override
    public String toString() {
        return title + ", "  + year;
    }
}
