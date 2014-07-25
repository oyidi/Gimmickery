package net.frostcraftsman.gimmickery.block;

import net.frostcraftsman.gimmickery.Gimmickery;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPowerSourceG extends GimmickeryBlockBase{

	public BlockPowerSourceG(int id, Material par2Material) {
		super(id, par2Material);
		this.stb("PowerSourceBlock", "能源方块");
		this.setHardness(1.5f); //可省略
		this.setResistance(10.0f); //可省略
		this.setLightValue(0.0f); //可省略
		this.setStepSound(Block.soundStoneFootstep); //可省略
		this.setCreativeTab(Gimmickery.gct); //可省略
		// TODO Auto-generated constructor stub
	}

}
