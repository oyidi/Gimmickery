// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.frostcraftsman.gimmickery.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelKarakuriNingyG extends ModelBiped
{
  //fields
    ModelRenderer bipedBody;
    ModelRenderer bipedHead;
    ModelRenderer bipedLeftArm;
    ModelRenderer bipedRightArm;
    ModelRenderer bipedLeftLeg;
    ModelRenderer bipedRightLeg;
    
    ModelRenderer collar_left;
    ModelRenderer collar_right;
    ModelRenderer collar_back;
    ModelRenderer pang_ci1;
    ModelRenderer pang_ci2;
    ModelRenderer pang_ci3;
    ModelRenderer left_skirt;
    ModelRenderer left_side_skirt_1;
    ModelRenderer left_side_skirt_2;
    ModelRenderer right_skirt;
    ModelRenderer right_side_skirt_1;
    ModelRenderer right_side_skirt_2;
    ModelRenderer front_skirt;
    ModelRenderer front_side_skirt1;
    ModelRenderer front_side_skirt_2;
    ModelRenderer back_skirt;
    ModelRenderer back_side_skirt1;
    ModelRenderer back_side_skirt2;
    ModelRenderer clothes_right_button1;
    ModelRenderer clothes_right_button2;
    ModelRenderer clothes_right_button3;
    ModelRenderer clothes_right_button4;
    ModelRenderer clothes_left_button1;
    ModelRenderer clothes_left_button2;
    ModelRenderer clothes_left_button3;
    ModelRenderer clothes_left_button4;
    ModelRenderer tie;
  
  public ModelKarakuriNingyG()
  {
    textureWidth = 256;
    textureHeight = 128;
    setTextureOffset("bipedLeftArm.left_arm", 65, 0);
    setTextureOffset("bipedLeftArm.outter_left_sleeve", 63, 34);
    setTextureOffset("bipedLeftArm.outtest_left_sleeve", 63, 47);
    setTextureOffset("bipedLeftArm.left_sleeve", 63, 15);
    setTextureOffset("bipedLeftArm.left_hand_front_fronter_lace1", 62, 83);
    setTextureOffset("bipedLeftArm.left_hand_front_fronter_lace2", 62, 83);
    setTextureOffset("bipedLeftArm.left_hand_front_fronter_lace3", 70, 83);
    setTextureOffset("bipedLeftArm.left_hand_right_fronter_lace1", 63, 97);
    setTextureOffset("bipedLeftArm.left_hand_right_fronter_lace2", 63, 97);
    setTextureOffset("bipedLeftArm.left_hand_right_fronter_lace3", 62, 97);
    setTextureOffset("bipedLeftArm.left_hand_right_fronter_lace4", 70, 97);
    setTextureOffset("bipedLeftArm.left_hand_back_fronter_lace1", 70, 90);
    setTextureOffset("bipedLeftArm.left_hand_back_fronter_lace2", 70, 90);
    setTextureOffset("bipedLeftArm.left_hand_back_fronter_lace3", 55, 97);
    setTextureOffset("bipedLeftArm.left_hand_back_fronter_lace4", 55, 83);
    setTextureOffset("bipedLeftArm.left_hand_left_fronter_lace1", 55, 90);
    setTextureOffset("bipedLeftArm.left_hand_left_fronter_lace2", 55, 90);
    setTextureOffset("bipedLeftArm.left_hand_left_fronter_lace3", 55, 90);
    setTextureOffset("bipedLeftArm.left_hand_front_lace", 63, 59);
    setTextureOffset("bipedLeftArm.left_hand_back_lace", 63, 76);
    setTextureOffset("bipedLeftArm.left_hand_left_lace", 73, 64);
    setTextureOffset("bipedLeftArm.left_hand_right_lace", 55, 64);
    setTextureOffset("bipedLeftArm.left_arm_long_sleeve_front", 63, 117);
    setTextureOffset("bipedLeftArm.upper_left_arm", 63, 109);
    setTextureOffset("bipedLeftArm.left_arm_long_sleeve_bottom", 60, 122);
    setTextureOffset("bipedLeftArm.left_arm_long_sleeve_back", 63, 117);
    setTextureOffset("bipedLeftArm.left_arm_long_sleeve_left", 54, 116);
    setTextureOffset("bipedHead.neck", 183, 66);
    setTextureOffset("bipedHead.head", 172, 45);
    setTextureOffset("bipedHead.left_hair", 133, 23);
    setTextureOffset("bipedHead.right_hair", 224, 22);
    setTextureOffset("bipedHead.back_hair5", 195, 5);
    setTextureOffset("bipedHead.back_hair4", 183, 5);
    setTextureOffset("bipedHead.back_hair3", 177, 5);
    setTextureOffset("bipedHead.back_hair2", 171, 5);
    setTextureOffset("bipedHead.back_hair1", 163, 5);
    setTextureOffset("bipedHead.outer_right_hair", 219, 46);
    setTextureOffset("bipedHead.outer_left_hair", 154, 45);
    setTextureOffset("bipedHead.front_hair7", 213, 39);
    setTextureOffset("bipedHead.front_hair6", 207, 37);
    setTextureOffset("bipedHead.front_hair5", 201, 35);
    setTextureOffset("bipedHead.front_hair4", 179, 33);
    setTextureOffset("bipedHead.front_hair3", 168, 36);
    setTextureOffset("bipedHead.front_hair2", 161, 38);
    setTextureOffset("bipedHead.front_hair1", 154, 40);
    setTextureOffset("bipedHead.top_hair", 170, 21);
    setTextureOffset("bipedHead.back_hair", 189, 5);
    setTextureOffset("bipedHead.front_hair_right", 193, 37);
    setTextureOffset("bipedHead.front_hair_medium", 184, 37);
    setTextureOffset("bipedHead.front_hair", 175, 37);
    setTextureOffset("bipedHead.outer_left_hair1", 148, 45);
    setTextureOffset("bipedHead.outer_left_hair2", 142, 45);
    setTextureOffset("bipedHead.outer_left_hair3", 135, 45);
    setTextureOffset("bipedHead.outer_left_hair4", 127, 44);
    setTextureOffset("bipedHead.outer_right_hair1", 224, 46);
    setTextureOffset("bipedHead.outer_right_hair4", 243, 46);
    setTextureOffset("bipedHead.outer_right_hair3", 237, 46);
    setTextureOffset("bipedHead.outer_right_hair2", 230, 46);
    setTextureOffset("bipedRightArm.outtest_right_sleeve", 102, 47);
    setTextureOffset("bipedRightArm.outter_right_sleeve", 102, 35);
    setTextureOffset("bipedRightArm.right_sleeve", 102, 15);
    setTextureOffset("bipedRightArm.right_arm", 102, 0);
    setTextureOffset("bipedRightArm.right_hand_front_lace", 102, 59);
    setTextureOffset("bipedRightArm.right_hand_back_lace", 102, 75);
    setTextureOffset("bipedRightArm.right_hand_right_lace", 110, 63);
    setTextureOffset("bipedRightArm.right_hand_left_lace", 92, 63);
    setTextureOffset("bipedRightArm.right_hand_front_fronter_lace1", 93, 83);
    setTextureOffset("bipedRightArm.right_hand_front_fronter_lace2", 105, 83);
    setTextureOffset("bipedRightArm.right_hand_front_fronter_lace3", 105, 83);
    setTextureOffset("bipedRightArm.right_hand_front_fronter_lace4", 116, 83);
    setTextureOffset("bipedRightArm.right_hand_right_fronter_lace1", 116, 91);
    setTextureOffset("bipedRightArm.right_hand_right_fronter_lace2", 116, 91);
    setTextureOffset("bipedRightArm.right_hand_right_fronter_lace3", 116, 91);
    setTextureOffset("bipedRightArm.right_hand_right_fronter_lace4", 116, 100);
    setTextureOffset("bipedRightArm.right_hand_back_fronter_lace1", 105, 100);
    setTextureOffset("bipedRightArm.right_hand_back_fronter_lace2", 105, 100);
    setTextureOffset("bipedRightArm.right_hand_back_fronter_lace3", 93, 100);
    setTextureOffset("bipedRightArm.right_hand_left_fronter_lace1", 93, 91);
    setTextureOffset("bipedRightArm.right_hand_left_fronter_lace2", 93, 91);
    setTextureOffset("bipedRightArm.right_hand_left_fronter_lace3", 93, 91);
    setTextureOffset("bipedRightArm.upper_right_arm", 63, 109);
    setTextureOffset("bipedRightArm.right_arm_long_sleeve_back", 63, 117);
    setTextureOffset("bipedRightArm.right_arm_long_sleeve_front", 63, 117);
    setTextureOffset("bipedRightArm.right_arm_long_sleeve_bottom", 60, 122);
    setTextureOffset("bipedRightArm.right_arm_long_sleeve_left", 54, 116);
    setTextureOffset("bipedLeftLeg.left_Leg", 0, 22);
    setTextureOffset("bipedLeftLeg.left_Leg_sock_left", 0, 70);
    setTextureOffset("bipedLeftLeg.left_Leg_sock_right", 0, 56);
    setTextureOffset("bipedLeftLeg.left_Leg_sock_Front", 0, 42);
    setTextureOffset("bipedLeftLeg.left_Leg_sock_back", 0, 42);
    setTextureOffset("bipedLeftLeg.left_sock_button", 0, 86);
    setTextureOffset("bipedRightLeg.right_Leg_sock_back", 0, 42);
    setTextureOffset("bipedRightLeg.right_Leg", 0, 2);
    setTextureOffset("bipedRightLeg.right_Leg_sock_left", 0, 56);
    setTextureOffset("bipedRightLeg.right_Leg_sock_right", 0, 70);
    setTextureOffset("bipedRightLeg.right_Leg_sock_front", 0, 42);
    setTextureOffset("bipedRightLeg.right_Leg_sock_back", 0, 42);
    setTextureOffset("bipedRightLeg.right_sock_button", 0, 86);
    setTextureOffset("tie.tie1", 29, 100);
    
    setTextureOffset("tie.tie3", 28, 105);
    setTextureOffset("tie.tie4", 27, 110);
    setTextureOffset("tie.tie5", 29, 115);
    
      bipedBody = new ModelRenderer(this, 16, 75);
      bipedBody.addBox(0F, 0F, 0F, 10, 15, 6);
      bipedBody.setRotationPoint(-5F, -8F, -2F);
      bipedBody.setTextureSize(256, 128);
      bipedBody.mirror = true;
      setRotation(bipedBody, 0F, 0F, 0F);
      collar_left= new ModelRenderer(this, 170, 74);
      collar_left.addBox(0F, 0F, 0F, 3, 1, 5);
      collar_left.setRotationPoint(-4.5F, -9F, -3F);
      collar_left.setTextureSize(256, 128);
      collar_left.mirror = true;
      setRotation(collar_left, 0F, 0F, 0F);
      collar_right= new ModelRenderer(this, 190, 74);
      collar_right.addBox(0F, 0F, 0F, 3, 1, 5);
      collar_right.setRotationPoint(1.5F, -9F, -3F);
      collar_right.setTextureSize(256, 128);
      collar_right.mirror = true;
      setRotation(collar_right, 0F, 0F, 0F);
      collar_back= new ModelRenderer(this, 177, 83);
      collar_back.addBox(0F, 0F, 0F, 9, 1, 2);
      collar_back.setRotationPoint(-4.5F, -9F, 2F);
      collar_back.setTextureSize(256, 128);
      collar_back.mirror = true;
      setRotation(collar_back, 0F, 0F, 0F);

     
      pang_ci1 = new ModelRenderer(this, 22, 41);
      pang_ci1.addBox(0F, 0F, 0F, 8, 1, 2);
      pang_ci1.setRotationPoint(-4F, 7F, 0F);
      pang_ci1.setTextureSize(256, 128);
      pang_ci1.mirror = true;
      setRotation(pang_ci1, 0F, 0F, 0F);
      pang_ci2 = new ModelRenderer(this, 24, 46);
      pang_ci2.addBox(0F, 0F, 0F, 6, 1, 2);
      pang_ci2.setRotationPoint(-3F, 8F, 0F);
      pang_ci2.setTextureSize(256, 128);
      pang_ci2.mirror = true;
      setRotation(pang_ci2, 0F, 0F, 0F);
      pang_ci3 = new ModelRenderer(this, 26, 51);
      pang_ci3.addBox(0F, 0F, 0F, 4, 1, 2);
      pang_ci3.setRotationPoint(-2F, 9F, 0F);
      pang_ci3.setTextureSize(256, 128);
      pang_ci3.mirror = true;
      setRotation(pang_ci3, 0F, 0F, 0F);
      left_skirt = new ModelRenderer(this, 29, 57);
      left_skirt.addBox(-2F, 0F, -1F, 1, 5, 2);
      left_skirt.setRotationPoint(-3F, 7F, 1F);
      left_skirt.setTextureSize(256, 128);
      left_skirt.mirror = true;
      setRotation(left_skirt, 0F, 0F, 0F);
      left_side_skirt_1 = new ModelRenderer(this, 36, 57);
      left_side_skirt_1.addBox(-2F, 0F, -1F, 1, 4, 2);
      left_side_skirt_1.setRotationPoint(-3F, 7F, -1F);
      left_side_skirt_1.setTextureSize(256, 128);
      left_side_skirt_1.mirror = true;
      setRotation(left_side_skirt_1, 0F, 0F, 0F);
      left_side_skirt_2 = new ModelRenderer(this, 21, 57);
      left_side_skirt_2.addBox(-2F, 0F, -1F, 1, 4, 2);
      left_side_skirt_2.setRotationPoint(-3F, 7F, 3F);
      left_side_skirt_2.setTextureSize(256, 128);
      left_side_skirt_2.mirror = true;
      setRotation(left_side_skirt_2, 0F, 0F, 0F);
      right_skirt = new ModelRenderer(this, 29, 66);
      right_skirt.addBox(1F, 0F, -1F, 1, 5, 2);
      right_skirt.setRotationPoint(3F, 7F, 1F);
      right_skirt.setTextureSize(256, 128);
      right_skirt.mirror = true;
      setRotation(right_skirt, 0F, 0F, 0F);
      right_side_skirt_1 = new ModelRenderer(this, 21, 66);
      right_side_skirt_1.addBox(1F, 0F, -1F, 1, 4, 2);
      right_side_skirt_1.setRotationPoint(3F, 7F, -1F);
      right_side_skirt_1.setTextureSize(256, 128);
      right_side_skirt_1.mirror = true;
      setRotation(right_side_skirt_1, 0F, 0F, 0F);
      right_side_skirt_2 = new ModelRenderer(this, 37, 66);
      right_side_skirt_2.addBox(1F, 0F, -1F, 1, 4, 2);
      right_side_skirt_2.setRotationPoint(3F, 7F, 3F);
      right_side_skirt_2.setTextureSize(256, 128);
      right_side_skirt_2.mirror = true;
      setRotation(right_side_skirt_2, 0F, 0F, 0F);
      front_skirt = new ModelRenderer(this, 27, 22);
      front_skirt.addBox(-2F, 0F, -2F, 4, 5, 1);
      front_skirt.setRotationPoint(0F, 7F, 0F);
      front_skirt.setTextureSize(256, 128);
      front_skirt.mirror = true;
      setRotation(front_skirt, 0F, 0F, 0F);
      front_side_skirt1 = new ModelRenderer(this, 18, 22);
      front_side_skirt1.addBox(-2F, 0F, -2F, 2, 4, 1);
      front_side_skirt1.setRotationPoint(-2F, 7F, 0F);
      front_side_skirt1.setTextureSize(256, 128);
      front_side_skirt1.mirror = true;
      setRotation(front_side_skirt1, 0F, 0F, 0F);
      front_side_skirt_2 = new ModelRenderer(this, 39, 22);
      front_side_skirt_2.addBox(0F, -1F, -4F, 2, 4, 1);
      front_side_skirt_2.setRotationPoint(2F, 8F, 2F);
      front_side_skirt_2.setTextureSize(256, 128);
      front_side_skirt_2.mirror = true;
      setRotation(front_side_skirt_2, 0F, 0F, 0F);
      back_skirt = new ModelRenderer(this, 27, 30);
      back_skirt.addBox(-2F, 0F, 1F, 4, 5, 1);
      back_skirt.setRotationPoint(0F, 7F, 2F);
      back_skirt.setTextureSize(256, 128);
      back_skirt.mirror = true;
      setRotation(back_skirt, 0F, 0F, 0F);
      back_side_skirt1 = new ModelRenderer(this, 18, 30);
      back_side_skirt1.addBox(0F, 0F, 1F, 2, 4, 1);
      back_side_skirt1.setRotationPoint(2F, 7F, 2F);
      back_side_skirt1.setTextureSize(256, 128);
      back_side_skirt1.mirror = true;
      setRotation(back_side_skirt1, 0F, 0F, 0F);
      back_side_skirt2 = new ModelRenderer(this, 39, 30);
      back_side_skirt2.addBox(0F, 0F, 0F, 2, 4, 1);
      back_side_skirt2.setRotationPoint(-4F, 7F, 3F);
      back_side_skirt2.setTextureSize(256, 128);
      back_side_skirt2.mirror = true;
      setRotation(back_side_skirt2, 0F, 0F, 0F);
      clothes_right_button1 = new ModelRenderer(this, 0, 94);
      clothes_right_button1.addBox(0F, 0F, 0F, 1, 1, 1);
      clothes_right_button1.setRotationPoint(3.3F, -4.8F, -2.5F);
      clothes_right_button1.setTextureSize(256, 128);
      clothes_right_button1.mirror = true;
      setRotation(clothes_right_button1, 0F, 0F, 0F);
      clothes_right_button2 = new ModelRenderer(this, 0, 94);
      clothes_right_button2.addBox(0F, 0F, 0F, 1, 1, 1);
      clothes_right_button2.setRotationPoint(1.5F, -1F, -2.5F);
      clothes_right_button2.setTextureSize(256, 128);
      clothes_right_button2.mirror = true;
      setRotation(clothes_right_button2, 0F, 0F, 0F);
      clothes_right_button3 = new ModelRenderer(this, 0, 94);
      clothes_right_button3.addBox(0F, 0F, 0F, 1, 1, 1);
      clothes_right_button3.setRotationPoint(1.8F, 4.3F, -2.5F);
      clothes_right_button3.setTextureSize(256, 128);
      clothes_right_button3.mirror = true;
      setRotation(clothes_right_button3, 0F, 0F, 0F);
      clothes_right_button4 = new ModelRenderer(this, 0, 94);
      clothes_right_button4.addBox(0F, 0F, 0F, 1, 1, 1);
      clothes_right_button4.setRotationPoint(3.3F, 8F, -2.5F);
      clothes_right_button4.setTextureSize(256, 128);
      clothes_right_button4.mirror = true;
      setRotation(clothes_right_button4, 0F, 0F, 0F);
      clothes_left_button1 = new ModelRenderer(this, 0, 94);
      clothes_left_button1.addBox(0F, 0F, 0F, 1, 1, 1);
      clothes_left_button1.setRotationPoint(-4.5F, -4.8F, -2.5F);
      clothes_left_button1.setTextureSize(256, 128);
      clothes_left_button1.mirror = true;
      setRotation(clothes_left_button1, 0F, 0F, 0F);
      clothes_left_button2 = new ModelRenderer(this, 0, 94);
      clothes_left_button2.addBox(0F, 0F, 0F, 1, 1, 1);
      clothes_left_button2.setRotationPoint(-2.5F, -1F, -2.5F);
      clothes_left_button2.setTextureSize(256, 128);
      clothes_left_button2.mirror = true;
      setRotation(clothes_left_button2, 0F, 0F, 0F);
      clothes_left_button3 = new ModelRenderer(this, 0, 94);
      clothes_left_button3.addBox(0F, 0F, 0F, 1, 1, 1);
      clothes_left_button3.setRotationPoint(-2.8F, 4.3F, -2.5F);
      clothes_left_button3.setTextureSize(256, 128);
      clothes_left_button3.mirror = true;
      setRotation(clothes_left_button3, 0F, 0F, 0F);
      clothes_left_button4 = new ModelRenderer(this, 0, 94);
      clothes_left_button4.addBox(0F, 0F, 0F, 1, 1, 1);
      clothes_left_button4.setRotationPoint(-4.3F, 8F, -2.5F);
      clothes_left_button4.setTextureSize(256, 128);
      clothes_left_button4.mirror = true;
      setRotation(clothes_left_button4, 0F, 0F, 0F);

      bipedHead = new ModelRenderer(this, "bipedHead");
      bipedHead.setRotationPoint(0F, -9F, 1F);
      setRotation(bipedHead, 0F, 0F, 0F);
      bipedHead.mirror = true;
        bipedHead.addBox("neck", -1.5F, -1F, -1F, 3, 2, 2);
        bipedHead.addBox("head", -4F, -8.5F, -4F, 8, 8, 8);
        bipedHead.addBox("left_hair", -5F, -9F, -4F, 1, 7, 7);
        bipedHead.addBox("right_hair", 4F, -9F, -4F, 1, 7, 7);
        bipedHead.addBox("back_hair5", -4F, -9F, 4F, 2, 7, 1);
        bipedHead.addBox("back_hair4", -1F, -9F, 4F, 1, 9, 1);
        bipedHead.addBox("back_hair3", 0F, -9F, 4F, 1, 9, 1);
        bipedHead.addBox("back_hair2", 1F, -9F, 4F, 1, 8, 1);
        bipedHead.addBox("back_hair1", 2F, -9F, 4F, 2, 7, 1);
        bipedHead.addBox("outer_right_hair", 5F, -8F, -4F, 1, 9, 1);
        bipedHead.addBox("outer_left_hair", -6F, -8F, -4F, 1, 9, 1);
        bipedHead.addBox("front_hair7", 5F, -8F, -5F, 1, 2, 1);
        bipedHead.addBox("front_hair6", 4F, -9F, -5F, 1, 4, 1);
        bipedHead.addBox("front_hair5", 3F, -10F, -5F, 1, 6, 1);
        //bipedHead.addBox("front_hair4", -3F, -10F, -5F, 6, 1, 1);
        bipedHead.addBox("front_hair3", -4F, -10F, -5F, 1, 6, 1);
        bipedHead.addBox("front_hair2", -5F, -9F, -5F, 1, 4, 1);
        bipedHead.addBox("front_hair1", -6F, -8F, -5F, 1, 2, 1);
        bipedHead.addBox("top_hair", -4F, -9.5F, -4F, 8, 1, 8);
        bipedHead.addBox("back_hair", -2F, -9F, 4F, 1, 8, 1);
        bipedHead.addBox("front_hair_right", 1F, -10F, -5.5F, 2, 3, 1);
        bipedHead.addBox("front_hair_medium", -1F, -10F, -6F, 2, 4, 1);
        bipedHead.addBox("front_hair", -3F, -10F, -5.5F, 2, 3, 1);
        bipedHead.addBox("outer_left_hair1", -6F, -8F, -3F, 1, 8, 1);
        bipedHead.addBox("outer_left_hair2", -6F, -8F, -2F, 1, 7, 1);
        bipedHead.addBox("outer_left_hair3", -6F, -8F, -1F, 1, 6, 1);
        bipedHead.addBox("outer_left_hair4", -6F, -8F, 0F, 1, 6, 2);
        bipedHead.addBox("outer_right_hair1", 5F, -8F, -3F, 1, 8, 1);
        bipedHead.addBox("outer_right_hair4", 5F, -8F, 0F, 1, 6, 2);
        bipedHead.addBox("outer_right_hair3", 5F, -8F, -1F, 1, 6, 1);
        bipedHead.addBox("outer_right_hair2", 5F, -8F, -2F, 1, 7, 1);


        bipedLeftArm= new ModelRenderer(this, "bipedLeftArm");
        bipedLeftArm.setRotationPoint(-5F, -6F, 1F);
        setRotation(bipedLeftArm, 0F, 0F, 0F);
        bipedLeftArm.mirror = true;
        bipedLeftArm.addBox("left_arm", -1F, -2F, -2F, 1, 7, 4);
        bipedLeftArm.addBox("outter_left_sleeve", -5F, 8F, 3F, 6, 8, 2);
        bipedLeftArm.addBox("outtest_left_sleeve", -5F, 11F, 5F, 6, 5, 1);
        bipedLeftArm.addBox("left_sleeve", -5F, 5F, -3F, 6, 11, 6);
        bipedLeftArm.addBox("left_hand_front_fronter_lace1", -3.5F, 16.3F, -3.3F, 1, 2, 1);
        bipedLeftArm.addBox("left_hand_front_fronter_lace2", -1.5F, 16.3F, -3.3F, 1, 2, 1);
        bipedLeftArm.addBox("left_hand_front_fronter_lace3", 0.3F, 16.3F, -3.3F, 1, 2, 1);
        bipedLeftArm.addBox("left_hand_right_fronter_lace1", 0.3F, 16.3F, -1F, 1, 2, 1);
        bipedLeftArm.addBox("left_hand_right_fronter_lace2", 0.3F, 16.3F, 1F, 1, 2, 1);
        bipedLeftArm.addBox("left_hand_right_fronter_lace3", 0.3F, 16.3F, 3F, 1, 2, 1);
        bipedLeftArm.addBox("left_hand_right_fronter_lace4", 0.3F, 16.3F, 5.3F, 1, 2, 1);
        bipedLeftArm.addBox("left_hand_back_fronter_lace1", -1.5F, 16.3F, 5.3F, 1, 2, 1);
        bipedLeftArm.addBox("left_hand_back_fronter_lace2", -3.5F, 16.3F, 5.3F, 1, 2, 1);
        bipedLeftArm.addBox("left_hand_back_fronter_lace3", -5.3F, 16.3F, 5.3F, 1, 2, 1);
        bipedLeftArm.addBox("left_hand_back_fronter_lace4", -5.3F, 16.3F, -3.3F, 1, 2, 1);
        bipedLeftArm.addBox("left_hand_left_fronter_lace1", -5.3F, 16.3F, 3F, 1, 2, 1);
        bipedLeftArm.addBox("left_hand_left_fronter_lace2", -5.3F, 16.3F, 1F, 1, 2, 1);
        bipedLeftArm.addBox("left_hand_left_fronter_lace3", -5.3F, 16.3F, -1F, 1, 2, 1);
        bipedLeftArm.addBox("left_hand_front_lace", -5F, 16F, -3F, 6, 2, 1);
        bipedLeftArm.addBox("left_hand_back_lace", -5F, 16F, 5F, 6, 2, 1);
        bipedLeftArm.addBox("left_hand_left_lace", -5F, 16F, -2F, 1, 2, 7);
        bipedLeftArm.addBox("left_hand_right_lace", 0F, 16F, -2F, 1, 2, 7);
        bipedLeftArm.addBox("left_arm_long_sleeve_front", -4F, 2F, -2F, 3, 2, 1);
        bipedLeftArm.addBox("upper_left_arm", -3F, -1F, -1F, 2, 5, 2);
        bipedLeftArm.addBox("left_arm_long_sleeve_bottom", -4F, 4F, -2F, 3, 1, 4);
        bipedLeftArm.addBox("left_arm_long_sleeve_back", -4F, 2F, 1F, 3, 2, 1);
        bipedLeftArm.addBox("left_arm_long_sleeve_left", -4F, 2F, -1F, 1, 2, 2);

        bipedRightArm= new ModelRenderer(this, "bipedRightArm");
        bipedRightArm.setRotationPoint(5F, -6F, 1F);
        setRotation(bipedRightArm, 0F, 0F, 0F);
        bipedRightArm.mirror = true;
        bipedRightArm.addBox("outtest_right_sleeve", -1F, 11F, 5F, 6, 5, 1);
        bipedRightArm.addBox("outter_right_sleeve", -1F, 8F, 3F, 6, 8, 2);
        bipedRightArm.addBox("right_sleeve", -1F, 5F, -3F, 6, 11, 6);
        bipedRightArm.addBox("right_arm", 0F, -2F, -2F, 1, 7, 4);
        bipedRightArm.addBox("right_hand_front_lace", -1F, 16F, -3F, 6, 2, 1);
        bipedRightArm.addBox("right_hand_back_lace", -1F, 16F, 5F, 6, 2, 1);
        bipedRightArm.addBox("right_hand_right_lace", 4F, 16F, -2F, 1, 2, 7);
        bipedRightArm.addBox("right_hand_left_lace", -1F, 16F, -2F, 1, 2, 7);
        bipedRightArm.addBox("right_hand_front_fronter_lace1", -1.3F, 16.3F, -3.3F, 1, 2, 1);
        bipedRightArm.addBox("right_hand_front_fronter_lace2", 0.5F, 16.3F, -3.3F, 1, 2, 1);
        bipedRightArm.addBox("right_hand_front_fronter_lace3", 2.5F, 16.3F, -3.3F, 1, 2, 1);
        bipedRightArm.addBox("right_hand_front_fronter_lace4", 4.3F, 16.3F, -3.3F, 1, 2, 1);
        bipedRightArm.addBox("right_hand_right_fronter_lace1", 4.3F, 16.3F, -1F, 1, 2, 1);
        bipedRightArm.addBox("right_hand_right_fronter_lace2", 4.3F, 16.3F, 1F, 1, 2, 1);
        bipedRightArm.addBox("right_hand_right_fronter_lace3", 4.3F, 16.3F, 3.3F, 1, 2, 1);
        bipedRightArm.addBox("right_hand_right_fronter_lace4", 4.3F, 16.3F, 5.3F, 1, 2, 1);
        bipedRightArm.addBox("right_hand_back_fronter_lace1", 2.3F, 16.3F, 5.3F, 1, 2, 1);
        bipedRightArm.addBox("right_hand_back_fronter_lace2", 0.5F, 16.3F, 5.3F, 1, 2, 1);
        bipedRightArm.addBox("right_hand_back_fronter_lace3", -1.3F, 16.3F, 5.3F, 1, 2, 1);
        bipedRightArm.addBox("right_hand_left_fronter_lace1", -1.3F, 16.3F, 3.3F, 1, 2, 1);
        bipedRightArm.addBox("right_hand_left_fronter_lace2", -1.3F, 16.3F, 1F, 1, 2, 1);
        bipedRightArm.addBox("right_hand_left_fronter_lace3", -1.3F, 16.3F, -1F, 1, 2, 1);
        bipedRightArm.addBox("upper_right_arm", 1F, -1F, -1F, 2, 5, 2);
        bipedRightArm.addBox("right_arm_long_sleeve_back", 1F, 2F, 1F, 3, 2, 1);
        bipedRightArm.addBox("right_arm_long_sleeve_front", 1F, 2F, -2F, 3, 2, 1);
        bipedRightArm.addBox("right_arm_long_sleeve_bottom", 1F, 4F, -2F, 3, 1, 4);
        bipedRightArm.addBox("right_arm_long_sleeve_left", 3F, 2F, -1F, 1, 2, 2);
        bipedLeftLeg = new ModelRenderer(this, "bipedLeftLeg");
        bipedLeftLeg.setRotationPoint(-1F, 9F, 1F);
        setRotation(bipedLeftLeg, 0F, 0F, 0F);
        bipedLeftLeg.mirror = true;
        bipedLeftLeg.addBox("left_Leg", -3F, -1F, -1F, 2, 16, 2);
        bipedLeftLeg.addBox("left_Leg_sock_left", -4F, 4F, -1F, 1, 11, 2);
        bipedLeftLeg.addBox("left_Leg_sock_right", -1F, 4F, -1F, 1, 11, 2);
        bipedLeftLeg.addBox("left_Leg_sock_Front", -4F, 4F, -2F, 4, 11, 1);
        bipedLeftLeg.addBox("left_Leg_sock_back", -4F, 4F, 1F, 4, 11, 1);
        bipedLeftLeg.addBox("left_sock_button", -4.5F, 5F, -1F, 1, 1, 1);
        bipedRightLeg = new ModelRenderer(this, "bipedRightLeg");
        bipedRightLeg.setRotationPoint(1F, 9F, 1F);
        setRotation(bipedRightLeg, 0F, 0F, 0F);
        bipedRightLeg.mirror = true;
        bipedRightLeg.addBox("right_Leg_sock_back", 0F, 4F, 1F, 4, 11, 1);
        bipedRightLeg.addBox("right_Leg", 1F, -1F, -1F, 2, 16, 2);
        bipedRightLeg.addBox("right_Leg_sock_left", 0F, 4F, -1F, 1, 11, 2);
        bipedRightLeg.addBox("right_Leg_sock_right", 3F, 4F, -1F, 1, 11, 2);
        bipedRightLeg.addBox("right_Leg_sock_front", 0F, 4F, -2F, 4, 11, 1);
        bipedRightLeg.addBox("right_sock_button", 3.5F, 5F, -1F, 1, 1, 1);
     
      
        tie = new ModelRenderer(this, "tie");
        tie.setRotationPoint(0F, -9F, -1F);
        setRotation(tie, 0F, 0F, 0F);
        tie.mirror = true;
        tie.addBox("tie1", -1F, 0F, -2F, 2, 3, 1);
        tie.addBox("tie3", -1.5F, 3F, -2.5F, 3, 3, 1);
        tie.addBox("tie4", -2F, 6F, -3F, 4, 2, 1);
        tie.addBox("tie5", -1F, 8F, -2.5F, 2, 2, 1);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
	setRotationAngles(f, f1, f2, f3, f4, f5,entity);
    bipedBody.render(f5);
    collar_left.render(f5);
    collar_right.render(f5);
    collar_back.render(f5);
    bipedLeftArm.render(f5);
    pang_ci1.render(f5);
    pang_ci2.render(f5);
    pang_ci3.render(f5);
    left_skirt.render(f5);
    left_side_skirt_1.render(f5);
    left_side_skirt_2.render(f5);
    right_skirt.render(f5);
    right_side_skirt_1.render(f5);
    right_side_skirt_2.render(f5);
    front_skirt.render(f5);
    front_side_skirt1.render(f5);
    front_side_skirt_2.render(f5);
    back_skirt.render(f5);
    back_side_skirt1.render(f5);
    back_side_skirt2.render(f5);
    clothes_right_button1.render(f5);
    clothes_right_button2.render(f5);
    clothes_right_button3.render(f5);
    clothes_right_button4.render(f5);
    clothes_left_button1.render(f5);
    clothes_left_button2.render(f5);
    clothes_left_button3.render(f5);
    clothes_left_button4.render(f5);
    bipedHead.render(f5);
    bipedRightArm.render(f5);
    bipedLeftLeg.render(f5);
    bipedRightLeg.render(f5);
    tie.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
	  super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
      this.bipedHead.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.bipedHead.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.bipedRightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
      this.bipedLeftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
      this.bipedRightArm.rotateAngleZ = 0.0F;
      this.bipedLeftArm.rotateAngleZ = 0.0F;
      this.bipedRightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.bipedLeftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.bipedRightLeg.rotateAngleY = 0.0F;
      this.bipedLeftLeg.rotateAngleY = 0.0F;



      if (this.isRiding)
      {
          this.bipedRightArm.rotateAngleX += -((float)Math.PI / 5F);
          this.bipedLeftArm.rotateAngleX += -((float)Math.PI / 5F);
          this.bipedRightLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
          this.bipedLeftLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
          this.bipedRightLeg.rotateAngleY = ((float)Math.PI / 10F);
          this.bipedLeftLeg.rotateAngleY = -((float)Math.PI / 10F);
      }
      
      if (this.heldItemLeft != 0)
      {
          this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemLeft;
      }

      if (this.heldItemRight != 0)
      {
          this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemRight;
      }

      this.bipedRightArm.rotateAngleY = 0.0F;
      this.bipedLeftArm.rotateAngleY = 0.0F;
      float f6;
      float f7;

      if (this.aimedBow)
      {
          f6 = 0.0F;
          f7 = 0.0F;
          this.bipedRightArm.rotateAngleZ = 0.0F;
          this.bipedLeftArm.rotateAngleZ = 0.0F;
          this.bipedRightArm.rotateAngleY = -(0.1F - f6 * 0.6F) + this.bipedHead.rotateAngleY;
          this.bipedLeftArm.rotateAngleY = 0.1F - f6 * 0.6F + this.bipedHead.rotateAngleY + 0.4F;
          this.bipedRightArm.rotateAngleX = -((float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
          this.bipedLeftArm.rotateAngleX = -((float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
          this.bipedRightArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
          this.bipedLeftArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
          this.bipedRightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
          this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
          this.bipedRightArm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
          this.bipedLeftArm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
      }


  }

}
