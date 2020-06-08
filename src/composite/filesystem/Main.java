package composite.filesystem;

public class Main {
    public static void main(String...strings) {
        Directory root = new Directory("ROOT");
        Directory AAA = new Directory("AAA");
        Directory BBB = new Directory("BBB");
        Directory CCC = new Directory("CCC");
        File text1 = new File("text1");
        File text2 = new File("text2");
        File text3 = new File("text3");

        root.add(AAA);
        root.add(BBB);
        BBB.add(CCC);
        root.add(text1);
        AAA.add(text2);
        CCC.add(text3);

        root.operation(0);
    }
}
