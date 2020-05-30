package state.rating;

public class R18 implements RatingSystem {

    @Override
    public boolean checkLimit(int age) {
        if(18 <= age)
            return true;
        return false;
    }
}
