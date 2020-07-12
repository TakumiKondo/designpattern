package abstractfactory.hotpot.recipe;

import java.util.Arrays;
import java.util.List;

import abstractfactory.hotpot.HotPot;
import abstractfactory.hotpot.KimuchiHotpot;
import abstractfactory.hotpot.ingredient.main.PorkBelly;
import abstractfactory.hotpot.ingredient.main.Protein;
import abstractfactory.hotpot.ingredient.other.CottonTofu;
import abstractfactory.hotpot.ingredient.other.OtherIngredient;
import abstractfactory.hotpot.ingredient.soup.KimuchiSoup;
import abstractfactory.hotpot.ingredient.soup.Soup;
import abstractfactory.hotpot.ingredient.vegetable.ChineseCabbage;
import abstractfactory.hotpot.ingredient.vegetable.ChineseChive;
import abstractfactory.hotpot.ingredient.vegetable.JapaneseLeek;
import abstractfactory.hotpot.ingredient.vegetable.Vegetable;

public class KimuchiRecipe extends Recipe {

    @Override
    public Soup soup() {
        return new KimuchiSoup();
    }

    @Override
    public Protein main() {
        return new PorkBelly();
    }

    @Override
    public List<Vegetable> vegetables() {
        List<Vegetable> vegetables = Arrays.asList(
                new ChineseCabbage(),
                new ChineseChive(),
                new JapaneseLeek()
            );
        return vegetables;
    }

    @Override
    public List<OtherIngredient> otherIngredients() {
        List<OtherIngredient> otherIngredients = Arrays.asList(
                new CottonTofu()
            );
        return otherIngredients;
    }

    @Override
    public HotPot prepareHotpot() {
        return new KimuchiHotpot();
    }

}
