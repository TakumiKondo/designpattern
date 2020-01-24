package state.Emotion;

public class Human {

    private Emotion _emotion;

    public Human() {
    }

    public void changeEmotion(Emotion emotion) {
        _emotion = emotion;
    }

    public void say() {
        _emotion.say();
    }
}
