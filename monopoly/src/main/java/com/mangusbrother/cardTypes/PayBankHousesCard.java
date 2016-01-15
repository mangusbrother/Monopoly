package com.mangusbrother.cardTypes;

import com.mangusbrother.Card;

public interface PayBankHousesCard {

	public static final String HOUSE_VALUE = "PayHousesAmount"+Card.SEPERATOR+"House";
	public static final String HOTEL_VALUE = "PayHousesAmount"+Card.SEPERATOR+"Hotel";
	
	/**
	 * @return The amount a player must pay per house
	 */
	int getHouseAmount();
	
	/**
	 * @return The amount a player must pay per hotel
	 */
	int getHotelAmount();
}
