package com.lom.lotsomobscore.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.EnumMap;
import java.util.List;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobstileentity.saltbath.TileEntitySaltBath;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.FMLEmbeddedChannel;
import cpw.mods.fml.common.network.FMLIndexedMessageToMessageCodec;
import cpw.mods.fml.common.network.FMLOutboundHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public enum PacketHandler 
{
	INSTANCE;
	
	private EnumMap<Side, FMLEmbeddedChannel> channels;
	
	private PacketHandler()
	{
		this.channels = NetworkRegistry.INSTANCE.newChannel("LotsOMobs",  new TELotsOMobsCodec());
        if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
        {
            addClientHandler();
        }
        if(FMLCommonHandler.instance().getSide() == Side.SERVER)
        {
        	System.out.println("Server sided~");
        }
	}
	
	@SideOnly(Side.CLIENT)
    private void addClientHandler()
    {
        FMLEmbeddedChannel clientChannel = this.channels.get(Side.CLIENT);

        String tileLomCodec = clientChannel.findChannelHandlerNameForType(TELotsOMobsCodec.class);
        clientChannel.pipeline().addAfter(tileLomCodec, "TileEntitySaltBathHandler", new TileEntitySaltBathMessageHandler());
    }

    
    private static class TileEntitySaltBathMessageHandler extends SimpleChannelInboundHandler<TileEntitySaltBathMessage>
    {
        @Override
        protected void channelRead0(ChannelHandlerContext ctx, TileEntitySaltBathMessage msg) throws Exception
        {
            World world = LotsOMobs.proxy.getClientWorld();
            TileEntity te = world.getTileEntity(msg.x, msg.y, msg.z);
            
            if (te instanceof TileEntitySaltBath)
            {
                TileEntitySaltBath Lom = (TileEntitySaltBath) te;

                Lom.handlePacketData(msg.hasSalt);
                
                System.out.println("Getting Called!");
            }
        }
    }

    public static class BMMessage
    {
        int index;
    }

    public static class TileEntitySaltBathMessage extends BMMessage
    {
        int x;
        int y;
        int z;
        
        boolean hasSalt;
    }

    
    private class ClientToServerCodec extends FMLIndexedMessageToMessageCodec<BMMessage>
    {
    	public ClientToServerCodec()
    	{
    	}
    	
		@Override
		public void encodeInto(ChannelHandlerContext ctx, BMMessage msg, ByteBuf target) throws Exception 
		{
			target.writeInt(msg.index);
			
			
			switch(msg.index)
			{
			
			}
		}

		@Override
		public void decodeInto(ChannelHandlerContext ctx, ByteBuf source, BMMessage msg) 
		{
			int index = source.readInt();
			
			System.out.println("Packet is recieved and being decoded");
			
			switch(index)
			{
			
			}
		}
    }
    
    private class TELotsOMobsCodec extends FMLIndexedMessageToMessageCodec<BMMessage>
    {
        public TELotsOMobsCodec()
        {
            addDiscriminator(0, TileEntitySaltBathMessage.class);
        /*  addDiscriminator(1, TEOrientableMessage.class);
            addDiscriminator(2, TEPedestalMessage.class);
            addDiscriminator(3, TEPlinthMessage.class);
            addDiscriminator(4, TESocketMessage.class);
            addDiscriminator(5, TETeleposerMessage.class);
            addDiscriminator(6, TEWritingTableMessage.class);
            addDiscriminator(7, ParticleMessage.class);
            addDiscriminator(8, VelocityMessage.class);
            addDiscriminator(9, TEMasterStoneMessage.class);
            addDiscriminator(10, TEReagentConduitMessage.class);
            addDiscriminator(11, CurrentLPMessage.class);
            addDiscriminator(12, CurrentReagentBarMessage.class);
            addDiscriminator(13, CurrentAddedHPMessage.class);
            addDiscriminator(14, KeyboardMessage.class);*/
        }

        @Override
        public void encodeInto(ChannelHandlerContext ctx, BMMessage msg, ByteBuf target) throws Exception
        {
            target.writeInt(msg.index);

            switch (msg.index)
            {
                case 0:
                    target.writeInt(((TileEntitySaltBathMessage) msg).x);
                    target.writeInt(((TileEntitySaltBathMessage) msg).y);
                    target.writeInt(((TileEntitySaltBathMessage) msg).z);
                    System.out.println("Am I getting called?");
                    target.writeBoolean(((TileEntitySaltBathMessage) msg).hasSalt);
                    break;
            }
        }


        @Override
        public void decodeInto(ChannelHandlerContext ctx, ByteBuf dat, BMMessage msg)
        {
            int index = dat.readInt();

            switch (index)
            {
                case 0:
                    ((TileEntitySaltBathMessage) msg).x = dat.readInt();
                    ((TileEntitySaltBathMessage) msg).y = dat.readInt();
                    ((TileEntitySaltBathMessage) msg).z = dat.readInt();
                    
                    ((TileEntitySaltBathMessage) msg).hasSalt = dat.readBoolean();
                    break;
            }
        }
    }

    //Packets to be obtained
    public static Packet getPacket(TileEntitySaltBath tileLom)
    {
        TileEntitySaltBathMessage msg = new TileEntitySaltBathMessage();
        msg.index = 0;
        msg.x = tileLom.xCoord;
        msg.y = tileLom.yCoord;
        msg.z = tileLom.zCoord;
        msg.hasSalt = tileLom.SaltContent;
        
        System.out.println("Im getting the packet!");

        return INSTANCE.channels.get(Side.SERVER).generatePacketFrom(msg);
    }
    
    public void sendTo(Packet message, EntityPlayerMP player)
    {
        this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGET).set(FMLOutboundHandler.OutboundTarget.PLAYER);
        this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGETARGS).set(player);
        this.channels.get(Side.SERVER).writeAndFlush(message);
    }

    public void sendToAll(Packet message)
    {
        this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGET).set(FMLOutboundHandler.OutboundTarget.ALL);
        this.channels.get(Side.SERVER).writeAndFlush(message);
    }

    public void sendToAllAround(Packet message, NetworkRegistry.TargetPoint point)
    {
        this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGET).set(FMLOutboundHandler.OutboundTarget.ALLAROUNDPOINT);
        this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGETARGS).set(point);
        this.channels.get(Side.SERVER).writeAndFlush(message);
    }
    
    public void sendToServer(Packet message)
    {
        this.channels.get(Side.CLIENT).attr(FMLOutboundHandler.FML_MESSAGETARGET).set(FMLOutboundHandler.OutboundTarget.TOSERVER);
        this.channels.get(Side.CLIENT).writeAndFlush(message).addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
    }
}