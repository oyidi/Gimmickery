package net.frostcraftsman.gimmickery.tileentity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.frostcraftsman.gimmickery.model.ModelCristal;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet132TileEntityData;
import net.minecraft.tileentity.TileEntity;

public class CristalTileEntity extends TileEntity {
	private int cristalType;
	private int cristalRotation;
	@Override
	public void updateEntity(){
		System.out.println('a');
	}

	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setByte("CristalType", (byte)(this.cristalType & 255));
        par1NBTTagCompound.setByte("Rot", (byte)(this.cristalRotation & 255));
    }

    /**
     * Reads a tile entity from NBT.
     */
    public void readFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readFromNBT(par1NBTTagCompound);
        this.cristalType = par1NBTTagCompound.getByte("SkullType");
        this.cristalRotation = par1NBTTagCompound.getByte("Rot");
    }

    /**
     * Overriden in a sign to provide the text.
     */
    public Packet getDescriptionPacket()
    {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        this.writeToNBT(nbttagcompound);
        return new Packet132TileEntityData(this.xCoord, this.yCoord, this.zCoord, 4, nbttagcompound);
    }
    public void setCristalType(int par1)
    {
        this.cristalType = par1;
    }

    /**
     * Get the entity type for the skull
     */
    public int getCristalType()
    {
        return this.cristalType;
    }

    /**
     * Set the skull's rotation
     */
    public void setCristalRotation(int par1)
    {
        this.cristalRotation = par1;
    }

    @SideOnly(Side.CLIENT)
    public int getCristalRotation()
    {
        return this.cristalRotation;
    }
}
