package abstractfactory.hotpot;

import java.util.List;

import abstractfactory.hotpot.ingredient.main.Protein;
import abstractfactory.hotpot.ingredient.other.OtherIngredient;
import abstractfactory.hotpot.ingredient.soup.Soup;
import abstractfactory.hotpot.ingredient.vegetable.Vegetable;

public abstract class HotPot {
    private Soup soup;
    private Protein protein;
    private List<Vegetable> vegetables;
    private List<OtherIngredient> otherIngredients;

    public void addSoup(Soup soup){
        this.soup = soup;
    }

    public void addMain(Protein protein){
        this.protein = protein;
    }

    public void addVegetables(List<Vegetable> vegetables){
        this.vegetables = vegetables;
    }

    public void addOtherIngredients(List<OtherIngredient> otherIngredients){
        this.otherIngredients = otherIngredients;
    }

    public void cook() {
        if(soup == null) throw new IllegalStateException("スープが入っていません");
        if(protein == null) throw new IllegalStateException("メインの具材が入っていません");
        if(vegetables == null) throw new IllegalStateException("野菜が入っていません");
        if(otherIngredients == null) throw new IllegalStateException("その他の具材が入っていません");

        System.out.println(soup.name() + "を入れます。");
        System.out.println(protein.name() + "を入れます。");
        vegetables.forEach(args -> System.out.println(args.name() + "を入れます。"));
        otherIngredients.forEach(args -> System.out.println(args.name() + "を入れます"));
    }
}