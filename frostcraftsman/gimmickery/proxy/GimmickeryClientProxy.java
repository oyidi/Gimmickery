package net.frostcraftsman.gimmickery.proxy;

import net.frostcraftsman.gimmickery.entity.EntityPrinnyBlue;
import net.frostcraftsman.gimmickery.entity.EntityWoodKarakuriNingyG;
import net.frostcraftsman.gimmickery.event.KarakuriNingySoundEvent;
import net.frostcraftsman.gimmickery.event.PrinnyBlueSoundEvent;
import net.frostcraftsman.gimmickery.model.ModelCristal;
import net.frostcraftsman.gimmickery.model.ModelPrinnyBlue;
import net.frostcraftsman.gimmickery.model.ModelRailgun;
import net.frostcraftsman.gimmickery.render.MuiltyFaceBlockRender;
import net.frostcraftsman.gimmickery.render.RenderCristalTileEntity;
import net.frostcraftsman.gimmickery.render.RenderPrinnyBlue;
import net.frostcraftsman.gimmickery.render.RenderWoodKarakuriNingyG;
import net.frostcraftsman.gimmickery.tileentity.CristalTileEntity;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class GimmickeryClientProxy extends GimmickeryCommonProxy{

	public void preInit() {
        super.preInit();
    }
    
	public void init() 
	{
        super.init();
        RenderingRegistry.registerBlockHandler(new MuiltyFaceBlockRender());
        GameRegistry.registerTileEntity(CristalTileEntity.class, "TileEntityCristal");
        ClientRegistry.bindTileEntitySpecialRenderer(CristalTileEntity.class, new RenderCristalTileEntity());
    }
    
    public void postInit() {
        super.postInit();
    }
    
    @Override
    public void registerRenderThings() 
    {
            RenderingRegistry.registerEntityRenderingHandler(EntityWoodKarakuriNingyG.class, new RenderWoodKarakuriNingyG(new ModelPrinnyBlue(), 0.5F));//the 0.5F is the shadowsize            
    		
    		RenderingRegistry.registerEntityRenderingHandler(EntityPrinnyBlue.class, new RenderPrinnyBlue(new ModelPrinnyBlue(), 0.5F));//the 0.5F is the shadowsize            
    }
    
    @Override
    public void registerSound() {
           MinecraftForge.EVENT_BUS.register(new KarakuriNingySoundEvent());//register the sound event handling class
           MinecraftForge.EVENT_BUS.register(new PrinnyBlueSoundEvent());//register the sound event handling class
    }
}
