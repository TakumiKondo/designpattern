package state.rating;

public class Movie {
    private String _title;
    private RatingSystem _rating;

    public Movie(String title, RatingSystem rating) {
        _title = title;
        _rating = rating;
    }

    public String title() {
        return _title;
    }

    public boolean checkLimit(int age) {
        return _rating.checkLimit(age);
    }
}
