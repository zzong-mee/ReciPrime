package com.sulfurgunpowder;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.NestedLootTable;
import net.minecraft.world.level.block.Blocks;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
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
    public static Item NETHER_QUARTZ_POWDER;

    @Override
    public void onInitialize() {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, POWDER_ID);
        SULFUR_POWDER = Registry.register(BuiltInRegistries.ITEM, key,
            new Item(new Item.Properties().setId(key).stacksTo(64)));

        ResourceKey<Item> crystalKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "nether_quartz_powder"));
        NETHER_QUARTZ_POWDER = Registry.register(BuiltInRegistries.ITEM, crystalKey,
            new Item(new Item.Properties().setId(crystalKey).stacksTo(64)));

        LootTableEvents.MODIFY.register((lootKey, builder, source, registries) -> {
            if (source.isBuiltin() && lootKey.equals(Blocks.NETHER_QUARTZ_ORE.getLootTable().orElseThrow())) {
                builder.withPool(LootPool.lootPool()
                    .add(NestedLootTable.lootTableReference(registries.lookupOrThrow(Registries.LOOT_TABLE).getOrThrow(ResourceKey.create(Registries.LOOT_TABLE,
                        Identifier.fromNamespaceAndPath(MOD_ID, "blocks/nether_quartz_powder"))))));
            }
        });

        ResourceKey<CreativeModeTab> tabKey = ResourceKey.create(Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(MOD_ID, "main"));
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, tabKey,
            FabricCreativeModeTab.builder()
                .title(Component.translatable("itemGroup.sulfur_gunpowder.main"))
                .icon(() -> new ItemStack(SULFUR_POWDER))
                .displayItems((parameters, output) -> { output.accept(SULFUR_POWDER); output.accept(NETHER_QUARTZ_POWDER); })
                .build());
    }
}
