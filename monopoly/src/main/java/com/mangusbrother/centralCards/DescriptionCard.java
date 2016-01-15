package com.mangusbrother.centralCards;

import com.mangusbrother.Card;
import com.mangusbrother.PropertyHelper;

public abstract class DescriptionCard extends Card {

	private static final String CARD_DESCRIPTION = "DESCRIPTION";
	
	public String getCardDescription() {
		return PropertyHelper.getInstance().resolveValue(getIdentifier() + " " + CARD_DESCRIPTION);
	}
	
}
