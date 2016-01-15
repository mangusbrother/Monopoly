package com.mangusbrother.cardTypes;

/**
 * Go to a specific place, if unowned you can buy, otherwise pay x times the cost
 * @author Aaron Axisa
 *
 */
public interface MoveSpecificPlaceRentModifier extends MoveStepsCard {

	int getRentModifier();
}
