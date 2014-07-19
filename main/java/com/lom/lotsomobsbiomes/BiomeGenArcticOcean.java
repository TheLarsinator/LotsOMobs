package com.lom.lotsomobsbiomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenArcticOcean extends BiomeGenBase
{
    protected static final BiomeGenBase.Height height_Arctic = new BiomeGenBase.Height(-0.1F, 0.3F);
    public BiomeGenArcticOcean(int var1)
    {
        super(var1);
        this.setBiomeName("Arctic Ocean");
        this.waterColorMultiplier = 299999999;
        this.setHeight(height_Arctic);
        this.spawnableCreatureList.clear();
        this.topBlock = Blocks.snow;
        this.fillerBlock = Blocks.ice;
        this.setEnableSnow().func_76733_a(5159473);
        this.getEnableSnow();
        this.setTemperatureRainfall(0.1F, 17F);
        } 
}
