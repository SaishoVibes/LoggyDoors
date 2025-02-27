
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.logdoormod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;

import net.mcreator.logdoormod.LoggyDoorsMod;

public class LoggyDoorsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LoggyDoorsMod.MODID);
	public static final DeferredItem<Item> LOGGY_DOOR_OAK = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_OAK);
	public static final DeferredItem<Item> LOGGY_DOOR_STRIPPED_OAK = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_OAK);
	public static final DeferredItem<Item> LOGGY_DOOR_BIRCH = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_BIRCH);
	public static final DeferredItem<Item> LOGGY_DOOR_STRIPPED_BIRCH = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_BIRCH);
	public static final DeferredItem<Item> LOGGY_DOOR_JUNGLE = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_JUNGLE);
	public static final DeferredItem<Item> LOGGY_DOOR_SPRUCE = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_SPRUCE);
	public static final DeferredItem<Item> LOGGY_DOOR_ACACIA = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_ACACIA);
	public static final DeferredItem<Item> LOGGY_DOOR_DARK_OAK = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_DARK_OAK);
	public static final DeferredItem<Item> LOGGY_DOOR_CRIMSON = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_CRIMSON);
	public static final DeferredItem<Item> LOGGY_DOOR_WARPED = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_WARPED);
	public static final DeferredItem<Item> LOGGY_DOOR_MANGROVE = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_MANGROVE);
	public static final DeferredItem<Item> LOGGY_DOOR_BAMBOO = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_BAMBOO);
	public static final DeferredItem<Item> LOGGY_DOOR_CHERRY = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_CHERRY);
	public static final DeferredItem<Item> LOGGY_DOOR_STRIPPED_JUNGLE = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_JUNGLE);
	public static final DeferredItem<Item> LOGGY_DOOR_STRIPPED_SPRUCE = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_SPRUCE);
	public static final DeferredItem<Item> LOGGY_DOOR_STRIPPED_ACACIA = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_ACACIA);
	public static final DeferredItem<Item> LOGGY_DOOR_STRIPPED_DARK_OAK = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_DARK_OAK);
	public static final DeferredItem<Item> LOGGY_DOOR_STRIPPED_CRIMSON = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_CRIMSON);
	public static final DeferredItem<Item> LOGGY_DOOR_STRIPPED_WARPED = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_WARPED);
	public static final DeferredItem<Item> LOGGY_DOOR_STRIPPED_MANGROVE = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_MANGROVE);
	public static final DeferredItem<Item> LOGGY_DOOR_STRIPPED_BAMBOO = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_BAMBOO);
	public static final DeferredItem<Item> LOGGY_DOOR_STRIPPED_CHERRY = doubleBlock(LoggyDoorsModBlocks.LOGGY_DOOR_STRIPPED_CHERRY);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
