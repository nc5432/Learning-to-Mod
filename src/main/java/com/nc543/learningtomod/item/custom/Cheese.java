package com.nc543.learningtomod.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Cheese extends Item{

    public Cheese(Properties p) {
        super(p);
        //TODO Auto-generated constructor stub
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        // TODO Auto-generated method stub
        return super.finishUsingItem(stack, level, entity);
    }
}
