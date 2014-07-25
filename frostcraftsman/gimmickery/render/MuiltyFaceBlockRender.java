package net.frostcraftsman.gimmickery.render;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.frostcraftsman.gimmickery.Gimmickery;
import net.frostcraftsman.gimmickery.proxy.GimmickeryClientProps;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.world.IBlockAccess;

public class MuiltyFaceBlockRender extends GimmickeryRenderLivingBase implements ISimpleBlockRenderingHandler{
	ModelBase model;
	public MuiltyFaceBlockRender(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		this.model=par1ModelBase;
	}

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID,
			RenderBlocks renderer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
			Block block, int modelId, RenderBlocks renderer) {
		// TODO Auto-generated method stub
		TextureManager renderEngine = Minecraft.getMinecraft().renderEngine;
		GL11.glPushMatrix();
		renderEngine.bindTexture(GimmickeryClientProps.TEX_CRISTAL);
		GL11.glDisable(GL11.GL_LIGHTING); //关闭光照
        GL11.glEnable(GL11.GL_BLEND); //开启混合
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA); //混合模式设定
        GL11.glDisable(GL11.GL_CULL_FACE); //关闭面剔除
        GL11.glTranslated(x, y, z);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240f, 240f);
        this.model.render(null, 0, 0, 0, 0, 0, 0);
        GL11.glPopMatrix();
		return true;
	}

	@Override
	public boolean shouldRender3DInInventory() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getRenderId() {
		// TODO Auto-generated method stub
		return GimmickeryClientProps.RENDER_MUILTY_FACE_BLOCK;
	}

}
