package net.frostcraftsman.gimmickery.item;

import net.frostcraftsman.gimmickery.Gimmickery;

public class ItemElementaryMagicLubeOilG extends GimmickeryItemBase
{

	public ItemElementaryMagicLubeOilG(int id) 
	{
		super(id);
		this.st("ElementaryMagicLubeOil","机巧人偶润滑油");
		this.setCreativeTab(Gimmickery.gct);
		this.setMaxStackSize(64);//最大堆叠默认64，可省略
	}

}
