package com.mangusbrother;

public abstract class Card {
	
	protected static final String SEPERATOR = ".";
	protected static final String CARD_NAME = "NAME";
	
	protected abstract String getIdentifier();
	
	public String getCardName() {
		return PropertyHelper.getInstance().resolveValue(getIdentifier()+SEPERATOR+CARD_NAME);
	}
	
}
