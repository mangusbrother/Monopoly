package com.mangusbrother.centralCards.communityChestCards.impl;

import com.mangusbrother.cardTypes.PayBankAmountCard;
import com.mangusbrother.centralCards.communityChestCards.CommunityChestCard;

/**
 * Guided by Impa. Collect 50
 * @author Aaron Axisa
 *
 */
public class ImpaCard extends CommunityChestCard implements PayBankAmountCard{

	@Override
	public int getPlayerPayingAmount() {
		return -50;
	}

	@Override
	protected String getIdentifier() {
		return "IMPA";
	}

}
