package net.frostcraftsman.gimmickery.proxy;

import net.frostcraftsman.gimmickery.entity.EntityWoodKarakuriNingyG;
import net.frostcraftsman.gimmickery.event.KarakuriNingySoundEvent;
import net.frostcraftsman.gimmickery.model.ModelCristal;
import net.frostcraftsman.gimmickery.model.ModelPrinnyBlue;
import net.frostcraftsman.gimmickery.model.ModelRailgun;
import net.frostcraftsman.gimmickery.render.MuiltyFaceBlockRender;
import net.frostcraftsman.gimmickery.render.RenderWoodKarakuriNingyG;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class GimmickeryClientProxy extends GimmickeryCommonProxy{

	public void preInit() {
        super.preInit();
    }
    
    public void init() {
        super.init();
		RenderingRegistry.registerBlockHandler(new MuiltyFaceBlockRender(new ModelCristal(), 0.2F));
    }
    
    public void postInit() {
        super.postInit();
    }
    
    @Override
    public void registerRenderThings() 
    {
            RenderingRegistry.registerEntityRenderingHandler(EntityWoodKarakuriNingyG.class, new RenderWoodKarakuriNingyG(new ModelPrinnyBlue(), 0.5F));//the 0.5F is the shadowsize
    		System.out.printf("233");
    }
    
    @Override
    public void registerSound() {
           MinecraftForge.EVENT_BUS.register(new KarakuriNingySoundEvent());//register the sound event handling class
    }
}
