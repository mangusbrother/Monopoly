package com.mangusbrother.centralCards.EmptyBottleCards.impl;

import com.mangusbrother.cardTypes.MoveSpecificPlacePassGoBonusCard;
import com.mangusbrother.centralCards.EmptyBottleCards.EmptyBottleCard;

/**
 * Hero of time. Advance to GO. Collect 200
 * @author Aaron Axisa
 *
 */
public class HeroOfTimeCard extends EmptyBottleCard implements MoveSpecificPlacePassGoBonusCard{

	@Override
	public int getLocation() {
		return 0;
	}

	@Override
	protected String getIdentifier() {
		return "HeroOfTime";
	}

}
