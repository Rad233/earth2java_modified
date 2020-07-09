package slexom.earthtojava.mobs.client.renderer.tileentity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import slexom.earthtojava.mobs.init.TileEntityTypeInit;

public class RainbowBedItemStackTileEntityRenderer extends ItemStackTileEntityRenderer {
    @Override
    public void func_239207_a_(ItemStack itemStack, ItemCameraTransforms.TransformType transformType, MatrixStack matrixStack, IRenderTypeBuffer renderTypeBuffer, int combinedLight, int combinedOverlay) {
        TileEntityRendererDispatcher.instance.renderItem(TileEntityTypeInit.RAINBOW_BED.get().create(), matrixStack, renderTypeBuffer, combinedLight, combinedOverlay);
    }
}
