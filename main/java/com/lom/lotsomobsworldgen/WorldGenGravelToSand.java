package com.lom.lotsomobsworldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.lom.lotsomobsinit.LotsOMobsBlocks;

public class WorldGenGravelToSand extends WorldGenerator
{

	public WorldGenGravelToSand()
	{
		
	}
	   public boolean generate(World world, Random rand, int i, int j, int k)
	   {
		   j -= 1;
		   
		 int kelp = rand.nextInt(4)+1;
		 if(kelp != 1)
		 {
	      if(world.getBlock(i, j, k) != Blocks.gravel && world.getBlock(i, j+1, k) != Blocks.water)
	      {
	    	  return false;
	      }
	    	  world.setBlock(i, j, k, Blocks.sand);
	    	  world.setBlock(i+1, j, k, Blocks.sand);
	    	  world.setBlock(i-1, j, k, Blocks.sand);
	    	  world.setBlock(i, j, k+1, Blocks.sand);
	    	  world.setBlock(i, j, k-1, Blocks.sand);
	    	  
	    	  world.setBlock(i+2, j, k, Blocks.sand);
	    	  world.setBlock(i-2, j, k, Blocks.sand);
	    	  world.setBlock(i, j, k+2, Blocks.sand);
	    	  world.setBlock(i, j, k-2, Blocks.sand);
	    	  world.setBlock(i+1, j, k+1, Blocks.sand);
	    	  world.setBlock(i-1, j, k+1, Blocks.sand);
	    	  world.setBlock(i-1, j, k-1, Blocks.sand);
	    	  world.setBlock(i+1, j, k-1, Blocks.sand);
	    	  
	    	  int x = rand.nextInt(18)+ 3;
	    	  int cap = world.getHeightValue(i, k) - x;
	    	  int a = 1;
	    	  while(j + a < cap)
	    	  {
		    	  world.setBlock(i, j+a, k, LotsOMobsBlocks.Seaweed);
		    	  a += 1;
	    	  }
	    	  world.setBlock(i, cap, k, LotsOMobsBlocks.SeaweedTop);

	    	  return true;
		 }
		 else
		 {
		      if(world.getBlock(i, j, k) != Blocks.gravel && world.getBlock(i, j+1, k) != Blocks.water)
		      {
		    	  return false;
		      }
		    	  world.setBlock(i, j, k, Blocks.sand);
		    	  world.setBlock(i+1, j, k, Blocks.sand);
		    	  world.setBlock(i-1, j, k, Blocks.sand);
		    	  world.setBlock(i, j, k+1, Blocks.sand);
		    	  world.setBlock(i, j, k-1, Blocks.sand);
		    	  
		    	  world.setBlock(i+2, j, k, Blocks.sand);
		    	  world.setBlock(i-2, j, k, Blocks.sand);
		    	  world.setBlock(i, j, k+2, Blocks.sand);
		    	  world.setBlock(i, j, k-2, Blocks.sand);
		    	  world.setBlock(i+1, j, k+1, Blocks.sand);
		    	  world.setBlock(i-1, j, k+1, Blocks.sand);
		    	  world.setBlock(i-1, j, k-1, Blocks.sand);
		    	  world.setBlock(i+1, j, k-1, Blocks.sand);
		    	  
		    	  int x = rand.nextInt(14)+ 3;
		    	  int cap = world.getHeightValue(i, k) - x;
		    	  int a = 1;
		    	  while(j + a < cap)
		    	  {
			    	  world.setBlock(i, j+a, k, LotsOMobsBlocks.Kelp);
			    	  a += 1;
		    	  }
		    	  world.setBlock(i, cap, k, LotsOMobsBlocks.Kelp);

		    	  return true;
		 }
	   }
}
