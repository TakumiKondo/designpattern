package visitor.sample.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import visitor.sample.main.Directory;
import visitor.sample.main.File;

class SizeVisitorTest {

    @Test
    void ディレクト内の合計ファイルサイズを取得する() {
        Directory root = new Directory("root");
        root.add(new File("file1", 10000));
        root.add(new File("file2", 20000));
        assertThat(30000, is(root.size()));
    }

}
