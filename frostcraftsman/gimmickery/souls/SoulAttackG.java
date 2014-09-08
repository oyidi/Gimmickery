package net.frostcraftsman.gimmickery.souls;

import net.frostcraftsman.gimmickery.Gimmickery;
import net.frostcraftsman.gimmickery.item.GimmickeryItemBase;

public class SoulAttackG extends GimmickeryItemBase{

	public SoulAttackG(int id) {
		super(id);
		this.st("SoulAttack","人偶灵魂·猛攻");
		this.setCreativeTab(Gimmickery.gct);
		this.setMaxStackSize(1);//最大堆叠默认1，可省略
		// TODO Auto-generated constructor stub
	}
}
