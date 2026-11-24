package com.sulfurgunpowder;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class SulfurGunpowder implements ModInitializer {
    public static final String MOD_ID = "sulfur_gunpowder";
    public static final Identifier POWDER_ID = Identifier.fromNamespaceAndPath(MOD_ID, "sulfur_powder");
    public static Item SULFUR_POWDER;

    @Override
    public void onInitialize() {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, POWDER_ID);
        SULFUR_POWDER = Registry.register(BuiltInRegistries.ITEM, key,
            new Item(new Item.Properties().setId(key).stacksTo(64)));
    }
}
