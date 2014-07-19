package com.lom.lotsomobsblocks;

import java.util.Random;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsinit.LotsOMobsBlocks;
import com.lom.lotsomobsinit.LotsOMobsItems;
import com.lom.lotsomobstileentity.coconut.TileEntityCoconut;

public class BlockCoconut extends BlockFalling implements ITileEntityProvider
{
	public static int rotangle = new Random().nextInt(3);

public BlockCoconut(Material rock)
{
         super(Material.rock);
         this.setCreativeTab(LotsOMobs.LotsOMobsBlockTab);
}
@Override
public int getRenderType() {
    return -1;
}

@Override
public boolean isOpaqueCube(){
return false;
}

@Override
public boolean renderAsNormalBlock(){
return false;
}


@Override
public TileEntity createNewTileEntity(World var1, int var2)
{
 return new TileEntityCoconut();
}


public int quantityDropped(int par1)
{
         return (2);
}

/**
 * Called when the block is placed in the world.
 */
public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
{
    int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
    par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
}
public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
{
    float f;
    float f1;
    
    f = 0.255F;
    f1 = 0.255F;
    this.setBlockBounds(0.3F, 0F, 0.3F, 0.7F, 0.5F, 0.7F);
}
public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
{
    return null;
}

public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
{
	
    if (!p_149674_1_.isRemote && p_149674_1_.getBlock(p_149674_2_, p_149674_3_+1, p_149674_4_) != LotsOMobsBlocks.PalmLeaves)
    {
        this.func_149830_m(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_);
    }
}

private void func_149830_m(World world, int i, int j, int k)
{
    if (func_149831_e(world, i, j - 1, k) && j >= 0)
    {
        byte b0 = 32;

        if (!fallInstantly && world.checkChunksExist(i - b0, j - b0, k - b0, i + b0, j + b0, k + b0))
        {
            if (!world.isRemote)
            {
                EntityFallingBlock entityfallingblock = new EntityFallingBlock(world, (double)((float)i + 0.5F), (double)((float)j + 0.5F), (double)((float)k + 0.5F), this, world.getBlockMetadata(i, j, k));
                this.func_149829_a(entityfallingblock);
                world.spawnEntityInWorld(entityfallingblock);
            }
        }
        else
        {
            world.setBlockToAir(i, j, k);

            while (func_149831_e(world, i, j - 1, k) && j > 0)
            {
                --j;
            }

            if (j > 0)
            {
                world.setBlock(i, j, k, this);
            }
        }
    }
	
}
public Item getItemDropped(int par1, Random par2Random, int par3)
{
         return LotsOMobsItems.CocoMilk;
}

}