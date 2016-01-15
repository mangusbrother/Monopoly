package com.mangusbrother.centralCards.communityChestCards.impl;

import com.mangusbrother.cardTypes.PayBankAmountCard;
import com.mangusbrother.centralCards.communityChestCards.CommunityChestCard;

/**
 * Touch the triforce. Collect 200
 * @author Aaron Axisa
 *
 */
public class TriforceCard extends CommunityChestCard implements PayBankAmountCard {

	@Override
	public int getPlayerPayingAmount() {
		return -200;
	}

	@Override
	protected String getIdentifier() {
		return "TRIFORCE";
	}

}
