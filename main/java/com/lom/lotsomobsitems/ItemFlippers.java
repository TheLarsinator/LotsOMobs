package com.lom.lotsomobsitems;

import com.lom.lotsomobscore.LotsOMobs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.World;

public class ItemFlippers extends ItemArmor
{
	int colorid = 0;
	public ItemFlippers(ArmorMaterial armor, int par2, int par3, int colorid) 
	{
		super(armor, par2, par3);
		this.colorid = colorid;
	}
	
    public boolean hasEffect(ItemStack par1ItemStack)
    {
    		return false;
    }
    
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) 
    {
    	if(player.isInWater())
    	{
    		player.motionX *= 1.2D;
    		player.motionY *= 1.2D;
    		player.motionZ *= 1.2D;
    	}
    }
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
	String type) 
	{
		switch(colorid)
		{
		default:
		case 1:
			return "lom:textures/swimmingmasks/FOrange.png";
		case 2:
			return "lom:textures/swimmingmasks/FRed.png";
		case 3:
			return "lom:textures/swimmingmasks/FGreen.png";
		case 4:
			return "lom:textures/swimmingmasks/FBlue.png";
		case 5:
			return "lom:textures/swimmingmasks/FYellow.png";
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) 
	{
		ModelBiped armorModel = null;
		if(itemStack != null)
		{
			armorModel = LotsOMobs.proxy.getArmorModel(6);
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
