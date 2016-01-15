package com.mangusbrother.centralCards.EmptyBottleCards.impl;

import com.mangusbrother.cardTypes.PayBankAmountCard;
import com.mangusbrother.centralCards.EmptyBottleCards.EmptyBottleCard;

/**
 * Skull kid has tricked you yet again. Pay 15
 * @author Aaron Axisa
 *
 */
public class SkullkidCard extends EmptyBottleCard implements PayBankAmountCard{

	@Override
	public int getPlayerPayingAmount() {
		return 15;
	}

	@Override
	protected String getIdentifier() {
		return "Skullkid";
	}

}
