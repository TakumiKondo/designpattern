package composite.html;

public class Main {
    public static void main(String...strings) {
        Parent html = new Parent("html");
        Parent body = new Parent("body");
        Parent title = new Parent("title");
        Parent header = new Parent("header");
        Parent div1 = new Parent("div1");
        Parent div2 = new Parent("div2");
        Child p = new Child("p");

        html.add(header);
        html.add(title);
        html.add(body);
        body.add(div1);
        div1.add(div2);
        div2.add(p);
        html.remove(header);

        String tags = html.create();
        System.out.println(tags);

    }
}
