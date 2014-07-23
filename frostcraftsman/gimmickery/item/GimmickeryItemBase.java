package net.frostcraftsman.gimmickery.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;


/**
 * 所有物品的父类
 */
public class GimmickeryItemBase extends Item{

	public GimmickeryItemBase(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 设置内部名称，显示物品名，贴图
	 * @param par1Str 内部名称和贴图，不用加扩张名 
	 * @param par2Str 设置玩家看到的名称 
	 */
	public void st(String par1Str,String par2Str) {
		if(par1Str != "") {
			this.setUnlocalizedName(par1Str);
			this.setTextureName("gimmickery:" + par1Str + ".png");
			LanguageRegistry.addName(this, par2Str);
		}
	}
}
