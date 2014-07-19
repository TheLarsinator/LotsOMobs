package com.lom.lotsomobsbiomes;

import java.util.Random;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import com.lom.lotsomobsdino.WorldGenBigDinoTree;
import com.lom.lotsomobsdino.WorldGenDinoShrub;
import com.lom.lotsomobsdino.WorldGenDinoTrees;
import com.lom.lotsomobsdino.WorldGenMegaDinoTree;

public class BiomeGenDinoPlains extends BiomeGenBase 
{
    protected WorldGenBigDinoTree worldGeneratorBigDinoTree;
    public BiomeGenDinoPlains(int par1)
    {
        super(par1);
        this.theBiomeDecorator.treesPerChunk = 2;
        this.theBiomeDecorator.grassPerChunk = 25;
        this.theBiomeDecorator.flowersPerChunk = 10;
        this.setTemperatureRainfall(1.9F, 17F);
        this.setHeight(height_LowPlains); 
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.waterColorMultiplier = -12133;
    }
    public WorldGenAbstractTree func_150567_a(Random p_150567_1_)
    {
        return (WorldGenAbstractTree)(new WorldGenDinoTrees(false, 4 + p_150567_1_.nextInt(7), 3, 3, true));
    }
    public int getBiomeGrassColor(int p_150558_1_, int p_150558_2_, int p_150558_3)
    {
        return (0x009900);
    }
    public int getBiomeFoliageColor(int p_150571_1_, int p_150571_2_, int p_150571_3_)
    {
        return (0x018C01);
    }
 /*   public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);
        long time;


        if (par2Random.nextInt(8) == 0)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            (new WorldGenFlowers(LotsOMobs.OrangeFlower.blockID)).generate(par1World, par2Random, k, par1World.getHeightValue(k, l), l);
        }
        if (par2Random.nextInt(8) == 1)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            (new WorldGenFlowers(LotsOMobs.Flowers.blockID)).generate(par1World, par2Random, k, par1World.getHeightValue(k, l), l);
        }
        if (par2Random.nextInt(8) == 2)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            (new WorldGenFlowers(Block.plantRed.blockID)).generate(par1World, par2Random, k, par1World.getHeightValue(k, l), l);
        }
        if (par2Random.nextInt(8) == 3)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            (new WorldGenFlowers(Block.plantYellow.blockID)).generate(par1World, par2Random, k, par1World.getHeightValue(k, l), l);
        }
        if (par2Random.nextInt(8) == 4)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            (new WorldGenFlowers(LotsOMobs.PurpleFlower.blockID)).generate(par1World, par2Random, k, par1World.getHeightValue(k, l), l);
        }
        if (par2Random.nextInt(8) == 5)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            (new WorldGenFlowers(LotsOMobs.WhiteFlower.blockID)).generate(par1World, par2Random, k, par1World.getHeightValue(k, l), l);
        }
        if (par2Random.nextInt(8) == 5)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            (new WorldGenFlowers(LotsOMobs.BlueFlower.blockID)).generate(par1World, par2Random, k, par1World.getHeightValue(k, l), l);
        }
        if (par2Random.nextInt(8) == 6)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            (new WorldGenFlowers(LotsOMobs.PinkFlower.blockID)).generate(par1World, par2Random, k, par1World.getHeightValue(k, l), l);
        }
        if (par2Random.nextInt(8) == 7)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            (new WorldGenFlowers(LotsOMobs.YellowFlower.blockID)).generate(par1World, par2Random, k, par1World.getHeightValue(k, l), l);
        }
        if (par2Random.nextInt(8) == 8)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            (new WorldGenFlowers(LotsOMobs.RedFlower.blockID)).generate(par1World, par2Random, k, par1World.getHeightValue(k, l), l);
        }
        
    }
   */ 
    /**
     * takes temperature, returns color
     */
    public int getSkyColorByTemp(float f) {
            return 0x05587E;
    }
    /**
     * Provides the basic grass color based on the biome temperature and rainfall
     */
 /*   public int getBiomeGrassColor()
    {
        double d0 = (double)this.getFloatTemperature();
        double d1 = (double)this.getFloatRainfall();
        return ((ColorizerGrass.getGrassColor(d0, d1) & 16711422) + 5115470) / 2;
    }*/
}