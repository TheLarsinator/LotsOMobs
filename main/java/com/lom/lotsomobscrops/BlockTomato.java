package com.lom.lotsomobscrops;

import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsinit.LotsOMobsItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTomato extends BlockCrops
{
    @SideOnly(Side.CLIENT)
    private IIcon[] field_149867_a;

    public BlockTomato()
    {
        super();
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
        return LotsOMobsItems.Tomato;
    }

    protected Item func_149865_P()
    {
        return LotsOMobsItems.Tomato;
    }
    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 6;
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
}
