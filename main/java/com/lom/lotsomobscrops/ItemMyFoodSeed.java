package com.lom.lotsomobscrops;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

import com.lom.lotsomobscore.LotsOMobs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMyFoodSeed extends ItemFood implements IPlantable
{
	 private Block cropID;
	    /**
	     * Block ID of the soil this seed food should be planted on.
	     */
	    private Block soilId;
	    private static final String __OBFID = "CL_00000060";

	    public ItemMyFoodSeed(int p_i45351_1_, float p_i45351_2_, Block p_i45351_3_, Block p_i45351_4_)
	    {
	        super(p_i45351_1_, p_i45351_2_, false);
	        this.cropID = p_i45351_3_;
	        this.soilId = p_i45351_4_;
	        this.setCreativeTab(LotsOMobs.LotsOMobsItemsTab);
	    }

	    /**
	     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
	     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
	     */
	    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	    {
	        if (par7 != 1)
	        {
	            return false;
	        }
	        else if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack) && par2EntityPlayer.canPlayerEdit(par4, par5 + 1, par6, par7, par1ItemStack))
	        {
	            if (par3World.getBlock(par4, par5, par6).canSustainPlant(par3World, par4, par5, par6, ForgeDirection.UP, this) && par3World.isAirBlock(par4, par5 + 1, par6))
	            {
	                par3World.setBlock(par4, par5 + 1, par6, this.cropID);
	                --par1ItemStack.stackSize;
	                return true;
	            }
	            else
	            {
	                return false;
	            }
	        }
	        else
	        {
	            return false;
	        }
	    }

	    @Override
	    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z)
	    {
	        return EnumPlantType.Crop;
	    }

	    @Override
	    public Block getPlant(IBlockAccess world, int x, int y, int z)
	    {
	        return cropID;
	    }

	    @Override
	    public int getPlantMetadata(IBlockAccess world, int x, int y, int z)
	    {
	        return 0;
	    }
}
