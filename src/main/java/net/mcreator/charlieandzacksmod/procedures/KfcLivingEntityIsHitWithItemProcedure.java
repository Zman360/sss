package net.mcreator.charlieandzacksmod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.charlieandzacksmod.CharlieAndZacksModMod;

import java.util.Map;

public class KfcLivingEntityIsHitWithItemProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CharlieAndZacksModMod.LOGGER.warn("Failed to load dependency entity for procedure KfcLivingEntityIsHitWithItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).attackEntityFrom(new DamageSource("custom").setDamageBypassesArmor(), (float) 4);
		}
	}
}
