package state.Emotion;

public class Main {
    public static void main(String... args) {

        Human human = new Human();
        human.changeEmotion(new EmotionGrad());
        human.say();

        human.changeEmotion(new EmotionAngry());
        human.say();

        human.changeEmotion(new EmotionSad());
        human.say();

        human.changeEmotion(new EmotionHappy());
        human.say();
    }
}
