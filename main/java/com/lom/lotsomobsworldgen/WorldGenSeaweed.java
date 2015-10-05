package com.lom.lotsomobsworldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.lom.lotsomobsinit.LotsOMobsBlocks;

public class WorldGenSeaweed extends WorldGenerator
{

	public WorldGenSeaweed()
	{
		
	}
	   public boolean generate(World world, Random rand, int i, int j, int k)
	   {
		  if(world.getBlock(i, j, k) == Blocks.water && world.getBlock(i, j+1, k) == Blocks.water && (world.getBlock(i,  j-1,  k) == Blocks.gravel || world.getBlock(i,  j-1,  k) == Blocks.sand))
	      {
		      Block stalk = LotsOMobsBlocks.Seaweed;

		      world.setBlock(i, j, k, stalk);
	    	  //System.out.println("First stalk planted");
	         return true;
	      }
	      else
	      {
	    	  return false;
	      }
	   }
}
