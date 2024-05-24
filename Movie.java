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
            return false;
        }

        Movie movie = (Movie) obj;
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



