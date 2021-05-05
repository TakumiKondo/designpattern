package visitor.sample.test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import visitor.sample.main.Directory;
import visitor.sample.main.File;
import visitor.sample.main.FileFindVisitor;

class FileFindVisitorTest {
    private FileFindVisitor ffv;

    @BeforeEach
    void init() {
        ffv = new FileFindVisitor(".html");
    }

    @Test
    void 拡張子をフィールドに持つ() {
        assertThat(".html", is(ffv.ext()));
    }

    @Test
    void 指定した拡張子を検出する() {
        Directory root = new Directory("root");
        root.add(new File("hello.html", 1000));
        root.accept(ffv);
        Iterator<File> it = ffv.getFoundFiles();
        File file = it.next();
        assertThat("hello.html (1000)", is(file.toString()));
    }

    @Test
    void 指定した拡張子のみ検出する() {
        Directory root = new Directory("root");
        root.add(new File("hello.exe", 2000));
        root.add(new File("hello.html", 1000));
        root.accept(ffv);
        Iterator<File> it = ffv.getFoundFiles();
        File file = it.next();
        assertThat("hello.html (1000)", is(file.toString()));
    }

    @Test
    void 指定した拡張子が無ければ取得する要素はない() {
        Directory root = new Directory("root");
        root.add(new File("hello.exe", 2000));
        root.accept(ffv);
        Iterator<File> it = ffv.getFoundFiles();
        assertThrows(NoSuchElementException.class, () -> it.next());
    }



}
