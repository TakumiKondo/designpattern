package abstractfactory.hotpot;

import abstractfactory.hotpot.recipe.KimuchiRecipe;
import abstractfactory.hotpot.recipe.MizutakiRecipe;
import abstractfactory.hotpot.recipe.Recipe;
import abstractfactory.hotpot.recipe.SukiyakiRecipe;

public enum HotpotRecipe {
    Sukiyaki(new SukiyakiRecipe()),
    Kimuchi(new KimuchiRecipe()),
    Mizutaki(new MizutakiRecipe());

    private Recipe _recipe;

    private HotpotRecipe(Recipe recipe) {
        _recipe = recipe;
    }

    public Recipe recipe() {
        return _recipe;
    }
}
