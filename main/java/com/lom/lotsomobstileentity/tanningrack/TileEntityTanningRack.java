package com.lom.lotsomobstileentity.tanningrack;

import java.util.HashMap;
import java.util.Map;

import com.lom.lotsomobsblocks.BlockTanningRack;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityTanningRack extends TileEntity
{
	public boolean ElephantHide;
	public boolean DeerHide;
	public boolean CleanHide;
    private static Map classToNameMap = new HashMap();
 
    public void readFromNBT(NBTTagCompound nbttag)
    {
        this.DeerHide = nbttag.getBoolean("deer");
        this.ElephantHide = nbttag.getBoolean("tid");
        this.CleanHide = nbttag.getBoolean("cleanhide");
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
        nbttag.setBoolean("tid", this.ElephantHide);      
        nbttag.setBoolean("deer", this.DeerHide);      
        nbttag.setBoolean("cleanhide", this.CleanHide);      
    }
 
    public void setHasElephantHide(boolean hasHide){
	this.ElephantHide=hasHide;
    }
    
    public void setHasDeerHide(boolean hasHide){
	this.DeerHide=hasHide;
    }
    
    public void setHideClean(boolean isClean)
    {
    	this.CleanHide=isClean;
    }
}
