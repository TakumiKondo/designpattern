package state.rating;

public class User {
    private String _name;
    private int _age;

    User(String name, int age){
        _name = name;
        _age = age;
    }

    public String name() {
        return _name;
    }

    public int age() {
        return _age;
    }

    public void play(Movie movie) {
        System.out.println(movie.title() + "を再生します。");
        if(!movie.checkLimit(_age)) {
            System.out.println(" >>>年齢制限エラーのため、再生できません。");
            stop(movie);
        }
    }

    public void stop(Movie movie) {
        System.out.println(movie.title() + "を停止します。");
    }
}
