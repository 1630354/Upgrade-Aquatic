package com.teamabnormals.upgrade_aquatic.core.registry.other;

import com.teamabnormals.upgrade_aquatic.core.registry.UABlocks;
import com.teamabnormals.upgrade_aquatic.core.registry.UAItems;

import net.minecraft.block.ComposterBlock;

public class UACompostables {
	
	public static void registerCompostables() {
		ComposterBlock.registerCompostable(0.3F, UABlocks.BEACHGRASS);
		ComposterBlock.registerCompostable(0.5F, UABlocks.TALL_BEACHGRASS);
		ComposterBlock.registerCompostable(0.65F, UABlocks.BEACHGRASS_THATCH);
		ComposterBlock.registerCompostable(0.65F, UABlocks.BEACHGRASS_THATCH_STAIRS);
		ComposterBlock.registerCompostable(0.65F, UABlocks.BEACHGRASS_THATCH_SLAB);
		ComposterBlock.registerCompostable(0.3F, UABlocks.PICKERELWEED_BLUE);
		ComposterBlock.registerCompostable(0.3F, UABlocks.PICKERELWEED_PURPLE);
		ComposterBlock.registerCompostable(0.3F, UAItems.BOILED_PICKERELWEED_BLUE.get());
		ComposterBlock.registerCompostable(0.3F, UAItems.BOILED_PICKERELWEED_PURPLE.get());
		ComposterBlock.registerCompostable(0.5F, UABlocks.BLUE_PICKERELWEED_BLOCK);
		ComposterBlock.registerCompostable(0.5F, UABlocks.PURPLE_PICKERELWEED_BLOCK);
		ComposterBlock.registerCompostable(0.5F, UABlocks.BOILED_BLUE_PICKERELWEED_BLOCK);
		ComposterBlock.registerCompostable(0.5F, UABlocks.BOILED_PURPLE_PICKERELWEED_BLOCK);
		ComposterBlock.registerCompostable(0.65F, UABlocks.FLOWERING_RUSH);
		ComposterBlock.registerCompostable(0.65F, UABlocks.SEAROCKET_WHITE);
		ComposterBlock.registerCompostable(0.65F, UABlocks.SEAROCKET_PINK);
		ComposterBlock.registerCompostable(0.3F, UABlocks.TONGUE_KELP);
		ComposterBlock.registerCompostable(0.3F, UABlocks.THORNY_KELP);
		ComposterBlock.registerCompostable(0.3F, UABlocks.OCHRE_KELP);
		ComposterBlock.registerCompostable(0.3F, UABlocks.POLAR_KELP);
		ComposterBlock.registerCompostable(0.5F, UABlocks.KELP_BLOCK);
		ComposterBlock.registerCompostable(0.5F, UABlocks.TONGUE_KELP_BLOCK);
		ComposterBlock.registerCompostable(0.5F, UABlocks.THORNY_KELP_BLOCK);
		ComposterBlock.registerCompostable(0.5F, UABlocks.OCHRE_KELP_BLOCK);
		ComposterBlock.registerCompostable(0.5F, UABlocks.POLAR_KELP_BLOCK);
	}
	
}
