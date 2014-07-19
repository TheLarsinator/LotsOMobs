package com.lom.lotsomobsworldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.lom.lotsomobsinit.LotsOMobsBlocks;

public class WorldGenCoral extends WorldGenerator
{

	public WorldGenCoral()
	{
		
	}
	   public boolean generate(World world, Random rand, int i, int j, int k)
	   {
	      if(world.getBlock(i, j-1, k) == Blocks.sand && world.getBlock(i, j, k) == Blocks.water && world.getBlock(i, j+1, k) == Blocks.water/* || world.getBlock(i, j, k) != Blocks.water || world.getBlock(i, j+1, k) != Blocks.water*/)
	      {
		      Block Coral1 = LotsOMobsBlocks.Coral1;
		      Block Coral2 = LotsOMobsBlocks.Coral2;	      
		      Block Coral3 = LotsOMobsBlocks.Coral3;
		      Block Coral4 = LotsOMobsBlocks.Coral4;
		      int d = rand.nextInt(100);
		      
		     if(d <= 10) 
	    	 world.setBlock(i, j, k, Coral4);
		     else if(d <=20 && d >= 10)
		     world.setBlock(i, j, k, Coral3);
		     else if(d <=30 && d >= 20)
		     world.setBlock(i, j, k, Coral1);
		     else
		     {
				     world.setBlock(i, j, k, Coral2);
		     }
	         return true;
	      }
	      else
	      {
	    	  return false;
	      }
	    /*  int d = rand.nextInt(6) + 1;
	      

	      
	      world.setBlock(i, j, k +d, Coral2);
	      world.setBlock(i+d, j, k+d-2, Coral2);
	      world.setBlock(i+d, j, k+d, Coral2);
	      world.setBlock(i+d, j, k+d+3, Coral2);
	      world.setBlock(i+d, j, k, Coral2);
	      world.setBlock(i+d, j, k+d*2, Coral2);	      world.setBlock(i, j, k +d, Coral2);
	      world.setBlock(i+d, j, k+d-2, Coral2);
	      world.setBlock(i+d, j, k+d, Coral2);
	      world.setBlock(i+d, j, k+d+3, Coral2);
	      world.setBlock(i+d, j, k, Coral2);
	      world.setBlock(i+d, j, k+d*2, Coral2);	      world.setBlock(i, j, k +d, Coral2);
	      world.setBlock(i+d, j, k+d-2, Coral2);
	      world.setBlock(i+d, j, k+d, Coral2);
	      world.setBlock(i+d, j, k+d+3, Coral2);
	      world.setBlock(i+d, j, k, Coral2);
	      world.setBlock(i+d, j, k+d*2, Coral2);	      world.setBlock(i, j, k +d, Coral2);
	      world.setBlock(i+d, j, k+d-2, Coral2);
	      world.setBlock(i+d, j, k+d, Coral2);
	      world.setBlock(i+d, j, k+d+3, Coral2);
	      world.setBlock(i+d, j, k, Coral2);
	      world.setBlock(i+d, j, k+d*2, Coral2);
	      
	      world.setBlock(i, j, k +d, Coral1);
	      world.setBlock(i+d, j, k+d-2, Coral1);
	      world.setBlock(i+d, j, k+d, Coral1);
	      world.setBlock(i+d, j, k+d+3, Coral1);
	      world.setBlock(i+d, j, k, Coral1);
	      world.setBlock(i+d, j, k+d*2, Coral1);
	      
	      world.setBlock(i, j, k +d, Coral3);
	      world.setBlock(i+d, j, k+d-2, Coral3);
	      world.setBlock(i+d, j, k+d, Coral3);
	      world.setBlock(i+d, j, k+d+3, Coral3);
	      world.setBlock(i+d, j, k, Coral3);
	      world.setBlock(i+d, j, k+d*2, Coral3);
	      
	      world.setBlock(i, j, k +d, Coral4);
	      world.setBlock(i+d, j, k+d-2, Coral4);
	      world.setBlock(i+d, j, k+d, Coral4);
	      world.setBlock(i+d, j, k+d+3, Coral4);
	      world.setBlock(i+d, j, k, Coral4);
	      world.setBlock(i+d, j, k+d*2, Coral4);
	      
		return true;
	   }*/
	   }
}
