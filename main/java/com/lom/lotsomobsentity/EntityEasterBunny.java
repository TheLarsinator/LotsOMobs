package com.lom.lotsomobsentity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.lom.lotsomobsinit.LotsOMobsBlocks;
import com.lom.lotsomobsinit.LotsOMobsItems;

public class EntityEasterBunny extends EntityLiving implements IMob
{
    public float field_70813_a;
    public float field_70811_b;
    public float field_70812_c;

    /** the time between each jump of the slime */
    private int slimeJumpDelay = 0;

    public EntityEasterBunny(World par1World)
    {
        super(par1World);
        int var2 = 1 << this.rand.nextInt(3);
        this.yOffset = 0.0F;
        this.slimeJumpDelay = this.rand.nextInt(20) + 10;
        this.setSlimeSize(var2);
    }
    

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte)1));
    }

    protected void setSlimeSize(int par1)
    {
        this.dataWatcher.updateObject(16, new Byte((byte)par1));
        this.setSize(1.2F, 0.8F);
        this.setPosition(this.posX, this.posY, this.posZ);
        this.setHealth(this.getMaxHealth());
        this.experienceValue = par1;
    }
    protected void func_110147_ax()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20000000298023224D);
    }

    protected void func_70808_l()
    {
        this.field_70813_a *= 0.6F;
    }

    /**
     * Gets the amount of time the slime needs to wait between jumps.
     */
    protected int getJumpDelay()
    {
        return this.rand.nextInt(20) + 10;
    }

    protected EntityEasterBunny createInstance()
    {
        return new EntityEasterBunny(this.worldObj);
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return null;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return null;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected Item getDropItem()
    {
        return LotsOMobsItems.DeerHideDirty;
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.4F;
    }

    /**
     * The speed it takes to move the entityliving's rotationPitch through the faceEntity method. This is only currently
     * use in wolves.
     */
    public int getVerticalFaceSpeed()
    {
        return 0;
    }
    public int getSlimeSize()
    {
        return this.dataWatcher.getWatchableObjectByte(16);
    }
    protected void updateEntityActionState()
    {
        this.despawnEntity();
        EntityPlayer var1 = this.worldObj.getClosestVulnerablePlayerToEntity(this, 16.0D);

        if (var1 != null)
        {
            this.faceEntity(var1, 10.0F, 20.0F);
        }

        if (this.onGround && this.slimeJumpDelay-- <= 0)
        {
            this.slimeJumpDelay = this.getJumpDelay();

            if (var1 != null)
            {
                this.slimeJumpDelay /= 3;
            }

            this.isJumping = true;

            this.moveStrafing = 1.0F - this.rand.nextFloat() * 2.0F;
            this.moveForward = (float)(1 * this.getSlimeSize());
        }
        else
        {
            this.isJumping = false;

            if (this.onGround)
            {
                this.moveStrafing = this.moveForward = 0.0F;
            }
        }
    }
    
    
    public boolean interact(EntityPlayer par1EntityPlayer)
    {
        ItemStack itemstack = par1EntityPlayer.inventory.getCurrentItem();

        if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(LotsOMobsBlocks.EasterEgg1))
        {
            if (--itemstack.stackSize <= 0)
            {
                par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, new ItemStack(LotsOMobsItems.Amber));
            }
            else if (!par1EntityPlayer.inventory.addItemStackToInventory(new ItemStack(LotsOMobsItems.Amber)))
            {
                par1EntityPlayer.dropItem(LotsOMobsItems.Amber, 1);
            }

            return true;
        }
        
        if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(LotsOMobsBlocks.EasterEgg2))
        {
            if (--itemstack.stackSize <= 0)
            {
                par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, new ItemStack(LotsOMobsItems.IcemintuimBar));
            }
            else if (!par1EntityPlayer.inventory.addItemStackToInventory(new ItemStack(LotsOMobsItems.IcemintuimBar)))
            {
                par1EntityPlayer.dropItem(LotsOMobsItems.IcemintuimBar, 1);
            }

            return true;
        }
        
        if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(LotsOMobsBlocks.EasterEgg3))
        {
            if (--itemstack.stackSize <= 0)
            {
                par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, new ItemStack(Items.slime_ball));
            }
            else if (!par1EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Items.slime_ball)))
            {
                par1EntityPlayer.dropItem(Items.slime_ball, 1);
            }

            return true;
        }
        
        if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(LotsOMobsBlocks.EasterEgg4))
        {
            if (--itemstack.stackSize <= 0)
            {
                par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, new ItemStack(Items.gold_ingot));
            }
            else if (!par1EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Items.gold_ingot)))
            {
                par1EntityPlayer.dropItem(Items.gold_ingot, 1);
            }

            return true;
        }
        
        if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(LotsOMobsBlocks.EasterEgg5))
        {
            if (--itemstack.stackSize <= 0)
            {
                par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, new ItemStack(Items.apple));
            }
            else if (!par1EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Items.apple)))
            {
                par1EntityPlayer.dropItem(Items.apple, 1);
            }

            return true;
        }
        
        
        
        else
        {
            return super.interact(par1EntityPlayer);
        }
    }
}
