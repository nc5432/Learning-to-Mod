package com.nc543.learningtomod.item.custom;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class SelfDestructButton extends Item{

    public SelfDestructButton(Properties properties) {
        super(properties);
    }
    
    // @Override
    // public InteractionResult useOn(UseOnContext context) {
    //     if (context.getLevel().isClientSide()){
    //         Player player = context.getPlayer();
    //         context.getLevel().explode((Entity) player, player.position().x, player.position().y, player.position().z);
    //     }
    //     return super.useOn(context);
    // }
}
