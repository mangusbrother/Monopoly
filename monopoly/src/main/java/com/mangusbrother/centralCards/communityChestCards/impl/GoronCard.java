package com.mangusbrother.centralCards.communityChestCards.impl;

import com.mangusbrother.cardTypes.PayBankAmountCard;
import com.mangusbrother.centralCards.communityChestCards.CommunityChestCard;

/**
 * Save the goron tribe. Collect 100
 * @author Aaron Axisa
 *
 */
public class GoronCard extends CommunityChestCard implements PayBankAmountCard {

	@Override
	public int getPlayerPayingAmount() {
		return -100;
	}

	@Override
	protected String getIdentifier() {
		return "GORON";
	}

	
}
