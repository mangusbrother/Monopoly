package com.mangusbrother.centralCards.EmptyBottleCards.impl;

import com.mangusbrother.cardTypes.MoveSpecificPlaceCard;
import com.mangusbrother.centralCards.EmptyBottleCards.EmptyBottleCard;

/**
 * Advance to the temple of time
 * @author Aaron Axisa
 *
 */
public class TempleOfTimeCard extends EmptyBottleCard implements MoveSpecificPlaceCard {

	@Override
	public int getLocation() {
		return 12;
	}

	@Override
	protected String getIdentifier() {
		return "TempleOfTime";
	}

}
