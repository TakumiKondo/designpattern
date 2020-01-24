package state.basic;

public class ConcreteB implements State {

    @Override
    public void run() {
        System.out.println("B is running very fast!");
    }

    @Override
    public void walk() {
        System.out.println("B is walking very fast!");
    }

}
