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

public class BlockCoral extends BlockBush {
	public int texture;
	
   public BlockCoral(Material material, int i) {
      super(material);
      this.setCreativeTab(LotsOMobs.LotsOMobsBlockTab);
      this.setBlockBounds(0F, 0F, 0F, 1F, 1F, 1F);
      this.setTickRandomly(true);
      texture = i;
   }
   /**
    * is the block grass, dirt or farmland
    */
   protected boolean canPlaceBlockOn(Block block)
   {
       return block == Blocks.sand || block == Blocks.gravel || block == Blocks.water || block == Blocks.dirt || block == LotsOMobsBlocks.Coral2;
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
   public void onBlockAdded(World par1World, int i, int j, int k) 
   {       
       if(texture == 2)
       {
    	   int u = new Random().nextInt(7);
    	   if(u==1)
    	   {
    	   if(par1World.getBlock(i, j+1, k) == Blocks.water && par1World.getBlock(i, j+2, k) == Blocks.water)
    		   par1World.setBlock(i, j+1, k, LotsOMobsBlocks.Coral2);
    	   }
       }
       
       int o = par1World.rand.nextInt(3);
       int p = par1World.rand.nextInt(3);
       
       if(par1World.getBlock(i, j+1, k) == Blocks.water && par1World.getBlock(i, j+1, k) == Blocks.water && par1World.getBlock(i, j-1, k) == Blocks.sand)
       {
    	   int R = par1World.rand.nextInt(99)+1;
    	   if(R >= 90)
    	   par1World.setBlock(i+o, j, k+p, LotsOMobsBlocks.Coral1, 2, 2);
    	   else if(R >=80 && R < 90)
           par1World.setBlock(i+o, j, k+p, LotsOMobsBlocks.Coral2, 2, 2);
    	   else if(R >= 70 && R < 60)
    	   par1World.setBlock(i+o, j, k+p, LotsOMobsBlocks.Coral3, 2, 2);
    	   else if(R >=50 && R < 60)
           par1World.setBlock(i+o, j, k+p, LotsOMobsBlocks.Coral4, 2, 2);
       }
   }
   
   @Override
   public int getRenderType() {
       switch(texture)
       {    
       case 1:
    	   default:
    	   return 1;
       case 2:
    	   return 6;
       case 3:
    	   return 1;
       case 4:
    	   return 6;
       }
   }
   
   @Override
   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister iconRegister)
   {	   
	   switch(texture)
	   {
	   case 1:
	       blockIcon = iconRegister.registerIcon(LotsOMobs.modid + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	       break;
	   case 2:
	       blockIcon = iconRegister.registerIcon(LotsOMobs.modid + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	       break;
	   case 3:
	       blockIcon = iconRegister.registerIcon(LotsOMobs.modid + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	       break;
	   case 4:
	       blockIcon = iconRegister.registerIcon(LotsOMobs.modid + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	       break;
	   }
	   
   }
}
