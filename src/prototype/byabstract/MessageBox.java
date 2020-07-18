package prototype.byabstract;

public class MessageBox extends Product {
    private char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String string) {
        int length = string.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println("");
        System.out.println(decoChar + " " + string + " " + decoChar);

        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println("");
    }

    // createClone()は削除
}
