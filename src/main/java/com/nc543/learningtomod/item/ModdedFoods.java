package com.nc543.learningtomod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModdedFoods {
    public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(20).saturationMod(15.3f).effect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 6), 1f).build();
    public static final FoodProperties CHALUPA = new FoodProperties.Builder().nutrition(7).saturationMod(10f).build();
}
