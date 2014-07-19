package com.lom.lotsomobsblocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsinit.LotsOMobsItems;
import com.lom.lotsomobstileentity.saltbath.TileEntitySaltBath;
import com.lom.lotsomobstileentity.tanningrack.TileEntityTanningRack;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSaltBath extends Block implements ITileEntityProvider
{

	public BlockSaltBath(Material material) 
	{
	     super(Material.wood);
	     this.setBlockBounds(0F, 0.0F, 0.0F, 1F, 0.5F, 1F);
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

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random par1Random)
	{
	    return 1;
	}

	@Override
	public boolean renderAsNormalBlock(){
	return false;
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) 
	{
	 return new TileEntitySaltBath();
	}

	/**
	* called everytime the player right clicks this block
	*/
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
	{	   
	      ItemStack heldItem = player.getHeldItem();
	      if(heldItem != null && heldItem.getItem() == LotsOMobsItems.Salt && heldItem.stackSize >= 2 && ((TileEntitySaltBath)world.getTileEntity(x, y, z)).SaltContent == false)
	      {
	          ((TileEntitySaltBath)world.getTileEntity(x, y, z)).setHasSalt(true);
	          player.inventory.consumeInventoryItem(LotsOMobsItems.Salt);
	          player.inventory.consumeInventoryItem(LotsOMobsItems.Salt);
	      }
	      if(heldItem != null && heldItem.getItem() == LotsOMobsItems.ElephantHideDirty && ((TileEntitySaltBath)world.getTileEntity(x, y, z)).SaltContent == true)
	      {
	    	 int I = world.rand.nextInt(10);
	    	       if(I == 4)
	    	       {
	    	    	   if(world.isRemote == false)
	    	    	   {
	    	    		EntityItem item = new EntityItem(world, x, y, z, new ItemStack(LotsOMobsItems.ElephantHideSalted));
	    	    		world.spawnEntityInWorld(item);
	    	    		player.inventory.consumeInventoryItem(LotsOMobsItems.ElephantHideDirty);
	    	    	   }
	        	   }
	    	       else
	    	       {
	    	    	double d0 = (double)((float)x + world.rand.nextFloat());
	              	double d1 = (double)((float)y + world.rand.nextFloat());
	              	double d2 = (double)((float)z + world.rand.nextFloat());
	              	double d3 = 0.0D;
	              	double d4 = 0.0D;
	              	double d5 = 0.0D;
	              	int i1 = world.rand.nextInt(2) * 2 - 1;
	              	d3 = ((double)world.rand.nextFloat() - 0.5D) * 0.5D;
	              	d4 = ((double)world.rand.nextFloat() - 0.5D) * 0.5D;
	              	d5 = ((double)world.rand.nextFloat() - 0.5D) * 0.5D;
	      			world.spawnParticle("snowballpoof", d0, d1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1+1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1+1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1+1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1+1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1+1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1+1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1, d2, d3, d4, d5);
	    	       }
	    	       return false;
	      }
	      if(heldItem != null && heldItem.getItem() == LotsOMobsItems.DeerHideDirty && ((TileEntitySaltBath)world.getTileEntity(x, y, z)).SaltContent == true)
	      {
	    	 int I = world.rand.nextInt(10);
	    	       if(I == 4)
	    	       {
	    	    	   if(world.isRemote == false)
	    	    	   {
	    	    		EntityItem item = new EntityItem(world, x, y, z, new ItemStack(LotsOMobsItems.DeerHideSalted));
	    	    		world.spawnEntityInWorld(item);
	    	    		player.inventory.consumeInventoryItem(LotsOMobsItems.DeerHideDirty);
	    	    	   }
	        	   }
	    	       else
	    	       {
	    	    	double d0 = (double)((float)x + world.rand.nextFloat());
	              	double d1 = (double)((float)y + world.rand.nextFloat());
	              	double d2 = (double)((float)z + world.rand.nextFloat());
	              	double d3 = 0.0D;
	              	double d4 = 0.0D;
	              	double d5 = 0.0D;
	              	int i1 = world.rand.nextInt(2) * 2 - 1;
	              	d3 = ((double)world.rand.nextFloat() - 0.5D) * 0.5D;
	              	d4 = ((double)world.rand.nextFloat() - 0.5D) * 0.5D;
	              	d5 = ((double)world.rand.nextFloat() - 0.5D) * 0.5D;
	      			world.spawnParticle("snowballpoof", d0, d1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1+1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1+1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1+1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1+1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1+1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1+1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1, d2, d3, d4, d5);
	      			world.spawnParticle("snowballpoof", d0, d1, d2, d3, d4, d5);
	    	       }
	    	       return false;
	      }
	      return false;
	}

	/**
	 * Called when the block is placed in the world.
	 */
	public void onBlockPlacedBy(World par1World, int i, int j, int k, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
	{
	    int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
	    par1World.setBlockMetadataWithNotify(i, j, k, l, 2);
	}
}
