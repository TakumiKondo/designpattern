package state.rating;

public class R15 implements RatingSystem {

    @Override
    public boolean checkLimit(int age) {
        if(15 <= age)
            return true;
        return false;
    }
}
