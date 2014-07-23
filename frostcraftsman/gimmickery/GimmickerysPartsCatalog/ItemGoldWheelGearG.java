package net.frostcraftsman.gimmickery.GimmickerysPartsCatalog;

import net.frostcraftsman.gimmickery.Gimmickery;
import net.frostcraftsman.gimmickery.item.GimmickeryItemBase;

public class ItemGoldWheelGearG extends GimmickeryItemBase
{

	public ItemGoldWheelGearG(int id) 
	{
		super(id);
		this.st("GoldWheelGear","金质齿轮");
		this.setCreativeTab(Gimmickery.gct);
		this.setMaxStackSize(64);//最大堆叠默认64，可省略
		// TODO Auto-generated constructor stub
	}

}
