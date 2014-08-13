package net.frostcraftsman.gimmickery.render;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.frostcraftsman.gimmickery.model.ModelCristal;
import net.frostcraftsman.gimmickery.tileentity.CristalTileEntity;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class CristalTileEntityRenderer extends TileEntitySpecialRenderer {
    private static final ResourceLocation CRISTAL_TEXTURE = new ResourceLocation("gimmickery:textures\\blocks\\cristal.png");
    public static CristalTileEntityRenderer cristalRenderer;
    private ModelCristal cristalModel = new ModelCristal();




	@Override
	public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8){
        this.renderTileEntityCristalAt((CristalTileEntity)par1TileEntity, par2, par4, par6, par8);
	}

    public void renderTileEntityCristalAt(CristalTileEntity par1TileEntitySkull, double par2, double par4, double par6, float par8)
    {
        this.rendering((float)par2, (float)par4, (float)par6, par1TileEntitySkull.getBlockMetadata() & 7,par1TileEntitySkull.getCristalType());
    }
    public void rendering(float par1, float par2, float par3, int par4, int par6){
    	this.bindTexture(CRISTAL_TEXTURE);
    	GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_CULL_FACE);
        GL11.glTranslatef(par1 + 0.5F, par2 + 0.5F, par3 + 0.5F);
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glScalef(1.0F, -1.0F, 1.0F);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        cristalModel.render((Entity)null, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }

}
