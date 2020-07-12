package abstractfactory.hotpot;

import abstractfactory.hotpot.recipe.Recipe;

public class Use {
    public static void main(String args[]){

        // 水炊き
        Recipe mizutakiRecipe = HotpotRecipe.Mizutaki.recipe();
        HotPot mizutakiHotpot = mizutakiRecipe.prepareHotpot();
        mizutakiHotpot.addSoup(mizutakiRecipe.soup());
        mizutakiHotpot.addMain(mizutakiRecipe.main());
        mizutakiHotpot.addVegetables(mizutakiRecipe.vegetables());
        mizutakiHotpot.addOtherIngredients(mizutakiRecipe.otherIngredients());
        mizutakiHotpot.cook();
        System.out.println();

        // キムチ鍋
        Recipe kimuchiRecipe = HotpotRecipe.Kimuchi.recipe();
        HotPot kimuchiHotpot = kimuchiRecipe.prepareHotpot();
        kimuchiHotpot.addSoup(kimuchiRecipe.soup());
        kimuchiHotpot.addMain(kimuchiRecipe.main());
        kimuchiHotpot.addVegetables(kimuchiRecipe.vegetables());
        kimuchiHotpot.addOtherIngredients(kimuchiRecipe.otherIngredients());
        kimuchiHotpot.cook();
        System.out.println();

        // すき焼き
        Recipe sukiyakiRecipe = HotpotRecipe.Sukiyaki.recipe();
        HotPot sukiyakiHotpot = sukiyakiRecipe.prepareHotpot();
        sukiyakiHotpot.addSoup(sukiyakiRecipe.soup());
        sukiyakiHotpot.addMain(sukiyakiRecipe.main());
        sukiyakiHotpot.addVegetables(sukiyakiRecipe.vegetables());
        sukiyakiHotpot.addOtherIngredients(sukiyakiRecipe.otherIngredients());
        sukiyakiHotpot.cook();
    }
}
