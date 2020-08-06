package builder.file;

public abstract class Builder {
    private boolean _initialized = false;

    public void makeTitle(String title) {
        if(!_initialized) {
            buildTitle(title);
            _initialized = true;
        }
    }

    public void makeString(String str) {
        if(!_initialized) {
            throw new IllegalStateException("初期化(タイトル作成)されていません。");
        }
        buildString(str);
    }

    public void makeItems(String[] items) {
        if(!_initialized) {
            throw new IllegalStateException("初期化(タイトル作成)されていません。");
        }
        buildItems(items);
    }

    public void close() {
        if(!_initialized) {
            throw new IllegalStateException("初期化(タイトル作成)されていません。");
        }
        buildDone();
    }

    protected abstract String result();
    protected abstract void buildTitle(String title);
    protected abstract void buildString(String str);
    protected abstract void buildItems(String[] items);
    protected abstract void buildDone();

}
