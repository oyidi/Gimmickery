package net.frostcraftsman.gimmickery.block;

import net.frostcraftsman.gimmickery.Gimmickery;
import net.frostcraftsman.gimmickery.proxy.GimmickeryClientProps;
import net.frostcraftsman.gimmickery.tileentity.CristalTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public class BlockPowerSourceG extends GimmickeryBlockContainerBase{

	public BlockPowerSourceG(int id, Material par2Material) {
		super(id, par2Material);
		this.stb("PowerSourceBlock", "能源方块");
		this.setHardness(1.5f); //可省略
		this.setResistance(10.0f); //可省略
		this.setStepSound(Block.soundStoneFootstep); //可省略
		this.setCreativeTab(Gimmickery.gct); //可省略
		// TODO Auto-generated constructor stub
		this.setBlockBounds(0F, 0F, 0F, 1F, 2F, 1F);
		this.setLightOpacity(0);
		this.setLightValue(1.0F);
	}
	@Override
	public TileEntity createNewTileEntity(World world){
		return new CristalTileEntity();
	}
	
	public boolean isOpaqueCube()
    {
        return false;
    }

	public boolean renderAsNormalBlock()
    {
        return false;
    }
	
	public int getRenderType()
    {
        return GimmickeryClientProps.RENDER_MUILTY_FACE_BLOCK;
    }
	
	public boolean isFlammable(IBlockAccess world, int x, int y, int z, int metadata, ForgeDirection face)
    {
        return false;
    }
}