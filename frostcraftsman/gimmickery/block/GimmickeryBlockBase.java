package net.frostcraftsman.gimmickery.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


/**
 * 所有方块的父类
 */
public class GimmickeryBlockBase extends Block{

	/**
	 * @param par2Material 方块材质
	 */
	public GimmickeryBlockBase(int id, Material par2Material) {
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
			this.setTextureName("gimmickery:" + par1Str + ".png");
			LanguageRegistry.addName(this, par2Str);
			GameRegistry.registerBlock(this, par1Str);
		}
	}
}
