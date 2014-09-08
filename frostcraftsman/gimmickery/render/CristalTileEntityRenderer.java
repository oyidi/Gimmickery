package net.frostcraftsman.gimmickery.render;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.frostcraftsman.gimmickery.model.ModelCristal;
import net.frostcraftsman.gimmickery.tileentity.CristalTileEntity;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class CristalTileEntityRenderer extends TileEntitySpecialRenderer {
    public static CristalTileEntityRenderer cristalRenderer;
    private ModelCristal cristalModel = new ModelCristal();




	@Override
	public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8){
        this.renderTileEntityCristalAt((CristalTileEntity)par1TileEntity, par2, par4, par6, par8);
	}

    public void renderTileEntityCristalAt(CristalTileEntity par1TileEntityCristal, double par2, double par4, double par6, float par8)
    {
    	this.rendering((float)par2, (float)par4, (float)par6, par1TileEntityCristal.ticker,par1TileEntityCristal.getCristalType());
    }

    
    
    public void rendering(float par1, float par2, float par3, int par4, int par6){
    	GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_CULL_FACE);
        GL11.glTranslatef(par1 + 0.5F, par2 + 0.5F, par3 + 0.5F);
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glScalef(1.0F, -1.0F, 1.0F);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        cristalModel.ticker=par4;
        cristalModel.render((Entity)null, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0625F);
        FontRenderer fontrenderer = this.getFontRenderer();
        String s=String.valueOf(CristalTileEntity.cristalNum);
        GL11.glTranslatef(0, 1.5F, 0);
        fontrenderer.drawString(s, -fontrenderer.getStringWidth(s) / 2, 10, 0);
        GL11.glPopMatrix();
    }

}
