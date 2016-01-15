package com.mangusbrother.centralCards.EmptyBottleCards.impl;

import com.mangusbrother.cardTypes.MoveToNearestPlaceRentModifier;
import com.mangusbrother.centralCards.EmptyBottleCards.EmptyBottleCard;

/**
 * Chase the princess to the nearest transportation space. 
 * If unowned you may buy it from the bank
 * If owned pay owner twice the rental to which they are otherwise entitled 
 * @author Aaron Axisa
 *
 */
public class PrincessChaseCard extends EmptyBottleCard implements MoveToNearestPlaceRentModifier {

	@Override
	public int[] getLocationList() {
		return new int[]{5,10,15,20};
	}

	@Override
	public int getRentModifier() {
		return 2;
	}

	@Override
	protected String getIdentifier() {
		return "PrincessChase";
	}

}
