
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.logdoormod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.logdoormod.LoggyDoorsMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class LoggyDoorsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LoggyDoorsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_OAK.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_OAK.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_BIRCH.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_BIRCH.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_JUNGLE.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_SPRUCE.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_ACACIA.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_DARK_OAK.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_CRIMSON.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_WARPED.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_MANGROVE.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_BAMBOO.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_CHERRY.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_JUNGLE.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_SPRUCE.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_ACACIA.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_DARK_OAK.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_CRIMSON.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_WARPED.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_MANGROVE.get().asItem());
			tabData.accept(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_BAMBOO.get().asItem());
		}
	}
}
