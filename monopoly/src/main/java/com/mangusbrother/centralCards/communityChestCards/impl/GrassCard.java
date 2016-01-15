package com.mangusbrother.centralCards.communityChestCards.impl;

import com.mangusbrother.cardTypes.PayBankAmountCard;
import com.mangusbrother.centralCards.communityChestCards.CommunityChestCard;

/**
 * Cutting the grass. collect 20
 * @author Aaron Axisa
 *
 */
public class GrassCard extends CommunityChestCard implements PayBankAmountCard {

	@Override
	public int getPlayerPayingAmount() {
		return -20;
	}

	@Override
	protected String getIdentifier() {
		return "GRASS";
	}

}
