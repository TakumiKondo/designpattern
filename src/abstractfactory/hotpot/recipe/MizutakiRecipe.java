package abstractfactory.hotpot.recipe;

import java.util.ArrayList;
import java.util.List;

import abstractfactory.hotpot.HotPot;
import abstractfactory.hotpot.MizutakiHotPot;
import abstractfactory.hotpot.ingredient.main.Chicken;
import abstractfactory.hotpot.ingredient.main.Protein;
import abstractfactory.hotpot.ingredient.other.OtherIngredient;
import abstractfactory.hotpot.ingredient.other.Tofu;
import abstractfactory.hotpot.ingredient.soup.ChickenBonesSoup;
import abstractfactory.hotpot.ingredient.soup.Soup;
import abstractfactory.hotpot.ingredient.vegetable.ChineseCabbage;
import abstractfactory.hotpot.ingredient.vegetable.Chrysanthemum;
import abstractfactory.hotpot.ingredient.vegetable.Leek;
import abstractfactory.hotpot.ingredient.vegetable.Vegetable;

public class MizutakiRecipe extends Recipe {

    @Override
    public Soup soup() {
        return new ChickenBonesSoup();
    }

    @Override
    public Protein main() {
        return new Chicken();
    }

    @Override
    public List<Vegetable> vegetables() {
        List<Vegetable> vegetables = new ArrayList<Vegetable>();
        vegetables.add(new ChineseCabbage());
        vegetables.add(new Leek());
        vegetables.add(new Chrysanthemum());
        return vegetables;
    }

    @Override
    public List<OtherIngredient> otherIngredients() {
        List<OtherIngredient> otherIngredients = new ArrayList<OtherIngredient>();
        otherIngredients.add(new Tofu());
        return otherIngredients;
    }

    @Override
    public HotPot prepareHotpot() {
        return new MizutakiHotPot();
    }

}
