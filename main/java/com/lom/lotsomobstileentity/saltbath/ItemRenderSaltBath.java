package com.lom.lotsomobstileentity.saltbath;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import com.lom.lotsomobsmodels.ModelSaltBath;

public class ItemRenderSaltBath implements IItemRenderer {

private ModelSaltBath SaltBathModel;

public ItemRenderSaltBath() {

	SaltBathModel = new ModelSaltBath();
}

@Override
public boolean handleRenderType(ItemStack item, ItemRenderType type) {

return true;
}

@Override
public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {

return true;
}

@Override
public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntitySaltBath(), 0.0D, 0.0D, 0.0D, 0.0F);
}
}