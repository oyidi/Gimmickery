package net.frostcraftsman.gimmickery.render;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.frostcraftsman.gimmickery.model.ModelCristal;
import net.frostcraftsman.gimmickery.proxy.GimmickeryClientProps;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderCristalTileEntity extends TileEntitySpecialRenderer {
	private static final ResourceLocation texture = GimmickeryClientProps.TEX_CRISTAL;
    public static RenderCristalTileEntity cristalRenderer;
    ModelCristal modelcristal=new ModelCristal();
    @Override
    public void setTileEntityRenderer(TileEntityRenderer par1TileEntityRenderer)
    {
        super.setTileEntityRenderer(par1TileEntityRenderer);
        cristalRenderer = this;
    }


	@Override
	public void renderTileEntityAt(TileEntity tileentity, double d0, double d1,
			double d2, float f) {
		// TODO Auto-generated method stub
		this.bindTexture(texture);
		GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_CULL_FACE);
        GL11.glTranslatef((float)d0,(float)d1,(float)d2);
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glScalef(-1.0F, -1.0F, 1.0F);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        modelcristal.render((Entity)null, 0.0F, 0.0F, 0.0F, -1F, 0.0F, f);
        GL11.glPopMatrix();
	}
}
