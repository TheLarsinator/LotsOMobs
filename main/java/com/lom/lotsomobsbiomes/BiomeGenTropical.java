package com.lom.lotsomobsbiomes;

import com.lom.lotsomobsdino.WorldGenBigDinoTree;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenTropical extends BiomeGenBase
{
    protected static final BiomeGenBase.Height Tropical = new BiomeGenBase.Height(-0.2F, 0.05F);

    public BiomeGenTropical(int par1)
    {
        super(par1);
        this.setBiomeName("Tropical Beach");
        this.theBiomeDecorator.treesPerChunk = 0;
        this.theBiomeDecorator.flowersPerChunk = -999;
        this.theBiomeDecorator.generateLakes = true;
        this.theBiomeDecorator.deadBushPerChunk = 5;
        this.theBiomeDecorator.grassPerChunk = 10;
        this.setTemperatureRainfall(1.9F, 17F);
        this.setHeight(Tropical); 
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        //this.waterColorMultiplier = -12133;
        this.topBlock = Blocks.sand;
        this.fillerBlock = Blocks.sand;
    }
    
    public int getWaterColorMultiplier()
    {
    	return 0x61ffb0;
    }
}
