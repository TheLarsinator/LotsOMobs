package com.lom.lotsomobsentity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.world.World;

public class EntityBison extends EntityCow
{

	public EntityBison(World p_i1683_1_) {
		super(p_i1683_1_);
        this.setSize(0.9F, 1.3F);

	}

	public float spiderScaleAmount() {
		// TODO Auto-generated method stub
		return 1.7F;
	}
	
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(25.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20000000298023224D);
    }

}
