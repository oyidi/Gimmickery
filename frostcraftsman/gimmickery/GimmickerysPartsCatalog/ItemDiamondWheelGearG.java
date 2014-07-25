package net.frostcraftsman.gimmickery.GimmickerysPartsCatalog;

import net.frostcraftsman.gimmickery.Gimmickery;
import net.frostcraftsman.gimmickery.item.GimmickeryItemBase;

public class ItemDiamondWheelGearG extends GimmickeryItemBase
{

	public ItemDiamondWheelGearG(int id) 
	{
		super(id);
		this.st("DiamondWheelGear","钻石齿轮");
		this.setCreativeTab(Gimmickery.gct);
		this.setMaxStackSize(64);//最大堆叠默认64，可省略
		// TODO Auto-generated constructor stub
	}

}
