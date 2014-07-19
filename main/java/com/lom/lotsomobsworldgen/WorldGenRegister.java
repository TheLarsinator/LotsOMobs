package com.lom.lotsomobsworldgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;

import com.lom.lotsomobsbiomes.BiomeGenTropical;
import com.lom.lotsomobscore.handler.ConfigHandler;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenRegister implements IWorldGenerator 
{
	
@Override
public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
{
if(world.provider.dimensionId == -1)
{
	generateNether();
}
else if(world.provider.dimensionId == 0)
{
	generateSurface(world, random, chunkX*16, chunkZ*16);
}
else if(world.provider.dimensionId == 1)
{
	generateEnd();
}
else if(world.provider.dimensionId == ConfigHandler.dimension)
{
	generateDinoAge(world, random, chunkX*16, chunkZ*16);
}
else if(world.provider.dimensionId == ConfigHandler.dimension2)
{
	generateIceAge(world, random, chunkX*16, chunkZ*16);
}
}

public void generateNether() {
//we're not doing ore ore in the nether
}

public void generateSurface(World world, Random rand, int chunkX, int chunkZ) 
{
	BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);   

	WorldGenPalmTree palmtree = new WorldGenPalmTree();

    if(biome instanceof BiomeGenTropical)
    {
        for(int x = 0; x < 1; x++)
        {
        int Xcoord = chunkX + rand.nextInt(50);
        int Zcoord = chunkZ + rand.nextInt(50);
        int i = world.getHeightValue(Xcoord, Zcoord);
        new WorldGenPalmTree().generate(world, rand, Xcoord, i, Zcoord);
        }
        
    }
    if(biome instanceof BiomeGenTropical)
    {
    	for(int z = 0; z < 10000; z++)
        {
            int Xcoord = chunkX + rand.nextInt(50);
            int Zcoord = chunkZ + rand.nextInt(50);
            int i = rand.nextInt(256);
            new WorldGenCoral().generate(world, rand, Xcoord, i, Zcoord);
        }
        
    }
}

public void generateEnd() {
//we're not going to generate in the end either
}
public void generateDinoAge(World world, Random rand, int chunkX, int chunkZ) {

	}
public void generateIceAge(World world, Random rand, int chunkX, int chunkZ) {

}
}