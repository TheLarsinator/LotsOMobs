package com.lom.lotsomobstileentity.coconut;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import com.lom.lotsomobsmodels.ModelCoconut;

public class ItemRenderCoconut implements IItemRenderer {

private ModelCoconut CoconutModel;

public ItemRenderCoconut() {

	CoconutModel = new ModelCoconut();
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
TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityCoconut(), 0.0D, 0.0D, 0.0D, 0.0F);
}
}