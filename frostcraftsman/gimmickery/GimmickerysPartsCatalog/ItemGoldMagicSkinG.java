package net.frostcraftsman.gimmickery.GimmickerysPartsCatalog;

import net.frostcraftsman.gimmickery.Gimmickery;
import net.frostcraftsman.gimmickery.item.GimmickeryItemBase;

public class ItemGoldMagicSkinG extends GimmickeryItemBase
{

	public ItemGoldMagicSkinG(int id) 
	{
		super(id);
		this.st("GoldMagicSkin","金质人偶皮肤");
		this.setCreativeTab(Gimmickery.gct);
		this.setMaxStackSize(64);//最大堆叠默认64，可省略
		// TODO Auto-generated constructor stub
	}

}
