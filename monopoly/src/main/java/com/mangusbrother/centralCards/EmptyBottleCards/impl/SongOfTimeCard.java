package com.mangusbrother.centralCards.EmptyBottleCards.impl;

import com.mangusbrother.cardTypes.PayBankAmountCard;
import com.mangusbrother.centralCards.EmptyBottleCards.EmptyBottleCard;

/**
 * Play the song of time. collect 50 
 * @author Aaron Axisa
 *
 */
public class SongOfTimeCard extends EmptyBottleCard implements PayBankAmountCard{

	@Override
	public int getPlayerPayingAmount() {
		return -50;
	}

	@Override
	protected String getIdentifier() {
		return "SongOfTime";
	}

}
