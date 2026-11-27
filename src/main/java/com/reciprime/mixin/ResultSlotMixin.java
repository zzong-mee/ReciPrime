package com.reciprime.mixin;

import net.minecraft.core.NonNullList;
import net.minecraft.world.inventory.ResultSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.RecipeHolder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ResultSlot.class)
public abstract class ResultSlotMixin {

    @Inject(
        method = "lambda$getRemainingItems$0",
        at = @At("RETURN")
    )
    private static void reciprime$returnGlassBottle(
        CraftingInput input,
        RecipeHolder<?> recipe,
        CallbackInfoReturnable<NonNullList<ItemStack>> cir
    ) {
        String recipeId = recipe.id().identifier().toString();

        if (!recipeId.equals("reciprime:ghast_tear")
                && !recipeId.equals("reciprime:ghast_tear_rotated")) {
            return;
        }

        NonNullList<ItemStack> remaining = cir.getReturnValue();

        for (int i = 0; i < input.size(); i++) {
            if (input.getItem(i).is(Items.POTION)
                    && remaining.get(i).isEmpty()) {
                remaining.set(i, new ItemStack(Items.GLASS_BOTTLE));
            }
        }
    }
}
