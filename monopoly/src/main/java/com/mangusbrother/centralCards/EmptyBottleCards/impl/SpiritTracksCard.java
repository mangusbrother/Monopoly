package com.mangusbrother.centralCards.EmptyBottleCards.impl;

import com.mangusbrother.cardTypes.MoveSpecificPlacePassGoBonusCard;
import com.mangusbrother.centralCards.EmptyBottleCards.EmptyBottleCard;

/**
 * Take a ride on the spirit tracks. Advance to the spirit train. If you pass Go collect 200
 * @author Aaron Axisa
 *
 */
public class SpiritTracksCard extends EmptyBottleCard implements MoveSpecificPlacePassGoBonusCard {

	@Override
	public int getLocation() {
		return 5;
	}

	@Override
	protected String getIdentifier() {
		return "SpiritTracks";
	}

}
