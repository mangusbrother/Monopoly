package com.mangusbrother.cardTypes;

public interface MoveToNearestPlaceDiceRoll extends MoveToNearestPlace {

	/**
	 * @return The amount to be multiplied to the dice throw to be paid to the owner
	 */
	int getDiceMultiplier();
}
