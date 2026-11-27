package com.reciprime.mixin;

import com.reciprime.recipe.CraftingRemainders;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.block.CrafterBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(CrafterBlock.class)
public abstract class CrafterBlockMixin {

    @WrapOperation(
        method = "dispenseFrom",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/item/crafting/CraftingRecipe;getRemainingItems(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/core/NonNullList;"
        )
    )
    private NonNullList<ItemStack> reciprime$returnGlassBottle(
            CraftingRecipe recipe,
            CraftingInput input,
            Operation<NonNullList<ItemStack>> original,
            @Local RecipeHolder<?> holder
    ) {
        NonNullList<ItemStack> remaining =
                original.call(recipe, input);

        return CraftingRemainders.apply(
            input,
            holder,
            remaining
        );
    }
}
