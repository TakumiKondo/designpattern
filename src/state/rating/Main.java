package state.rating;

public class Main {
    public static void main(String... args) {

        Movie torasan = new Movie("男はつらいよ・寅次郎夕焼け小焼け", new G());
        Movie titan = new Movie("進撃の巨人 ATTACK ON TITAN", new PG12());
        Movie jingi = new Movie("仁義なき戦い", new R15());

        User shinnosuke = new User("野原しんのすけ", 5);
        System.out.println(shinnosuke.name());
        shinnosuke.play(torasan);
        shinnosuke.play(titan);
        shinnosuke.play(jingi);
        System.out.println();

        User taro = new User("太郎", 12);
        System.out.println(taro.name());
        taro.play(torasan);
        taro.play(titan);
        taro.play(jingi);
        System.out.println();

        User hanako = new User("花子", 17);
        System.out.println(hanako.name());
        hanako.play(torasan);
        hanako.play(titan);
        hanako.play(jingi);
        System.out.println();
    }
}
