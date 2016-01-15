package com.mangusbrother.centralCards.communityChestCards.impl;

import com.mangusbrother.cardTypes.MoveSpecificPlaceCard;
import com.mangusbrother.centralCards.communityChestCards.CommunityChestCard;

/**
 * Trapped by the wili. Go to jail. Go directly to jail, do not pass "GO". Do not collect 200
 * @author Aaron Axisa
 *
 */
public class TwiliCard extends CommunityChestCard implements MoveSpecificPlaceCard {

	@Override
	public int getLocation() {
		return 10;
	}

	@Override
	protected String getIdentifier() {
		return "Twili";
	}

	
}
