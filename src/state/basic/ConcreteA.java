package state.basic;

public class ConcreteA implements State {

    @Override
    public void run() {
        System.out.println("A is running!");
    }

    @Override
    public void walk() {
        System.out.println("A is walking!");
    }

}
