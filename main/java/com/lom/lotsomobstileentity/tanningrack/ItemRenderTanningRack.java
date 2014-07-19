package com.lom.lotsomobstileentity.tanningrack;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import com.lom.lotsomobsmodels.ModelTanningRack;

public class ItemRenderTanningRack implements IItemRenderer {

private ModelTanningRack TanningRackModel;

public ItemRenderTanningRack() {

	TanningRackModel = new ModelTanningRack();
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
TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityTanningRack(), 0.0D, 0.0D, 0.0D, 0.0F);
}
}