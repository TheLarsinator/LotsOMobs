package com.lom.lotsomobsiceage;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.DimensionManager;

import com.lom.lotsomobscore.handler.ConfigHandler;

public class WorldProviderIceAge extends WorldProvider
{
public void registerWorldChunkManager()
{
/** tells Minecraft to use our new WorldChunkManager **/
this.worldChunkMgr = new WorldChunkManagerIceAge(worldObj.getSeed(), terrainType);
this.hasNoSky = false;
}

@Override
/** Dimension Name **/
public String getDimensionName()
{
return "IceAge";
}

/** Get Provider for dimension **/
public static WorldProvider getProviderForDimension(int id)
{
return DimensionManager.createProviderFor(ConfigHandler.dimension2);
}

/** Welcome message **/
public String getWelcomeMessage()
{
return "Entering the Ice Age Dimension";
}

/** What chunk provider to use **/
public IChunkProvider createChunkGenerator()
{
return new ChunkProviderIceAge(worldObj, worldObj.getSeed(), true);
}

/** Can player re-spawn here **/
public boolean canRespawnHere()
{
return false;
}

/** Set user message **/
// not sure if this works any more ?
protected synchronized String setUserMessage(String par1Str)
{
return "Building Ice Age Dimension";
}

/** Determines the dimension the player will be respawned in **/
public int getRespawnDimension(EntityPlayerMP player)
{
return 0;
}

/** Dimension Movement speed **/
public double getMovementFactor()
{
return 10.0;
}
@Override
public boolean canCoordinateBeSpawn(int par1, int par2)
{
    Block k = this.worldObj.getTopBlock(par1, par2);
    return k == Blocks.snow; //change to ur grass ur wutever
}
}