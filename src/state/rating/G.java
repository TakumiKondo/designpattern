package state.rating;

public class G implements RatingSystem {

    @Override
    public boolean checkLimit(int age) {
        return true;
    }
}
