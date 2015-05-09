package com.lom.lotsomobstileentity.saltbath;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

import com.lom.lotsomobscore.handler.PacketHandler;

public class TileEntitySaltBath extends TileEntity
{
	public boolean SaltContent;
	
	public boolean canUpdate() 
	{
		 return true;
	}

	@Override
    public void writeToNBT(NBTTagCompound nbttag)
    {
		super.writeToNBT(nbttag);
        nbttag.setBoolean("tid", this.SaltContent);      
    }
	
	@Override
    public void readFromNBT(NBTTagCompound nbttag)
    {
		super.readFromNBT(nbttag);
        this.SaltContent = nbttag.getBoolean("tid"); 
    }
    
    public void writeToClientNBT(NBTTagCompound nbttag)
    {
        nbttag.setBoolean("tid", this.SaltContent);      
    }
    
    public void readFromClientNBT(NBTTagCompound nbttag)
    {
        this.SaltContent = nbttag.getBoolean("tid"); 
    }
    
    public void setHasSalt(boolean hasSalt)
    {
	this.SaltContent=hasSalt;
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
	 
   
   /* @Override
    public Packet getDescriptionPacket()
    {
        return PacketHandler.getPacket(this);
    }*/
    
    public void handlePacketData(boolean salt)
    {
    	this.SaltContent = salt;
    }
    


}
