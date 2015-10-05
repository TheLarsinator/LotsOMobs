package com.lom.lotsomobstileentity.undersea.starfish;

import java.util.HashMap;
import java.util.Map;

import com.lom.lotsomobsblocks.BlockTanningRack;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityStarfish extends TileEntity
{
	public float rotation;
	public float ScaleSize;
	public int textureID;
 
    public void readFromNBT(NBTTagCompound nbttag)
    {
		super.readFromNBT(nbttag);
        this.rotation = nbttag.getFloat("rotation");
        this.ScaleSize = nbttag.getFloat("ScaleSize");
        this.textureID = nbttag.getInteger("texture");
    }
 
    public void writeToNBT(NBTTagCompound nbttag)
    {  	
		super.writeToNBT(nbttag);
        nbttag.setFloat("rotation", this.rotation);      
        nbttag.setFloat("ScaleSize", this.ScaleSize);      
        nbttag.setInteger("texture", this.textureID);      
    }
 
    public void setScaleSize(float ScaleSize){
    	this.ScaleSize=ScaleSize;
    }
    
    public void setrotation(float rotation){
    	this.rotation=rotation;
    }
    public void setTextureID(int ID){
    	this.textureID=ID;
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
