package com.mangusbrother;

public abstract class Card {

	public static final String SEPARATOR = ".";
	public static final String CARD_NAME = "NAME";
	
	protected abstract String getIdentifier();
	
	public String getCardName() {
		return PropertyHelper.getInstance().resolveValue(getIdentifier() + SEPARATOR + CARD_NAME);
	}

//	1) Go to a specific place, if unowned you can buy, if owned pay 2x the rent normally paid
//	2) Go to a specific place / back 3 spaces and do not collect 200 if you pass go
//	6) Get out of jail free
//	Aaron
//	7) Advance to go and collect 200
//	8) Go to a fixed space if you pass go collect 200
}
