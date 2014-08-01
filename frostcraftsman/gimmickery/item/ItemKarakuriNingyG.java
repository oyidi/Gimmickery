package net.frostcraftsman.gimmickery.item;

import net.frostcraftsman.gimmickery.Gimmickery;
import net.frostcraftsman.gimmickery.entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemKarakuriNingyG extends GimmickeryItemBase{

	public ItemKarakuriNingyG(int id) {
		super(id);
		this.st("KarakuriNingy", "»À≈º≥ı∞Ê");
		this.setCreativeTab(Gimmickery.gct);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,EntityPlayer par3EntityPlayer)
	{
		if(!par2World.isRemote)
		{
		EntityKarakuriNingyG entity = new EntityKarakuriNingyG(par2World, par3EntityPlayer.posX, par3EntityPlayer.posY + par3EntityPlayer.getEyeHeight(), par3EntityPlayer.posZ, par3EntityPlayer);
		par2World.spawnEntityInWorld(entity);
		}
		return par1ItemStack;
    }
}