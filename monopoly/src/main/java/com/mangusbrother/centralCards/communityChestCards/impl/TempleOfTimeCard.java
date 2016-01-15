package com.mangusbrother.centralCards.communityChestCards.impl;

import com.mangusbrother.cardTypes.MoveSpecificPlacePassGoBonusCard;
import com.mangusbrother.centralCards.communityChestCards.CommunityChestCard;

/**
 * Open the Temple of Time. Advance to Go. Collect 200
 * @author Aaron Axisa
 *
 */
public class TempleOfTimeCard extends CommunityChestCard implements MoveSpecificPlacePassGoBonusCard {

	@Override
	public int getLocation() {
		return 0;
	}

	@Override
	protected String getIdentifier() {
		return "TempleOfTime";
	}

}
