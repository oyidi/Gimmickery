package net.frostcraftsman.gimmickery.render;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.frostcraftsman.gimmickery.Gimmickery;
import net.frostcraftsman.gimmickery.model.ModelCristal;
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
		((ModelCristal)this.model).render();
        GL11.glTranslated(x, y, z);
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
