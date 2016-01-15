package com.mangusbrother.centralCards.communityChestCards.impl;

import com.mangusbrother.cardTypes.PayPlayerAmountCard;
import com.mangusbrother.centralCards.communityChestCards.CommunityChestCard;
/**
 * Four Swords Quest. Collect 10 from every player
 * @author Aaron Axisa
 *
 */
public class FourSwordsQuestCard extends CommunityChestCard implements PayPlayerAmountCard{

	@Override
	public int getPlayerAmountValue() {
		return -10;
	}

	@Override
	protected String getIdentifier() {
		return "FourSwords";
	}

}
