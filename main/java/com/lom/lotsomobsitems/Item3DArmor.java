package com.lom.lotsomobsitems;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsinit.LotsOMobsItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Item3DArmor extends ItemArmor
{

	public Item3DArmor(ArmorMaterial armor, int par2, int par3) 
	{
		super(armor, par2, par3);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
	String type) {
	if (stack.getItem() == LotsOMobsItems.FurChestplate|| stack.getItem() == LotsOMobsItems.FurBoots || stack.getItem() == LotsOMobsItems.FurHelmet) 
	{
	         return "lom:DeerArmor_1.png";
	}
	if (stack.getItem() == LotsOMobsItems.FurLeggings) 
	{
	         return "lom:DeerArmor_2.png";
	}
	if(stack.getItem() == LotsOMobsItems.ElephantHelmet)
	{
		return "lom:ElephantArmor.png";
	}
	return null;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) 
	{
		ModelBiped armorModel = null;
		if(itemStack != null)
		{
		if(itemStack.getItem() instanceof Item3DArmor)
		{
			if(itemStack.getItem() == LotsOMobsItems.FurBoots || itemStack.getItem() == LotsOMobsItems.FurChestplate || itemStack.getItem() == LotsOMobsItems.FurHelmet || itemStack.getItem() == LotsOMobsItems.FurLeggings)
			{
			int type = ((ItemArmor)itemStack.getItem()).armorType;

			if(type == 1 || type == 3)
			{
			armorModel = LotsOMobs.proxy.getArmorModel(0);
			}
			else
			{
			armorModel = LotsOMobs.proxy.getArmorModel(1);
			}
			}
			if(itemStack.getItem() == LotsOMobsItems.ElephantHelmet)
			{
			armorModel = LotsOMobs.proxy.getArmorModel(2);
			}
		}
		if(armorModel != null){
			armorModel.bipedHead.showModel = armorSlot == 0;
			armorModel.bipedHeadwear.showModel = armorSlot == 0;
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
		}
		return null;
	}
}
