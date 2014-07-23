package net.frostcraftsman.gimmickery.registry;

import net.frostcraftsman.gimmickery.block.*;
import net.minecraft.block.material.Material;


/**
 * ·½¿é×¢²áÀà
 */
public class GimmickeryBlocks {

	public static BlockPowerSourceG PowerSourceBlock;
	public static BlockPrecisionWorkBenchG PrecisionWorkBench;

	public static void init() {
		PowerSourceBlock = new BlockPowerSourceG(3500, Material.iron);
		PrecisionWorkBench = new BlockPrecisionWorkBenchG(3501,Material.iron);
	}
}
