package com.mangusbrother.centralCards.communityChestCards.impl;

import com.mangusbrother.cardTypes.PayBankAmountCard;
import com.mangusbrother.centralCards.communityChestCards.CommunityChestCard;

/**
 * Buy a mask to continue your quest. Pay 100
 * @author Aaron Axisa
 *
 */
public class MaskCard extends CommunityChestCard implements PayBankAmountCard {

	@Override
	public int getPlayerPayingAmount() {
		return 100;
	}

	@Override
	protected String getIdentifier() {
		return "Mask";
	}

}
