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
	private int Num=0;

	public BlockPowerSourceG(int id, Material par2Material) {
		super(id, par2Material);
		this.stb("PowerSourceBlock", "ÄÜÔ´·½¿é");
		this.setCreativeTab(Gimmickery.gct);
		this.setTextureName("gimmickery:cristal");
		// TODO Auto-generated constructor stub
		this.setBlockBounds(0F, 0F, 0F, 1F, 2F, 1F);
		this.setLightOpacity(0);
		this.setLightValue(1.0F);
	}
	
	public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        super.onBlockAdded(par1World, par2, par3, par4);
        CristalTileEntity.cristalNum+=1;
        System.out.println(CristalTileEntity.cristalNum);
    }

	public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        super.breakBlock(par1World, par2, par3, par4, par5, par6);
        if(CristalTileEntity.cristalNum>=0){
        	CristalTileEntity.cristalNum-=1;
        }else{
        	CristalTileEntity.cristalNum=0;
        }
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