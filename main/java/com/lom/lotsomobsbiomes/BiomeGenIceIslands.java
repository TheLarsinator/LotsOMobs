package com.lom.lotsomobsbiomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

import com.lom.lotsomobsinit.LotsOMobsBlocks;

public class BiomeGenIceIslands extends BiomeGenBase
{
    public BiomeGenIceIslands(int var1)
    {
        super(var1);
        this.setBiomeName("IceIslands");
        this.waterColorMultiplier = -13395457;
        this.setHeight(height_PartiallySubmerged);
        this.spawnableCreatureList.clear();
        this.topBlock = Blocks.dirt;
        this.fillerBlock = LotsOMobsBlocks.PermaFrost;
        this.getEnableSnow();
        this.setTemperatureRainfall(-0.1F, -17F);       
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        System.out.println("Generate plox");
    }       
   
}
 

