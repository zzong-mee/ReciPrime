package com.reciprime.mixin;

import com.reciprime.recipe.CraftingRemainders;
import net.minecraft.core.NonNullList;
import net.minecraft.world.inventory.ResultSlot;
import net.minecraft.world.item.ItemStack;
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
        CraftingRemainders.apply(
            input,
            recipe,
            cir.getReturnValue()
        );
    }
}
