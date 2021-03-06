package observer.sample;

public class GraphObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.print("Graph Generator : ");
        for(int i = 0; i < generator.getNumber(); i++) {
            System.out.print("*");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

}
