package com.mangusbrother.centralCards;

import com.mangusbrother.Card;
import com.mangusbrother.PropertyHelper;

public abstract class DescriptionCard extends Card {

	public static final String CARD_DESCRIPTION = "DESCRIPTION";
	
	public String getCardDescription() {
		return PropertyHelper.getInstance().resolveValue(getIdentifier()+SEPERATOR+CARD_DESCRIPTION);
	}
	
}
