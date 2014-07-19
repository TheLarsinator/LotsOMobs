package com.lom.lotsomobsworldgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.lom.lotsomobsbiomes.BiomeGenIcePlains;
import com.lom.lotsomobscore.handler.ConfigHandler;
import com.lom.lotsomobsinit.LotsOMobsBlocks;

import cpw.mods.fml.common.IWorldGenerator;

public class OreGeneration implements IWorldGenerator 
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

    if(biome instanceof BiomeGenIcePlains){
	for (int i = 0; i < 7; i++) {
	int randPosX = chunkX + rand.nextInt(16);
	int randPosY = rand.nextInt(60);
	int randPosZ = chunkZ + rand.nextInt(16);
	(new WorldGenMinable(LotsOMobsBlocks.IceStone, 10)).generate(world, rand,
	randPosX, randPosY, randPosZ);
	}
	}
    if(biome instanceof BiomeGenIcePlains){
	for (int i = 0; i < 10; i++) {
	int randPosX = chunkX + rand.nextInt(16);
	int randPosY = rand.nextInt(60);
	int randPosZ = chunkZ + rand.nextInt(16);
	(new WorldGenMinable(LotsOMobsBlocks.IceStone, 10)).generate(world, rand,
	randPosX, randPosY, randPosZ);
	}
	}
    if(biome instanceof BiomeGenOcean){
	for (int i = 0; i < 10; i++) {
	int randPosX = chunkX + rand.nextInt(16);
	int randPosY = rand.nextInt(60);
	int randPosZ = chunkZ + rand.nextInt(16);
	(new WorldGenMinable(LotsOMobsBlocks.SaltOre, 10)).generate(world, rand,
	randPosX, randPosY, randPosZ);
	}
	}
}

public void generateEnd() {
//we're not going to generate in the end either
}
public void generateDinoAge(World world, Random rand, int chunkX, int chunkZ) {
		for (int i = 0; i < 7; i++) {
		int randPosX = chunkX + rand.nextInt(16);
		int randPosY = rand.nextInt(7);
		int randPosZ = chunkZ + rand.nextInt(16);

		(new WorldGenMinable(LotsOMobsBlocks.AmberOre, 10)).generate(world, rand,
		randPosX, randPosY, randPosZ);
		}
	}
public void generateIceAge(World world, Random rand, int chunkX, int chunkZ) {
	for (int i = 0; i < 7; i++) {
	int randPosX = chunkX + rand.nextInt(16);
	int randPosY = rand.nextInt(7);
	int randPosZ = chunkZ + rand.nextInt(16);

	(new WorldGenMineableIce(LotsOMobsBlocks.IcemintuimOre, 10)).generate(world, rand,
	randPosX, randPosY, randPosZ);
	}
	for (int i = 0; i < 15; i++) {
	int randPosX = chunkX + rand.nextInt(16);
	int randPosY = rand.nextInt(128);
	int randPosZ = chunkZ + rand.nextInt(16);

	(new WorldGenMineableIce(LotsOMobsBlocks.IceCoal, 10)).generate(world, rand,
	randPosX, randPosY, randPosZ);
	}
	for (int i = 0; i < 15; i++) {
	int randPosX = chunkX + rand.nextInt(16);
	int randPosY = rand.nextInt(51);
	int randPosZ = chunkZ + rand.nextInt(16);

	(new WorldGenMineableIce(LotsOMobsBlocks .IceIron, 10)).generate(world, rand,
	randPosX, randPosY, randPosZ);
	}
}
}