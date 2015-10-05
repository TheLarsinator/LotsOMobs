package com.lom.lotsomobsblocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsinit.LotsOMobsBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSeaWeed extends BlockBush {
	
   public BlockSeaWeed(Material material) {
      super(material);
      this.setCreativeTab(LotsOMobs.LotsOMobsBlockTab);
      this.setBlockBounds(0F, 0F, 0F, 1F, 1F, 1F);
      this.setTickRandomly(true);
   }
   /**
    * is the block grass, dirt or farmland
    */
   protected boolean canPlaceBlockOn(Block block)
   {
       return block == Blocks.sand || block == Blocks.gravel || block == Blocks.water || block == Blocks.dirt || block instanceof BlockSeaWeed;
   }
   
   public AxisAlignedBB func_149668_a(World par1World, int par2, int par3, int par4) {
      return null;
   }

   public boolean isOpaqueCube() {
      return false;
   }

   public boolean isBlockNormalCube() {
      return false;
   }

   /**
    * Called when the block is placed in the world.
    */
   public void onBlockAdded(World world, int i, int j, int k) 
   {       
	 /*  if(this == LotsOMobsBlocks.Seaweed)
	   {
	   	 /* Random rand = new Random();
	   	  int cap = world.getHeightValue(i, k);
	      int z = rand.nextInt(5)+1;
	      
	      if(world.getBlock(i, j+z, k) == Blocks.water)
	      {
	    	  world.setBlock(i, j + 1, k, LotsOMobsBlocks.Seaweed);
	      }
	      else
	      {
	    	  world.setBlock(i, j + 1, k, LotsOMobsBlocks.SeaweedTop);
	      }
	      //System.out.println("Top added");*/
	   //}*/
   }
   
   @Override
   public int getRenderType() 
   {
    	   return 6;
   }
   
   @Override
   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister iconRegister)
   {	   
	  blockIcon = iconRegister.registerIcon(LotsOMobs.modid + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	   
   }
}
