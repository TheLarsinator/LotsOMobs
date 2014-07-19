package com.lom.lotsomobstileentity.saltbath;

import java.util.HashMap;
import java.util.Map;

import com.lom.lotsomobsblocks.BlockTanningRack;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntitySaltBath extends TileEntity
{
	public boolean SaltContent;
    private static Map classToNameMap = new HashMap();
 
    public void readFromNBT(NBTTagCompound nbttag)
    {
        this.SaltContent = nbttag.getBoolean("tid");    
}
 
    public void writeToNBT(NBTTagCompound nbttag)
    {
        String s = (String)classToNameMap.get(this.getClass());
 
        if (s == null)
        {
            throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
        }
        else
        {
                nbttag.setString("id", s);
        }
        nbttag.setBoolean("tid", this.SaltContent);      
    }
 
    public void setHasSalt(boolean hasSalt){
	this.SaltContent=hasSalt;
    }
}
