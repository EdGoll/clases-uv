import java.util.List;

public class Movie {
    private String movieId;
    private String title;
    private List<String> genres;
    private List<Rating> rating;
    
    public Movie() {}

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title.trim();
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<Rating> getRating() {
        return rating;
    }

    public void setRating(List<Rating> rating) {
        this.rating = rating;
    }
    
    public double getRantingPromedio() {
        double rat = 0;
        int cant = 0;
        for (Rating r : rating) {
            try {
                rat += Double.parseDouble(r.getRating());
                cant++;
            } catch(NumberFormatException e) {}
        }
        return rat/cant;
    }
    
    @Override
    public String toString() {
        String generos = "";
        for (String genre : genres) {
            generos += (genre + " ");
        }
        String ratings = ""; 
        for (Rating r : rating) {
            ratings += (r + " ");
        }
        return String.format("%s %s %s %s", movieId, title, generos, ratings);
    }
}