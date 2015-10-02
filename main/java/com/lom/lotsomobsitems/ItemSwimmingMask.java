package com.lom.lotsomobsitems;

import java.util.Random;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsinit.LotsOMobsItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSwimmingMask extends ItemArmor
{
	int color = 0;
	public ItemSwimmingMask(ArmorMaterial armor, int par2, int par3, int colorid) 
	{
		super(armor, par2, par3);
		color = colorid;
	}
	
    public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5)
    {
    	if(itemstack.isItemEnchanted() == false)
    	{
    		itemstack.addEnchantment(Enchantment.respiration, 2);
    		itemstack.addEnchantment(Enchantment.aquaAffinity, 2);
    	}
    }
    public boolean hasEffect(ItemStack par1ItemStack)
    {
    		return false;
    }
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
	String type) 
	{
		switch(color)
		{
		default:
		case 1:
			return "lom:textures/swimmingmasks/Orange.png";
		case 2:
			return "lom:textures/swimmingmasks/Red.png";
		case 3:
			return "lom:textures/swimmingmasks/Blue.png";
		case 4:
			return "lom:textures/swimmingmasks/Green.png";
		case 5:
			return "lom:textures/swimmingmasks/Yellow.png";
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) 
	{
		ModelBiped armorModel = null;
		if(itemStack != null)
		{
			armorModel = LotsOMobs.proxy.getArmorModel(3);
		}
		if(armorModel != null)
		{	
			armorModel.bipedHead.showModel = true;
			armorModel.bipedHeadwear.showModel = false;
			armorModel.bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
			armorModel.bipedRightArm.showModel = armorSlot == 1;
			armorModel.bipedLeftArm.showModel = armorSlot == 1;
			armorModel.bipedRightLeg.showModel = armorSlot == 2 || armorSlot == 3;
			armorModel.bipedLeftLeg.showModel = armorSlot == 2 || armorSlot == 3;

			armorModel.isSneak = entityLiving.isSneaking();
			armorModel.isRiding = entityLiving.isRiding();
			armorModel.isChild = entityLiving.isChild();
			armorModel.heldItemRight = entityLiving.getEquipmentInSlot(0) != null ? 1 :0;
			if(entityLiving instanceof EntityPlayer){
			armorModel.aimedBow =((EntityPlayer)entityLiving).getItemInUseDuration() > 2;
			}
			return armorModel;
			}
		return null;
	}
}
