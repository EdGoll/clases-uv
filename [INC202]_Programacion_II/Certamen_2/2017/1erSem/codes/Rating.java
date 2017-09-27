public class Rating {

    private String userId;
    private String movieId;
    private String rating;

    public Rating() {}

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId.trim();
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId.trim();
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating.trim();
    }
    
    @Override
    public String toString() {
        return String.format("%s %s",userId, rating);
    }
}