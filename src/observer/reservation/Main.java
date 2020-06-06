package observer.reservation;

public class Main {
    public static void main(String...strings) {
        User taro = new User("太郎");
        User jiro = new User("次郎");

        Item titan32 = new Item("進撃の巨人 32巻");
        titan32.reserve(taro);
        titan32.reserve(jiro);
        titan32.cancel(taro);
        titan32.arrival();
    }
}
