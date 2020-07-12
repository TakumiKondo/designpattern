package abstractfactory.hotpot;

public class SukiyakiHotPot extends HotPot {
    public void cook() {
        System.out.println("すき焼きを作ります。");
        super.cook();
        System.out.println("すき焼きの完成です。");
    }
}
