package abstractfactory.hotpot.recipe;

import java.util.Arrays;
import java.util.List;

import abstractfactory.hotpot.HotPot;
import abstractfactory.hotpot.SukiyakiHotPot;
import abstractfactory.hotpot.ingredient.main.Beef;
import abstractfactory.hotpot.ingredient.main.Protein;
import abstractfactory.hotpot.ingredient.other.BeatenEgg;
import abstractfactory.hotpot.ingredient.other.OtherIngredient;
import abstractfactory.hotpot.ingredient.other.ShiitakeMushroom;
import abstractfactory.hotpot.ingredient.other.ThreadKonjac;
import abstractfactory.hotpot.ingredient.soup.Soup;
import abstractfactory.hotpot.ingredient.soup.SukiyakiSoup;
import abstractfactory.hotpot.ingredient.vegetable.JapaneseLeek;
import abstractfactory.hotpot.ingredient.vegetable.Onion;
import abstractfactory.hotpot.ingredient.vegetable.Vegetable;

public class SukiyakiRecipe extends Recipe {

    @Override
    public Soup soup() {
        return new SukiyakiSoup();
    }

    @Override
    public Protein main() {
        return new Beef();
    }

    @Override
    public List<Vegetable> vegetables() {
        List<Vegetable> vegetables = Arrays.asList(
                new JapaneseLeek(),
                new Onion()
            );
        return vegetables;
    }

    @Override
    public List<OtherIngredient> otherIngredients() {
        List<OtherIngredient> otherIngredients = Arrays.asList(
                new ShiitakeMushroom(),
                new ThreadKonjac(),
                new BeatenEgg()
            );
        return otherIngredients;
    }

    @Override
    public HotPot prepareHotpot() {
        return new SukiyakiHotPot();
    }
}
