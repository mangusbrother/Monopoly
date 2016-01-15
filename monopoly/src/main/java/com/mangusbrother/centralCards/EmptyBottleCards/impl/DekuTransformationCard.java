package com.mangusbrother.centralCards.EmptyBottleCards.impl;

import com.mangusbrother.cardTypes.PayPlayerAmountCard;
import com.mangusbrother.centralCards.EmptyBottleCards.EmptyBottleCard;

/**
 * Transformed into a deku. pay each player 50
 * @author Aaron Axisa
 *
 */
public class DekuTransformationCard extends EmptyBottleCard implements PayPlayerAmountCard {

	@Override
	public int getPlayerAmountValue() {
		return 50;
	}

	@Override
	protected String getIdentifier() {
		return "DekuTransformation";
	}

	
}
