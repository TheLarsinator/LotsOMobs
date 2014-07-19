package com.lom.lotsomobsitems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.lom.lotsomobsinit.LotsOMobsBlocks;
public class ItemPortalPlacer extends Item
{
public ItemPortalPlacer()
{
super();
setCreativeTab(CreativeTabs.tabTools);
}
public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int X, int Y, int Z, int par7, float par8, float par9, float par10)
{
if (!par3World.isRemote)
{
int direction = MathHelper.floor_double(par2EntityPlayer.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3;
if ((direction == 1) || (direction == 3))
{
for (int y = 1; y < 5; y++)
{
         for (int z = -1; z < 2; z++)
         {
         if (par3World.isAirBlock(X, Y + y, Z + z) == false)
         {
         par2EntityPlayer.addChatMessage(new ChatComponentText("There is not enough room for a portal!"));
                 return false;
         }
         }
}
par3World.setBlock(X, Y + 1, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 1, Y + 1, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X, Y + 2, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 1, Y + 2, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 2, Y + 2, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X - 1, Y + 2, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 3, Y + 3, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X - 2, Y + 3, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 2, Y + 3, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X - 1, Y + 3, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 3, Y + 4, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X - 2, Y + 4, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 2, Y + 4, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X - 1, Y + 4, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 3, Y + 5, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X - 2, Y + 5, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 2, Y + 5, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X - 1, Y + 5, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 2, Y + 6, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X - 1, Y + 6, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X, Y + 7, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 1, Y + 7, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X, Y + 6, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 1, Y + 6, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X, Y + 3, Z, LotsOMobsBlocks.AncientFire);
}
else
{
for (int y = 1; y < 5; y++)
{
    for (int x = -1; x < 2; x++)
    {
    if (par3World.isAirBlock(X+x, Y + y, Z ) == false)
    {
    par2EntityPlayer.addChatMessage(new ChatComponentText("There is not enough room for a portal!"));
            return false;
    }
    }
}
par3World.setBlock(X, Y + 1, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 1, Y + 1, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X, Y + 2, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 1, Y + 2, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 2, Y + 2, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X - 1, Y + 2, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 3, Y + 3, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X - 2, Y + 3, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 2, Y + 3, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X - 1, Y + 3, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 3, Y + 4, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X - 2, Y + 4, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 2, Y + 4, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X - 1, Y + 4, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 3, Y + 5, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X - 2, Y + 5, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 2, Y + 5, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X - 1, Y + 5, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 2, Y + 6, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X - 1, Y + 6, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X, Y + 7, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 1, Y + 7, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X, Y + 6, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X + 1, Y + 6, Z, Blocks.mossy_cobblestone);
par3World.setBlock(X, Y + 3, Z, LotsOMobsBlocks.AncientFire);
}
return true;
}
return true;
}
}