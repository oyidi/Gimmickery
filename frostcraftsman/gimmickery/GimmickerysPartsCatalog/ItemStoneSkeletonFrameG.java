package net.frostcraftsman.gimmickery.GimmickerysPartsCatalog;

import net.frostcraftsman.gimmickery.Gimmickery;
import net.frostcraftsman.gimmickery.item.GimmickeryItemBase;

public class ItemStoneSkeletonFrameG extends GimmickeryItemBase
{

	public ItemStoneSkeletonFrameG(int id) 
	{
		super(id);
		this.st("StoneSkeletonFrame","石质人偶骨架");
		this.setCreativeTab(Gimmickery.gct);
		this.setMaxStackSize(64);
	}

}
