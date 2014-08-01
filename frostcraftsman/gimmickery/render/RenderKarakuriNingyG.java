package net.frostcraftsman.gimmickery.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderKarakuriNingyG extends GimmickeryRenderLivingBase{

	private static final ResourceLocation KarakuriNingy_Texture = new ResourceLocation("gimmickery:textures/entity/KarakuriNingy.png");
	
	public RenderKarakuriNingyG(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return KarakuriNingy_Texture;
    }
}