package state.rating;

public class PG12 implements RatingSystem {

    @Override
    public boolean checkLimit(int age) {
        if(12 <= age)
            return true;
        return false;
    }
}
