package net.frostcraftsman.gimmickery.proxy;

import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class GimmickeryClientProps 
{
	public final static int RENDER_MUILTY_FACE_BLOCK = RenderingRegistry.getNextAvailableRenderId();
	public final static ResourceLocation TEX_DEFAULT = new ResourceLocation("gimmickery:textures/default.png");
}
