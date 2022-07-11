
package net.mcreator.charlieandzacksmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.charlieandzacksmod.CharlieAndZacksModModElements;

@CharlieAndZacksModModElements.ModElement.Tag
public class KirbXPuffItem extends CharlieAndZacksModModElements.ModElement {
	@ObjectHolder("charlie_and_zacks_mod:kirb_x_puff")
	public static final Item block = null;

	public KirbXPuffItem(CharlieAndZacksModModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, CharlieAndZacksModModElements.sounds.get(new ResourceLocation("charlie_and_zacks_mod:kirb")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("kirb_x_puff");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
