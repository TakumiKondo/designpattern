package visitor.sample.main;

import java.util.Iterator;

public class Main {
    public static void main(String...strings) {
        System.out.println("Making root enrties...");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        binDir.add(new File("vi",10000));
        binDir.add(new File("latex",20000));
        binDir.add(new File("latex.html",20000));
        binDir.add(new File("latex.exe",20000));
        binDir.accept(new ListVisitor());

        System.out.println();
        FileFindVisitor ffv = new FileFindVisitor(".html");
        binDir.accept(ffv);
        Iterator<File> it = ffv.getFoundFiles();
        while(it.hasNext()) {
            File file = it.next();
            System.out.println(file.toString());
        }

        System.out.println();
        ElementArrayList list = new ElementArrayList();
        list.add(rootDir);
        list.add(binDir);
        list.add(new File("addFile.txt", 100));
        list.accept(new ListVisitor());
    }
}
