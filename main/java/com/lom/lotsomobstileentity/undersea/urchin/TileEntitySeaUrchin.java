package com.lom.lotsomobstileentity.undersea.urchin;

import java.util.HashMap;
import java.util.Map;

import com.lom.lotsomobsblocks.BlockTanningRack;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntitySeaUrchin extends TileEntity
{
	public float rotation;
	public float ScaleSize;
 
    public void readFromNBT(NBTTagCompound nbttag)
    {
		super.readFromNBT(nbttag);
        this.rotation = nbttag.getFloat("rotation");
        this.ScaleSize = nbttag.getFloat("ScaleSize");
    }
 
    public void writeToNBT(NBTTagCompound nbttag)
    {  	
		super.writeToNBT(nbttag);
        nbttag.setFloat("rotation", this.rotation);      
        nbttag.setFloat("ScaleSize", this.ScaleSize);      
    }
 
    public void setScaleSize(float ScaleSize){
	this.ScaleSize=ScaleSize;
    }
    
    public void setrotation(float rotation){
	this.rotation=rotation;
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
