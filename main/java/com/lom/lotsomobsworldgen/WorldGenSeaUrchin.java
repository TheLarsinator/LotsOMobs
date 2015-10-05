package com.lom.lotsomobsworldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.lom.lotsomobsinit.LotsOMobsBlocks;

public class WorldGenSeaUrchin extends WorldGenerator
{

	public WorldGenSeaUrchin()
	{
		
	}
	   public boolean generate(World world, Random rand, int i, int j, int k)
	   {
		   
	      if(world.getBlock(i, j-1, k) != Blocks.gravel && world.getBlock(i, j+1, k) != Blocks.water)
	      {
	    	  return false;
	      }
	      	if((rand.nextInt(9)+1) <= 6)
	    	  world.setBlock(i, j, k, LotsOMobsBlocks.SeaUrchin);
	      	else
	      		world.setBlock(i, j, k, LotsOMobsBlocks.Starfish);

	    	  return true;
	   }
}
