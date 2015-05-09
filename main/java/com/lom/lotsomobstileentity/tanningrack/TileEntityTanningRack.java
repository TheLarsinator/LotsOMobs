package com.lom.lotsomobstileentity.tanningrack;

import java.util.HashMap;
import java.util.Map;

import com.lom.lotsomobsblocks.BlockTanningRack;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityTanningRack extends TileEntity
{
	public boolean ElephantHide;
	public boolean DeerHide;
	public boolean CleanHide;
 
    public void readFromNBT(NBTTagCompound nbttag)
    {
		super.readFromNBT(nbttag);
        this.DeerHide = nbttag.getBoolean("deer");
        this.ElephantHide = nbttag.getBoolean("tid");
        this.CleanHide = nbttag.getBoolean("cleanhide");      
    }
 
    public void writeToNBT(NBTTagCompound nbttag)
    {  	
		super.writeToNBT(nbttag);
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
    
	@Override
	public Packet getDescriptionPacket() 
	{
	  NBTTagCompound nbt = new NBTTagCompound();
	  writeToNBT(nbt);
	  S35PacketUpdateTileEntity packet = new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, this.blockMetadata, nbt);
	  return packet;
	 }
	
	@Override
	public void onDataPacket(NetworkManager arg0, S35PacketUpdateTileEntity arg1) 
	{
	  readFromNBT(arg1.func_148857_g());
	}
}
