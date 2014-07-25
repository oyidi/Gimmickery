package net.frostcraftsman.gimmickery.proxy;

import net.frostcraftsman.gimmickery.model.ModelCristal;
import net.frostcraftsman.gimmickery.render.MuiltyFaceBlockRender;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class GimmickeryClientProxy extends GimmickeryCommonProxy{


	public void preInit() {
        super.preInit();
    }
    
    public void init() {
        super.init();
        RenderingRegistry.registerBlockHandler(new MuiltyFaceBlockRender(new ModelCristal(), 0.5F));
    }
    
    public void postInit() {
        super.postInit();
    }
}