package com.mangusbrother.centralCards.EmptyBottleCards.impl;

import com.mangusbrother.cardTypes.PayBankAmountCard;
import com.mangusbrother.centralCards.EmptyBottleCards.EmptyBottleCard;

/**
 * Break some pots. Collect 150
 * @author Aaron Axisa
 *
 */
public class PotBreakingCard extends EmptyBottleCard implements PayBankAmountCard {

	@Override
	public int getPlayerPayingAmount() {
		return -150;
	}

	@Override
	protected String getIdentifier() {
		return "PotBreak";
	}

}
