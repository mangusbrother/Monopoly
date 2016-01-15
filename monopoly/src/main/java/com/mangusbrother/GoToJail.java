package com.mangusbrother;

/**
 * @author samanthacatania
 * @since 15/01/2016.
 */
public class GoToJail implements Step {
    @Override
    public boolean action(Player player, int dice) {
        player.setJailed(true);

        //TODO: Move to Jail
//        player.setPosition();
        return false;
    }
}
