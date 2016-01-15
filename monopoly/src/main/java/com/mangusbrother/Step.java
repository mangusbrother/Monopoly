package com.mangusbrother;

/**
 * @author samanthacatania
 * @since 15/01/2016.
 */
interface Step {
    // Return "Can Buy"
    boolean action(Player player, int dice) throws InsufficientFundsException;
}
