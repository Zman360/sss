
package net.mcreator.charlieandzacksmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.charlieandzacksmod.CharlieAndZacksModModElements;

@CharlieAndZacksModModElements.ModElement.Tag
public class DDDItem extends CharlieAndZacksModModElements.ModElement {
	@ObjectHolder("charlie_and_zacks_mod:ddd")
	public static final Item block = null;

	public DDDItem(CharlieAndZacksModModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, CharlieAndZacksModModElements.sounds.get(new ResourceLocation("charlie_and_zacks_mod:dd")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("ddd");
		}
	}
}
