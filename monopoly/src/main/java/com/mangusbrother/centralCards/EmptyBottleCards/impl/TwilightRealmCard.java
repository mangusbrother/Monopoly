package com.mangusbrother.centralCards.EmptyBottleCards.impl;

import com.mangusbrother.cardTypes.MoveSpecificPlacePassGoBonusCard;
import com.mangusbrother.centralCards.EmptyBottleCards.EmptyBottleCard;

/**
 * World of shadows. Advance to twilight realm. If you pass Go collect 200
 * @author Aaron Axisa
 *
 */
public class TwilightRealmCard extends EmptyBottleCard implements MoveSpecificPlacePassGoBonusCard{

	@Override
	public int getLocation() {
		return 39;
	}

	@Override
	protected String getIdentifier() {
		return "TwilightRealm";
	}

}
