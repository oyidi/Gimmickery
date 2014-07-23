package net.frostcraftsman.gimmickery.GimmickerysPartsCatalog;

import net.frostcraftsman.gimmickery.Gimmickery;
import net.frostcraftsman.gimmickery.item.GimmickeryItemBase;

public class ItemWoodMagicSkinG extends GimmickeryItemBase
{

	public ItemWoodMagicSkinG(int id) {
		super(id);
		this.st("WoodMagicSkin","木质人偶皮肤");
		this.setCreativeTab(Gimmickery.gct);
		this.setMaxStackSize(64);//最大堆叠默认64，可省略
	}

}
