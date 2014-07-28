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
		this.setBlockBounds(0F, 0F, 0F, 1F, 2F, 1F);
		this.setLightOpacity(0);
		this.setLightValue(1.0F);
		this.isBlockContainer=true;
	}
	@Override
	public TileEntity createTileEntity(World world, int metadata){
		return new CristalTileEntity();
	}
	@Override
	public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        super.onBlockAdded(par1World, par2, par3, par4);
        System.out.println(1);
        par1World.setBlockTileEntity(par2, par3, par4, createTileEntity(par1World,par1World.getBlockMetadata(par2, par3, par4)));
        System.out.println(2);
    }
	@Override
	public boolean hasTileEntity(){
		return true;
	}
	@Override
	public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        par1World.removeBlockTileEntity(par2, par3, par4);
    }
	@Override
    public boolean onBlockEventReceived(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        super.onBlockEventReceived(par1World, par2, par3, par4, par5, par6);
        TileEntity tileentity = par1World.getBlockTileEntity(par2, par3, par4);
        return tileentity != null ? tileentity.receiveClientEvent(par5, par6) : false;
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