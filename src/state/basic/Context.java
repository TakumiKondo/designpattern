package state.basic;

public class Context {
    private State _state;

    public Context(State state) {
        _state = state;
    }

    public void run() {
        _state.run();
    }

    public void walk() {
        _state.walk();
    }

}
