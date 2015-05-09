package com.lom.lotsomobstileentity.saltbath;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fluids.FluidStack;

import com.lom.lotsomobscore.handler.PacketHandler;

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
    
    @Override
    public Packet getDescriptionPacket()
    {
        return PacketHandler.getPacket(this);
    }
    
    public void handlePacketData(boolean salt)
    {
    	this.SaltContent = salt;
    }

}
