package abstractfactory.hotpot;

public class KimuchiHotpot extends HotPot {
    public void cook() {
        System.out.println("これからキムチ鍋を作ります。");
        super.cook();
        System.out.println("キムチ鍋の完成です！");
    }
}
