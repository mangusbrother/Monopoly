package com.mangusbrother.centralCards.communityChestCards.impl;

import com.mangusbrother.cardTypes.PayBankAmountCard;
import com.mangusbrother.centralCards.communityChestCards.CommunityChestCard;

/**
 * Your deku shield has burned. Pay 40
 * @author Aaron Axisa
 *
 */
public class DekuShieldCard extends CommunityChestCard implements PayBankAmountCard {

	@Override
	public int getPlayerPayingAmount() {
		return 50;
	}

	@Override
	protected String getIdentifier() {
		return "DekuShield";
	}

}
