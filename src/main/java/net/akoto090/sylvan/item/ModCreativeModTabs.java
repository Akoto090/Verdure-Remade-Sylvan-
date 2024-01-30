package net.akoto090.sylvan.item;

import net.akoto090.sylvan.Sylvan;
import net.akoto090.sylvan.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Sylvan.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SYLVAN_TAB = CREATIVE_MODE_TABS.register("sylvan_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PACKED_DIRT.get()))
                    .title(Component.translatable("creativetab.sylvan_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.PACKED_DIRT.get());
                        pOutput.accept(ModBlocks.SLATE.get());
                        pOutput.accept(ModBlocks.HUMUS.get());
                        pOutput.accept(ModBlocks.DRIED_MUD.get());
                        pOutput.accept(ModBlocks.HOLLOW_LOG.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
            CREATIVE_MODE_TABS.register(eventBus);
    }
}
