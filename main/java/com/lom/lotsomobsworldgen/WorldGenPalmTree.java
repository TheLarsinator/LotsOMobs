package com.lom.lotsomobsworldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.lom.lotsomobsinit.LotsOMobsBlocks;

public class WorldGenPalmTree extends WorldGenerator
{

	public WorldGenPalmTree()
	{
		
	}
	   public boolean generate(World world, Random rand, int i, int j, int k)
	   {
	      if(world.getBlock(i, j-1, k)!= Blocks.sand)
	      {
	         return false;
	      }
	      int d = rand.nextInt(3) + 1;
	      
	      Block wood = LotsOMobsBlocks.PalmLog;
	      Block leaves = LotsOMobsBlocks.PalmLeaves;
	      
	      if(d==1)
	      {
	      world.setBlock(i, j, k, wood);
	      world.setBlock(i, j+1, k+1, wood);
	      world.setBlock(i, j+1, k+2, wood);
	      world.setBlock(i, j+2, k+3, wood);
	      world.setBlock(i, j+3, k+4, wood);
	      world.setBlock(i, j+4, k+4, wood);
	      world.setBlock(i, j+5, k+4, wood);
	      world.setBlock(i, j+6, k+4, wood);
	      
	      world.setBlock(i, j+7, k+4, leaves);
	      world.setBlock(i+1, j+7, k+3, leaves);
	      world.setBlock(i+1, j+7, k+4, leaves);
	      world.setBlock(i+1, j+7, k+5, leaves);
	      world.setBlock(i, j+7, k+5, leaves);
	      world.setBlock(i, j+7, k+3, leaves);
	      world.setBlock(i-1, j+7, k+5, leaves);
	      world.setBlock(i-1, j+7, k+4, leaves);
	      world.setBlock(i-1, j+7, k+3, leaves);
	      world.setBlock(i, j+7, k+2, leaves);
	      world.setBlock(i, j+7, k+6, leaves);
	      world.setBlock(i+2, j+7, k+4, leaves);
	      world.setBlock(i-2, j+7, k+4, leaves);
	      
	      world.setBlock(i-3, j+6, k+4, leaves);
	      world.setBlock(i+3, j+6, k+4, leaves);
	      world.setBlock(i, j+6, k+1, leaves);
	      world.setBlock(i, j+6, k+7, leaves);
	      
	      world.setBlock(i-2, j+6, k+6, leaves);
	      world.setBlock(i-2, j+6, k+2, leaves);
	      world.setBlock(i+2, j+6, k+2, leaves);
	      world.setBlock(i+2, j+6, k+6, leaves);
	      }
	      else if(d==2)
	      {
		      world.setBlock(i, j, k, wood);
		      world.setBlock(i, j+1, k-1, wood);
		      world.setBlock(i, j+1, k-2, wood);
		      world.setBlock(i, j+2, k-3, wood);
		      world.setBlock(i, j+3, k-4, wood);
		      world.setBlock(i, j+4, k-4, wood);
		      world.setBlock(i, j+5, k-4, wood);
		      world.setBlock(i, j+6, k-4, wood);
		      
		      world.setBlock(i, j+7, k-4, leaves);
		      world.setBlock(i+1, j+7, k-3, leaves);
		      world.setBlock(i+1, j+7, k-4, leaves);
		      world.setBlock(i+1, j+7, k-5, leaves);
		      world.setBlock(i, j+7, k-5, leaves);
		      world.setBlock(i, j+7, k-3, leaves);
		      world.setBlock(i-1, j+7, k-5, leaves);
		      world.setBlock(i-1, j+7, k-4, leaves);
		      world.setBlock(i-1, j+7, k-3, leaves);
		      world.setBlock(i, j+7, k-2, leaves);
		      world.setBlock(i, j+7, k-6, leaves);
		      world.setBlock(i+2, j+7, k-4, leaves);
		      world.setBlock(i-2, j+7, k-4, leaves);
		      
		      world.setBlock(i-3, j+6, k-4, leaves);
		      world.setBlock(i+3, j+6, k-4, leaves);
		      world.setBlock(i, j+6, k-1, leaves);
		      world.setBlock(i, j+6, k-7, leaves);
		      
		      world.setBlock(i-2, j+6, k-6, leaves);
		      world.setBlock(i-2, j+6, k-2, leaves);
		      world.setBlock(i+2, j+6, k-2, leaves);
		      world.setBlock(i+2, j+6, k-6, leaves);
	      }
	      else if(d==3)
	      {
		      world.setBlock(i, j, k, wood);
		      world.setBlock(i+1, j+1, k, wood);
		      world.setBlock(i+2, j+1, k, wood);
		      world.setBlock(i+3, j+2, k, wood);
		      world.setBlock(i+4, j+3, k, wood);
		      world.setBlock(i+4, j+4, k, wood);
		      world.setBlock(i+4, j+5, k, wood);
		      world.setBlock(i+4, j+6, k, wood);
		      
		      world.setBlock(i+4, j+7, k, leaves);
		      world.setBlock(i+3, j+7, k+1, leaves);
		      world.setBlock(i+4, j+7, k+1, leaves);
		      world.setBlock(i+5, j+7, k+1, leaves);
		      world.setBlock(i+5, j+7, k, leaves);
		      world.setBlock(i+3, j+7, k, leaves);
		      world.setBlock(i+3, j+7, k-1, leaves);
		      world.setBlock(i+4, j+7, k-1, leaves);
		      world.setBlock(i+5, j+7, k-1, leaves);
		      world.setBlock(i+6, j+7, k, leaves);
		      world.setBlock(i+2, j+7, k, leaves);
		      world.setBlock(i+4, j+7, k+2, leaves);
		      world.setBlock(i+4, j+7, k-2, leaves);
		      
		      world.setBlock(i+4, j+6, k-3, leaves);
		      world.setBlock(i+4, j+6, k+3, leaves);
		      world.setBlock(i+1, j+6, k, leaves);
		      world.setBlock(i+7, j+6, k, leaves);
		      
		      world.setBlock(i+6, j+6, k+2, leaves);
		      world.setBlock(i+2, j+6, k-2, leaves);
		      world.setBlock(i+2, j+6, k+2, leaves);
		      world.setBlock(i+6, j+6, k-2, leaves);
	      }
	      else
	      {
		      world.setBlock(i, j, k, wood);
		      world.setBlock(i-1, j+1, k, wood);
		      world.setBlock(i-2, j+1, k, wood);
		      world.setBlock(i-3, j+2, k, wood);
		      world.setBlock(i-4, j+3, k, wood);
		      world.setBlock(i-4, j+4, k, wood);
		      world.setBlock(i-4, j+5, k, wood);
		      world.setBlock(i-4, j+6, k, wood);
		      
		      world.setBlock(i-4, j+7, k, leaves);
		      world.setBlock(i-3, j+7, k+1, leaves);
		      world.setBlock(i-4, j+7, k+1, leaves);
		      world.setBlock(i-5, j+7, k+1, leaves);
		      world.setBlock(i-5, j+7, k, leaves);
		      world.setBlock(i-3, j+7, k, leaves);
		      world.setBlock(i-3, j+7, k-1, leaves);
		      world.setBlock(i-4, j+7, k-1, leaves);
		      world.setBlock(i-5, j+7, k-1, leaves);
		      world.setBlock(i-6, j+7, k, leaves);
		      world.setBlock(i-2, j+7, k, leaves);
		      world.setBlock(i-4, j+7, k+2, leaves);
		      world.setBlock(i-4, j+7, k-2, leaves);
		      
		      world.setBlock(i-4, j+6, k-3, leaves);
		      world.setBlock(i-4, j+6, k+3, leaves);
		      world.setBlock(i-1, j+6, k, leaves);
		      world.setBlock(i-7, j+6, k, leaves);
		     
		      world.setBlock(i-6, j+6, k+2, leaves);
		      world.setBlock(i-2, j+6, k-2, leaves);
		      world.setBlock(i-2, j+6, k+2, leaves);
		      world.setBlock(i-6, j+6, k-2, leaves);
		     
		      world.setBlock(i-6, j+6, k+2, leaves);
		      world.setBlock(i-2, j+6, k-2, leaves);
		      world.setBlock(i-2, j+6, k+2, leaves);
		      world.setBlock(i-6, j+6, k-2, leaves);
	      }
	      
		return true;
	   }

}
