package net.akoto090.sylvan.registry;

import net.akoto090.sylvan.Sylvan;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.akoto090.sylvan.block.entity.HollowLogBlockEntity;

public class SylvanBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCKENTITY, Sylvan.MOD_ID);

    public static final RegistryObject<BlockEntityType<HollowLogBlockEntity>> HOLLOW_LOG = BLOCK_ENTITY_TYPES.register("hollow_log", () -> BlockEntityType.Builder.of(HollowLogBlockEntity::new, SylvanBlocks.HOLLOW_LOG.get()).build(null));
}
