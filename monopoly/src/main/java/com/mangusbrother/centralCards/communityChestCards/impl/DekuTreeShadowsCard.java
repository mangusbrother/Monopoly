package com.mangusbrother.centralCards.communityChestCards.impl;

import com.mangusbrother.cardTypes.PayBankHousesCard;
import com.mangusbrother.centralCards.communityChestCards.CommunityChestCard;

/**
 * Shadows in the deku tree. Pay 40 for each deku sprout and 115 for each deku tree
 * @author Aaron Axisa
 *
 */
public class DekuTreeShadowsCard extends CommunityChestCard implements PayBankHousesCard {

	@Override
	public int getHouseAmount() {
		return 40;
	}

	@Override
	public int getHotelAmount() {
		return 115;
	}

	@Override
	protected String getIdentifier() {
		return "DekuTreeShadows";
	}

}
