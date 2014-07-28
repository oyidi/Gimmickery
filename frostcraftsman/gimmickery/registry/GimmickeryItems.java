package net.frostcraftsman.gimmickery.registry;

import net.frostcraftsman.gimmickery.GimmickerysPartsCatalog.*;
import net.frostcraftsman.gimmickery.GimmickerysPartsCatalog.ItemWoodWheelGearG;
import net.frostcraftsman.gimmickery.item.*;

/**
 * ÎïÆ·×¢²á
 */
public class GimmickeryItems 
{
	public static ItemWoodKarakuriNingyG WoodKarakuriNingy;
	public static ItemWoodWheelGearG WoodWheelGear;
	public static ItemWoodSkeletonFrameG WoodSkeletonFrame;
	public static ItemWoodMagicSkinG WoodMagicSkin;
	public static ItemStoneWheelGearG StoneWheelGear;
	public static ItemStoneSkeletonFrameG StoneSkeletonFrame;
	public static ItemStoneMagicSkinG StoneMagicSkin;
	public static ItemIronWheelGearG IronWheelGear;
	public static ItemIronSkeletonFrameG IronSkeletonFrame;
	public static ItemIronMagicSkinG IronMagicSkin;
	public static ItemGoldWheelGearG GoldWheelGear;
	public static ItemGoldSkeletonFrameG GoldSkeletonFrame;
	public static ItemGoldMagicSkinG GoldMagicSkin;
	public static ItemDiamondWheelGearG DiamondWheelGear;
	public static ItemDiamondSkeletonFrameG DiamondSkeletonFrame;
	public static ItemDiamondMagicSkinG DiamondMagicSkin;
	public static ItemEmptyIntelligenceCoreG EmptyIntelligenceCore;
	public static ItemElementaryMagicLubeOilG ElementaryMagicLubeOil;
	public static ItemPrinnyBlue PrinnyBlue;
	
	public static void init() 
	{
		WoodWheelGear = new ItemWoodWheelGearG(7000);
		WoodSkeletonFrame = new ItemWoodSkeletonFrameG(7001);
		WoodMagicSkin = new ItemWoodMagicSkinG(7002);
		WoodKarakuriNingy = new ItemWoodKarakuriNingyG(7016);
		StoneWheelGear = new ItemStoneWheelGearG(7003);
		StoneSkeletonFrame = new ItemStoneSkeletonFrameG(7004);
		StoneMagicSkin = new ItemStoneMagicSkinG(7005);
		IronWheelGear = new ItemIronWheelGearG(7006);
		IronSkeletonFrame = new ItemIronSkeletonFrameG(7007);
		IronMagicSkin = new ItemIronMagicSkinG(7008);
		GoldWheelGear = new ItemGoldWheelGearG(7009);
		GoldSkeletonFrame = new ItemGoldSkeletonFrameG(7010);
		GoldMagicSkin = new ItemGoldMagicSkinG(7011);
		DiamondWheelGear = new ItemDiamondWheelGearG(7012);
		DiamondSkeletonFrame = new ItemDiamondSkeletonFrameG(7013);
		DiamondMagicSkin = new ItemDiamondMagicSkinG(7014);
		EmptyIntelligenceCore = new ItemEmptyIntelligenceCoreG(7015);
		ElementaryMagicLubeOil = new ItemElementaryMagicLubeOilG(7017);
		PrinnyBlue = new ItemPrinnyBlue(7018);
    }
}
