package com.lom.lotsomobsblocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsinit.LotsOMobsItems;
import com.lom.lotsomobstileentity.spinningwheel.TileEntitySpinningWheel;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSpinningWheel extends Block implements ITileEntityProvider
{
	public static int rotangle = new Random().nextInt(3);

public BlockSpinningWheel(Material rock)
{
         super(Material.rock);
         this.setCreativeTab(LotsOMobs.LotsOMobsBlockTab);
         

}
@Override
public int getRenderType() {
    return -1;
}

@Override
public boolean isOpaqueCube(){
return false;
}

@Override
public boolean renderAsNormalBlock(){
return false;
}


@Override
public TileEntity createNewTileEntity(World var1, int var2)
{
 return new TileEntitySpinningWheel();
}


public int quantityDropped(int par1)
{
         return (1);
}

@Override
public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c)
{
    ItemStack var2 = player.inventory.getCurrentItem();
    if(var2 != null && var2.getItem() == LotsOMobsItems.AngoraWool)
    {
    	if(--var2.stackSize == 1)
    	{
    		player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(LotsOMobsItems.Rope));
    	}
    	else if (--var2.stackSize <= 0)
        {
            player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(LotsOMobsItems.Rope));
        }
        else if (!player.inventory.addItemStackToInventory(new ItemStack(LotsOMobsItems.Rope)))
        {
           player.dropItem(LotsOMobsItems.Rope, 1);
        }
        return true;
    }

    else
    {
        return false;
    }
	
}
/**
 * Called when the block is placed in the world.
 */
public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
{
    int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
    par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
}

public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
{
	if(par1World.getBlockMetadata(par2, par3, par4) == 1)
	{
    this.setBlockBounds(0F, 0.0F, 0.3F, 1F, 1F, 0.6F);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	}
	if(par1World.getBlockMetadata(par2, par3, par4) == 2)
	{
    this.setBlockBounds(0.4F, 0.0F, 0.0F, .7F, 1F, 1F);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	}
	if(par1World.getBlockMetadata(par2, par3, par4) == 3)
	{
    this.setBlockBounds(0F, 0.0F, 0.4F, 1F, 1F, .7F);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	}
	if(par1World.getBlockMetadata(par2, par3, par4) == 0)
	{
    this.setBlockBounds(0.3F, 0.0F, 0.0F, .6F, 1F, 1F);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	}
	
    this.setBlockBoundsForItemRender();
}
}