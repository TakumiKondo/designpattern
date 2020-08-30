package visitor.sample.main;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String _currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(_currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(_currentDir + "/" + directory);
        String saveDir = _currentDir;
        _currentDir += "/" + directory.name();
        Iterator<Entry> it = directory.iterator();
        while(it.hasNext()) {
            Entry entry = it.next();
            entry.accept(this);
        }
        _currentDir = saveDir;
    }

}
