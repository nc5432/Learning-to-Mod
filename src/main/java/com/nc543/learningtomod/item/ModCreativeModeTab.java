package com.nc543.learningtomod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab LEARNING_TAB = new CreativeModeTab("learningtab") {
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(Items.BESKAR_INGOT.get());
        }
    };
}
