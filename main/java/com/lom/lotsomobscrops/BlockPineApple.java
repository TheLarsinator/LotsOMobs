package com.lom.lotsomobscrops;

import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import scala.util.Random;

import com.ibm.icu.util.Calendar;
import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsinit.LotsOMobsItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPineApple extends BlockCrops
{
    @SideOnly(Side.CLIENT)
    private IIcon[] field_149867_a;
    private static boolean isBirthday;

    public BlockPineApple()
    {
    	super();
    }
    
    public static void dateCheck()
    {
      Calendar calendar = Calendar.getInstance();
      calendar.setTimeInMillis(System.currentTimeMillis());
      if ((calendar.get(2) + 1 == 5) && (calendar.get(5) == 21))
      {
        isBirthday = true;
      }
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        if (p_149691_2_ < 7)
        {
        	if(p_149691_2_ == 6)
        	{
            p_149691_2_ = 5;
        	}
        	return this.field_149867_a[p_149691_2_ >> 1];
        }
        else
        {
        return this.field_149867_a[3];
        }
    }

    protected Item func_149866_i()
    {
        return LotsOMobsItems.PineApple;
    }

    protected Item func_149865_P()
    {
        return LotsOMobsItems.PineApple;
    }
    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 1;
    }
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_149867_a = new IIcon[4];

        for (int i = 0; i < this.field_149867_a.length; ++i)
        {
            this.field_149867_a[i] = p_149651_1_.registerIcon(LotsOMobs.modid + ":" + this.getUnlocalizedName() + "_stage_" + i);
        }
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player)
    {
    	Random rand = new Random();
    	int i = rand.nextInt(49);
    	if(i<5)
    	{
    	world.createExplosion(null, x, y+1, z, 2F, true);
    	player.addChatMessage(new ChatComponentText(player.getDisplayName()+" just tried to harvest a Pineapple!"));
    	}
    
    }
}
