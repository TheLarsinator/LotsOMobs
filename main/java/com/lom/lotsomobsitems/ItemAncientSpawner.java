package com.lom.lotsomobsitems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntityAmmonite;
import com.lom.lotsomobsentity.EntityBrontosaurus;
import com.lom.lotsomobsentity.EntityIchtyosaurus;
import com.lom.lotsomobsentity.EntityMammoth;
import com.lom.lotsomobsentity.EntityMuskOx;
import com.lom.lotsomobsentity.EntityPterosaurus;
import com.lom.lotsomobsentity.EntityRaptor;
import com.lom.lotsomobsentity.EntitySaberTooth;
import com.lom.lotsomobsentity.EntityTRex;
import com.lom.lotsomobsentity.EntityTriceratops;

public class ItemAncientSpawner extends Item
{
	int Dinosaur;
    public ItemAncientSpawner(int ID)
    {
        super();
        this.maxStackSize = 1;
        this.setCreativeTab(LotsOMobs.LotsOMobsItemsTab);
        this.setMaxDamage(20);  
        this.Dinosaur = ID;
    }
	

public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par5Entity)
{
	if(!par2World.isRemote)
	{
	switch(Dinosaur)
	{
	default:
		return par1ItemStack;
	case 1:
	{
		EntityTRex trex = new EntityTRex(par2World);
		trex.setLocationAndAngles(par5Entity.posX, par5Entity.posY, par5Entity.posZ, par5Entity.rotationYaw, par5Entity.rotationPitch);
		par2World.spawnEntityInWorld(trex);
		par5Entity.inventory.consumeInventoryItem(this);
	    return par1ItemStack;
	}
	case 2:
	{
		EntityTriceratops Triceratops = new EntityTriceratops(par2World);
		Triceratops.setLocationAndAngles(par5Entity.posX, par5Entity.posY, par5Entity.posZ, par5Entity.rotationYaw, par5Entity.rotationPitch);
		par2World.spawnEntityInWorld(Triceratops);
		par5Entity.inventory.consumeInventoryItem(this);
	    return par1ItemStack;
	}
	case 3:
	{
		EntityBrontosaurus Brontosaurus = new EntityBrontosaurus(par2World);
		Brontosaurus.setLocationAndAngles(par5Entity.posX, par5Entity.posY, par5Entity.posZ, par5Entity.rotationYaw, par5Entity.rotationPitch);
		par2World.spawnEntityInWorld(Brontosaurus);
		par5Entity.inventory.consumeInventoryItem(this);
	    return par1ItemStack;
	}
	case 4:
	{
		EntityPterosaurus Pterosaur = new EntityPterosaurus(par2World);
		Pterosaur.setLocationAndAngles(par5Entity.posX, par5Entity.posY, par5Entity.posZ, par5Entity.rotationYaw, par5Entity.rotationPitch);
		par2World.spawnEntityInWorld(Pterosaur);
		par5Entity.inventory.consumeInventoryItem(this);
	    return par1ItemStack;
	}
	case 5:
	{
		EntityRaptor Raptor = new EntityRaptor(par2World);
		Raptor.setLocationAndAngles(par5Entity.posX, par5Entity.posY, par5Entity.posZ, par5Entity.rotationYaw, par5Entity.rotationPitch);
		par2World.spawnEntityInWorld(Raptor);
		par5Entity.inventory.consumeInventoryItem(this);
	    return par1ItemStack;
	}
	case 6:
	{
		EntityIchtyosaurus Ichtyosaurus = new EntityIchtyosaurus(par2World);
		Ichtyosaurus.setLocationAndAngles(par5Entity.posX, par5Entity.posY, par5Entity.posZ, par5Entity.rotationYaw, par5Entity.rotationPitch);
		par2World.spawnEntityInWorld(Ichtyosaurus);
		par5Entity.inventory.consumeInventoryItem(this);
	    return par1ItemStack;
	}
	case 7:
	{
		EntityMammoth Mammoth = new EntityMammoth(par2World);
		Mammoth.setLocationAndAngles(par5Entity.posX, par5Entity.posY, par5Entity.posZ, par5Entity.rotationYaw, par5Entity.rotationPitch);
		par2World.spawnEntityInWorld(Mammoth);
		par5Entity.inventory.consumeInventoryItem(this);
	    return par1ItemStack;
	}
	case 8:
	{
		EntitySaberTooth SaberTooth = new EntitySaberTooth(par2World);
		SaberTooth.setLocationAndAngles(par5Entity.posX, par5Entity.posY, par5Entity.posZ, par5Entity.rotationYaw, par5Entity.rotationPitch);
		par2World.spawnEntityInWorld(SaberTooth);
		par5Entity.inventory.consumeInventoryItem(this);
	    return par1ItemStack;
	}
	case 9:
	{
		EntityMuskOx MuskOx = new EntityMuskOx(par2World);
		MuskOx.setLocationAndAngles(par5Entity.posX, par5Entity.posY, par5Entity.posZ, par5Entity.rotationYaw, par5Entity.rotationPitch);
		par2World.spawnEntityInWorld(MuskOx);
		par5Entity.inventory.consumeInventoryItem(this);
	    return par1ItemStack;
	}
	case 10:
	{
		EntityAmmonite Ammonite = new EntityAmmonite(par2World);
		Ammonite.setLocationAndAngles(par5Entity.posX, par5Entity.posY, par5Entity.posZ, par5Entity.rotationYaw, par5Entity.rotationPitch);
		par2World.spawnEntityInWorld(Ammonite);
		par5Entity.inventory.consumeInventoryItem(this);
	    return par1ItemStack;
	}
	}
	}
	else
	{
	    return par1ItemStack;
	}

}
}