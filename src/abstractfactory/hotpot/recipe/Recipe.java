package abstractfactory.hotpot.recipe;

import java.util.List;

import abstractfactory.hotpot.HotPot;
import abstractfactory.hotpot.ingredient.main.Protein;
import abstractfactory.hotpot.ingredient.other.OtherIngredient;
import abstractfactory.hotpot.ingredient.soup.Soup;
import abstractfactory.hotpot.ingredient.vegetable.Vegetable;

public abstract class Recipe {
    // 抽象メソッド
    public abstract Soup soup();
    public abstract Protein main();
    public abstract List<Vegetable> vegetables();
    public abstract List<OtherIngredient> otherIngredients();
    public abstract HotPot prepareHotpot();
}
