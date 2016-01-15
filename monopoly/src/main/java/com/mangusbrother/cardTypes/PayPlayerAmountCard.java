package com.mangusbrother.cardTypes;

public interface PayPlayerAmountCard {

	public static final String VALUE = "PayPlayerAmount";
	
	/**
	 * @return The amount that the player must pay each player. Can be negative if he is to be paid instead
	 */
	int getPlayerAmountValue();
}
