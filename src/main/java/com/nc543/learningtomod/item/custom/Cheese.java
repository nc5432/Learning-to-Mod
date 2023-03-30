package com.nc543.learningtomod.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;

public class Cheese extends Item{

    public Cheese(Properties p) {
        super(p);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        ItemStack returnable = super.finishUsingItem(stack, level, entity);
        if (!level.isClientSide()) level.explode(entity, entity.getX(), entity.getY(), entity.getZ(), 30, Explosion.BlockInteraction.BREAK);
        return returnable;
    }
}
