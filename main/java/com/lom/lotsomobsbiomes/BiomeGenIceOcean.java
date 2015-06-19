package com.lom.lotsomobsbiomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

import com.lom.lotsomobsinit.LotsOMobsBlocks;

public class BiomeGenIceOcean extends BiomeGenBase
{
    public BiomeGenIceOcean(int var1)
    {
        super(var1);
        this.setBiomeName("IceOcean");
        this.waterColorMultiplier = -13395457;
        this.setHeight(height_Oceans);
        this.spawnableCreatureList.clear();
        this.topBlock = Blocks.dirt;
        this.fillerBlock = LotsOMobsBlocks.PermaFrost;
        this.getEnableSnow();
        this.setTemperatureRainfall(-0.1F, -17F);       
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
    }       
   
}
 

