package composite.account;

public class Main {
    public static void main(String...strings) {
        Wrapup comCost = new Wrapup("通信費");
        Statement phone = new Statement("携帯代", 5000);
        Statement net = new Statement("インターネット代", 4500);
        comCost.add(phone);
        comCost.add(net);
        comCost.sum();

        Wrapup lifeCost = new Wrapup("水道光熱費");
        Statement water = new Statement("水道代", 10000);
        Statement gus = new Statement("ガス代", 6000);
        Statement elec = new Statement("電気代", 7000);
        lifeCost.add(water);
        lifeCost.add(gus);
        lifeCost.add(elec);
        lifeCost.sum();

        Wrapup all = new Wrapup("勘定総元帳");
        all.add(comCost);
        all.add(lifeCost);
        all.sum();


    }
}
