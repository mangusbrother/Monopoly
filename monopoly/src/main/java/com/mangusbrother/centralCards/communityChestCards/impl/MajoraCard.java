package com.mangusbrother.centralCards.communityChestCards.impl;

import com.mangusbrother.cardTypes.PayBankAmountCard;
import com.mangusbrother.centralCards.communityChestCards.CommunityChestCard;

/**
 * Defeat Majora. Collect 25
 * @author Aaron Axisa
 *
 */
public class MajoraCard extends CommunityChestCard implements PayBankAmountCard {

	@Override
	public int getPlayerPayingAmount() {
		return -25;
	}

	@Override
	protected String getIdentifier() {
		return "MAJORA";
	}

}
