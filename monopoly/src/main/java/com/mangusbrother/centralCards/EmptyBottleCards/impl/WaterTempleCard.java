package com.mangusbrother.centralCards.EmptyBottleCards.impl;

import com.mangusbrother.cardTypes.MoveSpecificPlaceCard;
import com.mangusbrother.centralCards.EmptyBottleCards.EmptyBottleCard;

/**
 * Water Temple Woes. Go To Jail. Go directly to jail. Do not pass "Go". Do not collect 200
 * @author Aaron Axisa
 *
 */
public class WaterTempleCard extends EmptyBottleCard implements MoveSpecificPlaceCard{

	@Override
	public int getLocation() {
		return 20;
	}

	@Override
	protected String getIdentifier() {
		return "WaterTemple";
	}

}
