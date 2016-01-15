package com.mangusbrother.centralCards.communityChestCards.impl;

import com.mangusbrother.cardTypes.PayBankAmountCard;
import com.mangusbrother.centralCards.communityChestCards.CommunityChestCard;

/**
 * Kaepora Gaebora watches over you. Collect 10
 * @author Aaron Axisa
 *
 */
public class KaeporaGaeboraCard extends CommunityChestCard implements PayBankAmountCard {

	@Override
	public int getPlayerPayingAmount() {
		return -10;
	}

	@Override
	protected String getIdentifier() {
		return "Kaepora";
	}
	
}
