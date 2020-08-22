package com.ollieread.ridicraft;

import com.ollieread.ridicraft.init.Blocks;
import com.ollieread.ridicraft.init.Items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Ridicraft.MOD_ID)
public class Ridicraft
{
    public final static String MOD_ID = "ridicraft";
    public final static String MOD_NAME = "Ridicraft";
    private static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        @SubscribeEvent
        public static void onBlocksRegistry(final Register<Block> blockRegistryEvent)
        {
            Blocks.register(blockRegistryEvent.getRegistry());
        }

        @SubscribeEvent
        public static void onItemsRegistry(final Register<Item> itemRegistryEvent)
        {
            Items.register(itemRegistryEvent.getRegistry());
        }
    }
}
