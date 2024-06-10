package net.pakhtusov.magicmod.item.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
public class MagicSword extends SwordItem {
    public MagicSword(Tier pTier, int pAttackDamage, float pAttackSpeed, Properties pProperties) {
        super(pTier, pAttackDamage, pAttackSpeed, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.addEffect(new MobEffectInstance(MobEffects.JUMP,200), pAttacker);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
