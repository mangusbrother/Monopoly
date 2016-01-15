package com.mangusbrother;

/**
 * @author samanthacatania
 * @since 15/01/2016.
 */
public class Go implements Step {
    @Override
    public boolean action(Player player, int dice) {
        player.incrementBalance(200);
        return false;
    }
}
