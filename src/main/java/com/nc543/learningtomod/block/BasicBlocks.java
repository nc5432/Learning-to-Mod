package com.nc543.learningtomod.block;

import java.util.function.Supplier;

import com.nc543.learningtomod.LearningToMod;
import com.nc543.learningtomod.item.BasicItems;
import com.nc543.learningtomod.item.ModCreativeModeTab;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BasicBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LearningToMod.MODID);

    public static final RegistryObject<Block> BESKAR_BLOCK = registerBlock("beskar_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(8f).requiresCorrectToolForDrops()), ModCreativeModeTab.LEARNING_TAB);
    public static final RegistryObject<Block> BLOCK_OF_BESKAR_ORE = registerBlock("block_of_beskar_ore", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.LEARNING_TAB);
    public static final RegistryObject<Block> BESKAR_ORE_BLOCK = registerBlock("beskar_ore_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.LEARNING_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return BasicItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
