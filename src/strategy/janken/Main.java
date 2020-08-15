package strategy.janken;

public class Main {
    public static void main(String...strings) {
        if(strings.length != 2) {
            System.out.println("Usage: java Main randmseed1 randomseed2");
            System.out.println("Example: java Main 314 15");
            System.exit(0);
        }

        int seed1 = Integer.parseInt(strings[0]);
        int seed2 = Integer.parseInt(strings[1]);
        Player taro = new Player("Taro", new RandomStrategy(seed1));
        Player hana = new Player("Hana", new ProbStrategy(seed2));

        for(int i=0; i < 10000; i++) {
            Hand taroNextHand = taro.nextHand();
            Hand hanaNextHand = hana.nextHand();
            if(taroNextHand.isStrongerThan(hanaNextHand)) {
                System.out.println("Winner : " + taro);
                taro.win();
                hana.lose();
            }else if(taroNextHand.isWeakerThan(hanaNextHand)) {
                System.out.println("Winner : " + hana);
                taro.lose();
                hana.win();
            }else {
                System.out.println("Even...");
                taro.even();
                hana.even();
            }
        }

        System.out.println("Total result:");
        System.out.println(taro.toString());
        System.out.println(hana.toString());
    }
}
