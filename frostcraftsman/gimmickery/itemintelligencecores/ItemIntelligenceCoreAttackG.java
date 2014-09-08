package net.frostcraftsman.gimmickery.itemintelligencecores;

import net.frostcraftsman.gimmickery.Gimmickery;
import net.frostcraftsman.gimmickery.item.GimmickeryItemBase;

public class ItemIntelligenceCoreAttackG extends GimmickeryItemBase
{

	public ItemIntelligenceCoreAttackG(int id) 
	{
		super(id);
		this.st("IntelligenceCoreAttack","灵魂核心·猛攻");
		this.setCreativeTab(Gimmickery.gct);
		this.setMaxStackSize(64);//最大堆叠默认64，可省略
	}
}

