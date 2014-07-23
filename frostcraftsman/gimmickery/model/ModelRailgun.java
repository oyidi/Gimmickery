// Date: 2014/7/22 20:19:43
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.frostcraftsman.gimmickery.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRailgun extends ModelBase
{
  //fields
    ModelRenderer Piece1;
    ModelRenderer Piece2;
    ModelRenderer Piece3;
  
  public ModelRailgun()
  {
    textureWidth = 256;
    textureHeight = 128;
    setTextureOffset("Piece1.Turrut", 0, 32);
    setTextureOffset("Piece2.TurretL", 112, 0);
    setTextureOffset("Piece2.TurretR", 112, 0);
    setTextureOffset("Piece2.TurrutLT", 0, 0);
    setTextureOffset("Piece2.TurrutRT", 0, 0);
    setTextureOffset("Piece3.paoguanLT", 16, 0);
    setTextureOffset("Piece3.paoguanB", 16, 0);
    setTextureOffset("Piece3.paoguanRB", 16, 0);
    
    Piece1 = new ModelRenderer(this, "Piece1");
    Piece1.setRotationPoint(0F, 0F, 0F);
    setRotation(Piece1, 0F, 0F, 0F);
    Piece1.mirror = true;
    Piece1.addBox("Turrut", -8F, -8F, -16F, 16, 16, 32);
    Piece2 = new ModelRenderer(this, "Piece2");
    Piece2.setRotationPoint(0F, 0F, 0F);
    setRotation(Piece2, 0F, 0F, 0F);
    Piece2.mirror = true;
    Piece2.addBox("TurretL", -16F, 4F, 0F, 8, 4, 16);
    Piece2.addBox("TurretR", 8F, 4F, 0F, 8, 4, 16);
    Piece2.addBox("TurrutLT", -8F, -12F, 0F, 4, 4, 24);
    Piece2.addBox("TurrutRT", 4F, -12F, 0F, 4, 4, 24);
    Piece3 = new ModelRenderer(this, "Piece3");
    Piece3.setRotationPoint(0F, 0F, 0F);
    setRotation(Piece3, 0F, 0F, 0F);
    Piece3.mirror = true;
    Piece3.addBox("paoguanT", -4F, -10F, -88F, 8, 4, 80);
    Piece3.addBox("paoguanLT", 7F, -8F, -92F, 4, 4, 80);
    Piece3.addBox("paoguanRT", -11F, -8F, -92F, 4, 4, 80);
    Piece3.addBox("paoguanB", -4F, 8F, -88F, 8, 4, 80);
    Piece3.addBox("paoguanLB", 7F, 4F, -92F, 4, 4, 80);
    Piece3.addBox("paoguanRB", -11F, 4F, -92F, 4, 4, 80);
    Piece2.addChild(Piece3);
    Piece1.addChild(Piece2);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Piece1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity par7)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, par7);
  }

}