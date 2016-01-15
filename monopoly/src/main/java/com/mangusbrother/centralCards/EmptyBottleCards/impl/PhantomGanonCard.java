package com.mangusbrother.centralCards.EmptyBottleCards.impl;

import com.mangusbrother.cardTypes.MoveSpecificPlacePassGoBonusCard;
import com.mangusbrother.centralCards.EmptyBottleCards.EmptyBottleCard;

/**
 * Face off against phantom ganon. Advance to forsaken fortress. If you pass "Go" collect 200
 * @author Aaron Axisa
 *
 */
public class PhantomGanonCard extends EmptyBottleCard implements MoveSpecificPlacePassGoBonusCard {

	@Override
	public int getLocation() {
		return 12;
	}

	@Override
	protected String getIdentifier() {
		return "PhantomGanon";
	}

}
