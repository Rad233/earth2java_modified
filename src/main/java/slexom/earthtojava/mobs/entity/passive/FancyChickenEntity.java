package slexom.earthtojava.mobs.entity.passive;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;
import slexom.earthtojava.mobs.entity.ai.goal.FancyChickenFleeFromPigEntityGoal;
import slexom.earthtojava.mobs.entity.base.E2JBaseChickenEntity;
import slexom.earthtojava.mobs.init.SoundEventsInit;

public class FancyChickenEntity extends E2JBaseChickenEntity<FancyChickenEntity> {

    public FancyChickenEntity(EntityType<FancyChickenEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(3, new FancyChickenFleeFromPigEntityGoal(this, PigEntity.class, 6.0F, 1.0D, 1.2D));
    }

    protected SoundEvent getAmbientSound() {
        return SoundEventsInit.FANCY_CHICKEN_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEventsInit.FANCY_CHICKEN_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEventsInit.FANCY_CHICKEN_DEATH;
    }

}
