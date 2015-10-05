package com.lom.lotsomobstileentity.undersea.urchin;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderSeaUrchin implements IItemRenderer {

private ModelSeaUrchin SeaUrchinModel;

public ItemRenderSeaUrchin() {

	SeaUrchinModel = new ModelSeaUrchin();
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
TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntitySeaUrchin(), 0.0D, 0.0D, 0.0D, 0.0F);
}
}