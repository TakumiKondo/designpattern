package abstractfactory.hotpot;

public class MizutakiHotPot extends HotPot {
    public void cook() {
        System.out.println("これから水炊きを作ります。");
        super.cook();
        System.out.println("水炊きの完成です！");
    }
}
