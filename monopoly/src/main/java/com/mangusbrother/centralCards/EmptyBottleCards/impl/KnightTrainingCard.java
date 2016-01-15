package com.mangusbrother.centralCards.EmptyBottleCards.impl;

import com.mangusbrother.cardTypes.PayBankHousesCard;
import com.mangusbrother.centralCards.EmptyBottleCards.EmptyBottleCard;

/**
 * Knight Academy training. pay 25 for each deku sprout and 100 ofr each deku tree
 * @author Aaron Axisa
 *
 */
public class KnightTrainingCard extends EmptyBottleCard implements PayBankHousesCard {

	@Override
	public int getHouseAmount() {
		return 25;
	}

	@Override
	public int getHotelAmount() {
		return 100;
	}

	@Override
	protected String getIdentifier() {
		return "KnightAcademy";
	}

	
	
}
