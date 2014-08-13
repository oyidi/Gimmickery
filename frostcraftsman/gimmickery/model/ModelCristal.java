// Date: 2014/7/23 12:36:36
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.frostcraftsman.gimmickery.model;

import org.lwjgl.opengl.GL11;

import net.frostcraftsman.gimmickery.proxy.GimmickeryClientProps;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;

public class ModelCristal extends GimmickeryModelBase
{
  //fields
	float i = 0;
    ModelRenderer Cristal;
    ModelRenderer goldchip1;
    ModelRenderer goldchip2;
  
    public ModelCristal()
    {
  	  	textureWidth = 64;
  	  	textureHeight = 32;
  	  	setTextureOffset("Piece1.goldchip1", 0, 0);
  	  	setTextureOffset("Piece1.goldchip2", 0, 0);
  	  	setGlScale(0.9F,2.0F,0.9F);
        Cristal = new ModelRenderer(this, 0, 0);
        Cristal.addBox(-8F, -8F, -8F, 16, 16, 16);
        Cristal.setRotationPoint(0F, -8F, 0F);
        Cristal.mirror = true;
        goldchip1 = new ModelRenderer(this,0,0);
        goldchip2 = new ModelRenderer(this,0,0);
        goldchip1.addBox(16F, -16F, -2F, 1, 10, 6);
        goldchip1.setRotationPoint(0F, -8F, 0F);
        goldchip2.addBox(-16F, -16F, -4F, 1, 10, 6);
        goldchip2.setRotationPoint(0F, -8F, 0F);
    }
  @Override
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
      this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
      setRotation(Cristal, 0.7853982F, -i, 0.6154729F);
      this.Cristal.render(par7);
      setRotation(goldchip1,0,i,0);
      setRotation(goldchip2,0,i,0);
      i+=0.01;
      goldchip1.render(par7);
      goldchip2.render(par7);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6,Entity par7Entity)
  {
      super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
      this.Cristal.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Cristal.rotateAngleX = par5 / (180F / (float)Math.PI);  
  }

}
