package net.frostcraftsman.gimmickery.item;

import net.frostcraftsman.gimmickery.Gimmickery;

public class ItemEmptyIntelligenceCoreG extends GimmickeryItemBase
{

	public ItemEmptyIntelligenceCoreG(int id) 
	{
		super(id);
		this.st("EmptyIntelligenceCore","未被填入灵魂的核心");
		this.setCreativeTab(Gimmickery.gct);
		this.setMaxStackSize(64);//最大堆叠默认64，可省略
	}

}
