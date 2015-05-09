package com.lom.lotsomobstileentity.saltbath;

import java.util.HashMap;
import java.util.Map;

import com.lom.lotsomobsblocks.BlockTanningRack;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntitySaltBath extends TileEntity
{
	public boolean SaltContent;
 
    public void readFromNBT(NBTTagCompound nbttag)
    {
        this.SaltContent = nbttag.getBoolean("tid"); 
    }
 
    public void writeToNBT(NBTTagCompound nbttag)
    {
        nbttag.setBoolean("tid", this.SaltContent);      
    }
 
    public void setHasSalt(boolean hasSalt)
    {
	this.SaltContent=hasSalt;
    }
}
