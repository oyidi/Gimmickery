package net.frostcraftsman.gimmickery.entity;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.frostcraftsman.gimmickery.registry.GimmickeryBlocks;
import net.frostcraftsman.gimmikery.world.WorldG;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIDefendVillage;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookAtVillager;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.village.Village;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDummyContainer;
import net.frostcraftsman.gimmickery.block.*;


public class EntityWoodKarakuriNingyG extends EntityMob{

    public EntityWoodKarakuriNingyG(World par1World) {
		super(par1World);
        this.setSize(1.4F, 2.9F);      
        experienceValue = 5;     

	}

	/** deincrements, and a distance-to-home check is done at 0 */
    int distance=10;
    int id;
    int kposX;
    int jposY;
    int iposZ;

	public EntityWoodKarakuriNingyG(World par1World, double par2, double par4, double par6, EntityLivingBase par8EntityLivingBase)
    {
        this(par1World);
        this.setPosition(par2, par4, par6);
        if(this.findPowerSource() == true)
        {
        float f = (float)(Math.random() * Math.PI * 2.0D);
        this.motionX = (double)(-((float)Math.sin((double)f)) * 0.02F);
        this.motionY = 0.20000000298023224D;
        this.motionZ = (double)(-((float)Math.cos((double)f)) * 0.02F);
        this.prevPosX = par2;
        this.prevPosY = par4;
        this.prevPosZ = par6;
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, true, IMob.mobSelector));
        System.out.println("成功获得能量。");
        }
        else
        {
            System.out.println("能量·零·运动·不能。。。");
        }
    }

	@Override
	protected Entity findPlayerToAttack() {
		// TODO 自动生成的方法存根
		return super.findPlayerToAttack();
	}
	
	
	public boolean findPowerSource()
	{
		for(int i=1; i<distance; i++)
		{        
		    for(int j=1; j<distance; j++)
		    {
		        for(int k=1; k<distance; k++)
		    	{
		        	 kposX=(int)(this.posX+k);
		        	 jposY=(int)(this.posY+j);
		        	 iposZ=(int)(this.posZ+i);
		        	 
		    			 id = this.worldObj.getBlockId(kposX, jposY, iposZ);
		    				 
		 				 System.out.println("现在是x轴方向,第"+k+"次探索，现x坐标"+kposX+",现y坐标"+jposY+",现z坐标"+iposZ+",现id号"+id);
		 					
		 				 if (id == GimmickeryBlocks.PowerSourceBlock.blockID)
		    				{
		    				     System.out.println("已定位到魔方X轴坐标:"+kposX);
		    				     return true;
		    				}
		 			     else
		 					{
		 						
		 						 System.out.println("x轴方向未发现。");
		 						      
		 					}			
		    	}
		        
		     System.out.println("现在是y轴方向,第"+j+"次探索，现x坐标"+kposX+",现y坐标"+jposY+",现z坐标"+iposZ+",现id号"+id);
					
		     if (id == GimmickeryBlocks.PowerSourceBlock.blockID)
			    {
		    	
				     System.out.println("已定位到魔方Y轴坐标:"+jposY);
				     return true;
				    
			    }
		     else
			    {
				
				     System.out.println("Y轴方向未发现。");
					
			    }
		    
	        }
           System.out.println("现在是z轴方向,第"+i+"次探索，现x坐标"+kposX+",现y坐标"+jposY+",现z坐标"+iposZ+",现id号"+id);
			
           if (id == GimmickeryBlocks.PowerSourceBlock.blockID)
			  {
				
		           System.out.println("已定位到魔方Z轴坐标:"+iposZ);
		           return true;
		        
			  }
		   else
			  {
				
				   System.out.println("Z轴方向未发现。");
				
			  }
	   }
		
		return false;
		
	}

	
	/**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();

        if (!this.worldObj.isRemote && this.worldObj.difficultySetting == 0)
        {
            this.setDead();
        }
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.23000000417232513D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(3.0D);
    }
    
    protected void entityInit()
    {
        super.entityInit();

    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    /**
     * main AI tick function, replaces updateEntityActionState
     */
    protected void updateAITick()
    {
        super.updateAITick();
    }


    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeEntityToNBT(par1NBTTagCompound);

    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readEntityFromNBT(par1NBTTagCompound);

    }

    public boolean attackEntityAsMob(Entity par1Entity)
    {
        this.worldObj.setEntityState(this, (byte)4);
        boolean flag = par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), (float)(7 + this.rand.nextInt(15)));

        if (flag)
        {
            par1Entity.motionY += 0.4000000059604645D;
        }
        return flag;
    }

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean par1, int par2)
    {
        int j = this.rand.nextInt(3);
        int k;

        for (k = 0; k < j; ++k)
        {
            this.dropItem(Block.plantRed.blockID, 1);
        }

        k = 3 + this.rand.nextInt(3);

        for (int l = 0; l < k; ++l)
        {
            this.dropItem(Item.ingotIron.itemID, 1);
        }
    }
    
    /**
     * Called when the mob's health reaches 0.
     */
    public void onDeath(DamageSource par1DamageSource)
    {
        super.onDeath(par1DamageSource);
    }

    @Override
    protected String getLivingSound()
    {
        return "gimmickery:KarakuriNingySound";//this refers to:gimmickery/sound/KarakuriNingySound
    }

    @Override
    protected String getHurtSound()
    {
        return "gimmickery:optionalFile.KarakuriNingySound";//this refers to:gimmickery/sound/optionalFile/KarakuriNingySound
    }

    @Override
    protected String getDeathSound()
    {
        return "gimmickery:optionalFile.optionalFile2.KarakuriNingySound";//etc.
    }

    @Override
    protected float getSoundVolume()
    {
        return 0.4F;
    }
}
