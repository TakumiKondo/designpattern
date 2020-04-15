package templateMethod.sample;

public class SimpleLister extends StringLister {

    @Override
    protected String header() {
        return ">--- Start ---<" + System.getProperty("line.separator");
    }

    @Override
    protected String footer() {
        return ">--- End ---<" + System.getProperty("line.separator");
    }

}
