package decorator;

public class Main {
    public static void main(String...strings) {
        Display strDisp = new StringDisplay("Hello World!");
        Display sideBorder = new SideBorder(strDisp, '#');
        Display fullBorder = new FullBorder(sideBorder);
        strDisp.show();
        sideBorder.show();
        fullBorder.show();

        Display nestedDisplay =
            new SideBorder(new FullBorder(new FullBorder(new SideBorder(new FullBorder(new StringDisplay("こんにちは")), '*')))
                , '/');
        nestedDisplay.show();

        Display upDownBorder = new UpDownBorder(strDisp , '=');
        upDownBorder.show();

        MultiStringDisplay msDisp = new MultiStringDisplay();
        msDisp.add("おはようございます。");
        msDisp.add("こんにちわ。");
        msDisp.add("おやすみなさい、また明日。");
        msDisp.show();

        sideBorder = new SideBorder(msDisp, '#');
        sideBorder.show();

        fullBorder = new FullBorder(msDisp);
        fullBorder.show();
    }
}
