package net.frostcraftsman.gimmickery.GimmickerysPartsCatalog;

import net.frostcraftsman.gimmickery.Gimmickery;
import net.frostcraftsman.gimmickery.item.GimmickeryItemBase;

public class ItemDiamondSkeletonFrameG extends GimmickeryItemBase
{

	public ItemDiamondSkeletonFrameG (int id) 
	{
		super(id);
		this.st("StoneWheelGear","钻石人偶骨架");
		this.setCreativeTab(Gimmickery.gct);
		this.setMaxStackSize(64);//最大堆叠默认64，可省略
		// TODO Auto-generated constructor stub
	}

}
