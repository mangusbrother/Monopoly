package com.mangusbrother.centralCards.communityChestCards.impl;

import com.mangusbrother.cardTypes.PayBankAmountCard;
import com.mangusbrother.centralCards.communityChestCards.CommunityChestCard;

/**
 * You have your very own golden game pak. Collect 100
 * @author Aaron Axisa
 *
 */
public class GamePakCard extends CommunityChestCard implements PayBankAmountCard {

	@Override
	public int getPlayerPayingAmount() {
		return -100;
	}

	@Override
	protected String getIdentifier() {
		return "GamePak";
	}

}
