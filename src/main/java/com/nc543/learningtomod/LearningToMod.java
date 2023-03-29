package com.nc543.learningtomod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.nc543.learningtomod.block.BasicBlocks;
import com.nc543.learningtomod.item.BasicItems;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(LearningToMod.MODID)
public class LearningToMod {

    public static final String MODID = "learningtomod";

    private static final Logger LOGGER = LogManager.getLogger();

    public LearningToMod(){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BasicItems.register(eventBus);
        BasicBlocks.register(eventBus);
        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){}
}
