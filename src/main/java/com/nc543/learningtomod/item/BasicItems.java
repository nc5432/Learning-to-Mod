package com.nc543.learningtomod.item;

import com.nc543.learningtomod.LearningToMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BasicItems{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LearningToMod.MODID);

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LEARNING_TAB).food(ModdedFoods.CHEESE)));
    public static final RegistryObject<Item> BESKAR_INGOT = ITEMS.register("beskar_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LEARNING_TAB).fireResistant()));
    public static final RegistryObject<Item> BESKAR_ORE = ITEMS.register("beskar_ore", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LEARNING_TAB).fireResistant()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}