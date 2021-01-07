package slexom.earthtojava.mobs.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CowEntityModel;
import net.minecraft.util.Identifier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import slexom.earthtojava.mobs.client.renderer.entity.model.E2JShearableCowModel;
import slexom.earthtojava.mobs.entity.base.E2JBaseShearableCowEntity;
import slexom.earthtojava.mobs.entity.passive.UmbraCowEntity;
import slexom.earthtojava.mobs.entity.passive.WoolyCowEntity;

import java.text.MessageFormat;

@Environment(EnvType.CLIENT)
public class E2JShearableCowRenderer extends MobEntityRenderer<E2JBaseShearableCowEntity, E2JShearableCowModel<E2JBaseShearableCowEntity>> {

    private final String registryName;

    public E2JShearableCowRenderer(EntityRenderDispatcher entityRenderDispatcher, String registryName) {
        super(entityRenderDispatcher, new E2JShearableCowModel<>(), 0.7F);
        this.registryName = registryName;
    }

    public Identifier getTexture(E2JBaseShearableCowEntity entity) {
        String resourceTexture = MessageFormat.format("earthtojavamobs:textures/mobs/cow/{0}/{0}.png", this.registryName);
        String resourceTextureBlink = MessageFormat.format("earthtojavamobs:textures/mobs/cow/{0}/{0}_blink.png", this.registryName);
        String resourceTextureSheared = MessageFormat.format("earthtojavamobs:textures/mobs/cow/{0}/{0}_sheared.png", this.registryName);
        String resourceTextureShearedBlink = MessageFormat.format("earthtojavamobs:textures/mobs/cow/{0}/{0}_sheared_blink.png", this.registryName);
        Identifier texture = new Identifier(resourceTexture);
        Identifier textureBlink = new Identifier(resourceTextureBlink);
        Identifier textureSheared = new Identifier(resourceTextureSheared);
        Identifier textureShearedBlink = new Identifier(resourceTextureShearedBlink);
        boolean blink = entity.getBlinkRemainingTicks() > 0;
        return entity.isSheared() ? blink ? textureShearedBlink : textureSheared : blink ? textureBlink : texture;
    }
}