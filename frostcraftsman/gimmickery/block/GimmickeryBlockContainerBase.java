package net.frostcraftsman.gimmickery.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;


/**
 * 所有方块的父类
 */
public class GimmickeryBlockContainerBase extends BlockContainer{

	/**
	 * @param par2Material 方块材质
	 */
	public GimmickeryBlockContainerBase(int id, Material par2Material) {
		super(id, par2Material);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 请参考GimmickeryItemBase
	 * @param par1Str 内部名称，贴图文件名
	 * @param par2Str 显示的名字
	 */
	public void stb(String par1Str,String par2Str){
		if(par1Str != ""){
			this.setUnlocalizedName(par1Str);
			this.setTextureName("gimmickery:" + par1Str);
			LanguageRegistry.addName(this, par2Str);
			GameRegistry.registerBlock(this, par1Str);
		}
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		// TODO Auto-generated method stub
		return null;
	}
}
