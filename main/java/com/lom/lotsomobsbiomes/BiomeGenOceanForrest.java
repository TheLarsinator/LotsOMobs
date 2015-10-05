package com.lom.lotsomobsbiomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenOcean;

public class BiomeGenOceanForrest extends BiomeGenOcean
{
    public BiomeGenOceanForrest(int par1)
    {
        super(par1);
        this.setBiomeName("Ocean Forrest");
        this.theBiomeDecorator.treesPerChunk = 0;
        this.theBiomeDecorator.flowersPerChunk = -999;
        this.theBiomeDecorator.generateLakes = true;
        this.theBiomeDecorator.deadBushPerChunk = 5;
        this.theBiomeDecorator.grassPerChunk = 10;
        this.setTemperatureRainfall(1.9F, 17F);
        this.setHeight(height_DeepOceans); 
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
