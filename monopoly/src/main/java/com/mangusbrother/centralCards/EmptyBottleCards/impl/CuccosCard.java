package com.mangusbrother.centralCards.EmptyBottleCards.impl;

import com.mangusbrother.cardTypes.MoveStepsCard;
import com.mangusbrother.centralCards.EmptyBottleCards.EmptyBottleCard;

/**
 * Attacked by cuccos. Go back three spaces
 * @author Aaron Axisa
 *
 */
public class CuccosCard extends EmptyBottleCard implements MoveStepsCard {

	@Override
	public int getStepsToMove() {
		return -3;
	}

	@Override
	protected String getIdentifier() {
		return "Cuccos";
	}

}
