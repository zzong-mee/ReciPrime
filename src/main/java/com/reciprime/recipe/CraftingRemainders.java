package com.reciprime.recipe;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.RecipeHolder;

public final class CraftingRemainders {

    private CraftingRemainders() {
    }

    public static NonNullList<ItemStack> apply(
            CraftingInput input,
            RecipeHolder<?> recipe,
            NonNullList<ItemStack> remaining
    ) {
        String recipeId = recipe.id().identifier().toString();

        if (!recipeId.equals("reciprime:ghast_tear")
                && !recipeId.equals("reciprime:ghast_tear_rotated")) {
            return remaining;
        }

        for (int i = 0; i < input.size(); i++) {
            if (input.getItem(i).is(Items.POTION)
                    && remaining.get(i).isEmpty()) {
                remaining.set(i, new ItemStack(Items.GLASS_BOTTLE));
            }
        }

        return remaining;
    }
}
