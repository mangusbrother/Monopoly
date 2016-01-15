package com.mangusbrother.centralCards.communityChestCards.impl;

import com.mangusbrother.cardTypes.GetOutOfJailCard;
import com.mangusbrother.centralCards.communityChestCards.CommunityChestCard;

/**
 * Hey, Listen! Navi gives you some great advice. Get out of jail free. this card may be kept until needed or traded.
 * @author Aaron Axisa
 *
 */
public class HeyListenCard extends CommunityChestCard  implements GetOutOfJailCard {

	@Override
	protected String getIdentifier() {
		return "HeyListen";
	}

}
