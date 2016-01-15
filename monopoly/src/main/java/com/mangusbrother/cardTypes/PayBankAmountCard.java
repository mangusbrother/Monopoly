package com.mangusbrother.cardTypes;

public interface PayBankAmountCard {

	String VALUE = "PayBankAmount";
	
	/**
	 * @return The amount of money the player needs to pay the bank. Can be negative if player is paid  
	 */
	int getPlayerPayingAmount();
}
