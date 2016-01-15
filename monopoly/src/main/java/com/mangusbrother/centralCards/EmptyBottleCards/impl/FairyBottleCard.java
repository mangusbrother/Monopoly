package com.mangusbrother.centralCards.EmptyBottleCards.impl;

import com.mangusbrother.cardTypes.GetOutOfJailCard;
import com.mangusbrother.centralCards.EmptyBottleCards.EmptyBottleCard;

public class FairyBottleCard extends EmptyBottleCard implements GetOutOfJailCard {

	@Override
	protected String getIdentifier() {
		return "FairyBottle";
	}

}
