package com.lom.lotsomobstileentity.spinningwheel;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import com.lom.lotsomobsmodels.ModelSpinningWheel;

public class ItemRenderSpinningWheel implements IItemRenderer {

private ModelSpinningWheel SpinningWheelModel;

public ItemRenderSpinningWheel() {

SpinningWheelModel = new ModelSpinningWheel();
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
	TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntitySpinningWheel(), 0.0D, 0.0D, 0.0D, 0.0F);
}
}