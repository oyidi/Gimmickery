package net.frostcraftsman.gimmickery.GimmickerysPartsCatalog;

import net.frostcraftsman.gimmickery.Gimmickery;
import net.frostcraftsman.gimmickery.item.GimmickeryItemBase;

public class ItemWoodWheelGearG extends GimmickeryItemBase
{

	public ItemWoodWheelGearG(int id) 
	{
		super(id);
		this.st("WoodWheelGear","木质齿轮");
		this.setCreativeTab(Gimmickery.gct);
		this.setMaxStackSize(64);//最大堆叠默认64，可省略
		// TODO Auto-generated constructor stub
	}

}
