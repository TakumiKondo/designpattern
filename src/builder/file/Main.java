package builder.file;

public class Main {
    public static void main(String...strings) {
        Director director = new Director(new TextBuilder());
        Builder textBuilder = director.constructor();

        director = new Director(new HtmlBuilder());
        Builder htmltBuilder = director.constructor();

        director = new Director(new TextFileBuilder());
        Builder textFileBuilder = director.constructor();

        System.out.println(textBuilder.result());
        System.out.println(htmltBuilder.result());
        System.out.println(textFileBuilder.result());
    }
}
