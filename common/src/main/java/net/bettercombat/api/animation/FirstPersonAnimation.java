package net.bettercombat.api.animation;

import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import net.bettercombat.client.animation.FirstPersonAnimator;
import net.bettercombat.client.animation.FirstPersonRenderHelper;
import net.minecraft.client.network.AbstractClientPlayerEntity;

public class FirstPersonAnimation {
    // Adding the given layer will make it visible in first person while it is actively playing
    public static void addLayer(AbstractClientPlayerEntity player, ModifierLayer layer) {
        ((FirstPersonAnimator)player).addLayer(layer);
    }

    public static boolean isRenderingAttackAnimationInFirstPerson() {
        return FirstPersonRenderHelper.isRenderingFirstPersonPlayerModel;
    }
}
