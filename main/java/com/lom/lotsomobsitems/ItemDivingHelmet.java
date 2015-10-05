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
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemDivingHelmet extends ItemArmor
{
	public ItemDivingHelmet(ArmorMaterial armor, int par2, int par3) 
	{
		super(armor, par2, par3);
	}
	
    public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5)
    {
    	if(itemstack.isItemEnchanted() == false)
    	{
    		itemstack.addEnchantment(Enchantment.respiration, 2);
    	}
    }
    public boolean hasEffect(ItemStack par1ItemStack)
    {
    		return false;
    }
    
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) 
    {
    	/*if(player.isInWater() && player.getEquipmentInSlot(3) == new ItemStack(LotsOMobsItems.OTank, 1))
    	{
    		System.out.println("Yes");
    	player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 4));
    	}
    	//System.out.println(new ItemStack(LotsOMobsItems.OTank, 1));
    	//System.out.println(player.getEquipmentInSlot(3));*/
    	if(player.isInWater() && world.getBlock((int)player.posX, (int)player.posY + 1, (int)player.posZ) == Blocks.water)
    	{
    		player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 4));
    	}
    }
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
	String type) 
	{
			return "lom:textures/swimmingmasks/DivingHelmet.png";
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) 
	{
		ModelBiped armorModel = null;
		if(itemStack != null)
		{
			armorModel = LotsOMobs.proxy.getArmorModel(5);
		}
		if(armorModel != null)
		{	
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
		return null;
	}
}
