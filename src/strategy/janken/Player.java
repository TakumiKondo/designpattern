package strategy.janken;

public class Player {
    private String _name;
    private Strategy _strategy;
    private int _winCount;
    private int _loseCount;
    private int _gameCount;

    public Player(String name, Strategy strategy) {
        _name = name;
        _strategy = strategy;
    }

    public Hand nextHand() {
        return _strategy.nextHand();
    }

    public void win() {
        _strategy.study(true);
        _winCount++;
        _gameCount++;
    }

    public void lose() {
        _strategy.study(false);
        _loseCount++;
        _gameCount++;
    }

    public void even() {
        _gameCount++;
    }

    public String toString() {
        return "[" + _name + ":"
                + _gameCount + " games, "
                + _winCount + " win, "
                + _loseCount + " lose"
                + "]";
    }

}
