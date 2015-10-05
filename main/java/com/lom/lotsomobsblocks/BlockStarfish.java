package com.lom.lotsomobsblocks;

import java.util.Random;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobstileentity.undersea.starfish.TileEntityStarfish;
import com.lom.lotsomobstileentity.undersea.urchin.TileEntitySeaUrchin;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockStarfish extends Block implements ITileEntityProvider
{
	public static int rotangle = new Random().nextInt(3);
	public static boolean hasElephantHide;
	Random rand = new Random();
public BlockStarfish()
{
	     super(Material.water);
	     this.setBlockBounds(0F, 0.0F, 0.0F, 1F, 0.5F, 1F);
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

/**
 * Returns the quantity of items to drop on block destruction.
 */
public int quantityDropped(Random par1Random)
{
    return 1;
}

@Override
public boolean renderAsNormalBlock(){
return false;
}

@Override
public TileEntity createNewTileEntity(World var1, int var2) 
{
 return new TileEntityStarfish();
}
public void onBlockAdded(World par1World, int i, int j, int k)
{
	((TileEntityStarfish) par1World.getTileEntity(i, j, k)).setrotation(rand.nextFloat());
	((TileEntityStarfish) par1World.getTileEntity(i, j, k)).setScaleSize(rand.nextInt(3)+1);
	((TileEntityStarfish) par1World.getTileEntity(i, j, k)).setTextureID(rand.nextInt(3)+1);
}
/**
 * Called when the block is placed in the world.
 */
public void onBlockPlacedBy(World par1World, int i, int j, int k, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
{
    int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
    par1World.setBlockMetadataWithNotify(i, j, k, l, 2);

    ((TileEntityStarfish) par1World.getTileEntity(i, j, k)).setrotation(rand.nextFloat());
    ((TileEntityStarfish) par1World.getTileEntity(i, j, k)).setScaleSize(rand.nextInt(3)+1);
    ((TileEntityStarfish) par1World.getTileEntity(i, j, k)).setTextureID(rand.nextInt(3)+1);
    System.out.println("Hello world");
    

}
}