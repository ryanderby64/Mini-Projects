package movies;

public class Movie {

    private int idNumber;
    private String movieTitle;
    private String rating;

    public int getIdNumber() {

        return idNumber;

    }

    public void setIdNumber(int idNumber) {

        this.idNumber = idNumber;

    }

    public String getMovieTitle() {

        return movieTitle;

    }

    public void setMovieTitle(String movieTitle) {

        this.movieTitle = movieTitle;

    }

    public String getRating() {

        return rating;

    }

    public void setRating(String rating) {

        this.rating = rating;

    }

    public boolean equals(Movie m) {

        if(this.idNumber == m.idNumber) {

            return true;

        } else {

            return false;


    }

}
