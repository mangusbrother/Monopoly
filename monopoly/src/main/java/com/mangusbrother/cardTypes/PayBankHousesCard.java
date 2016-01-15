package com.mangusbrother.cardTypes;

import com.mangusbrother.Card;

public interface PayBankHousesCard {

	String HOUSE_VALUE = "PayHousesAmount" + Card.SEPARATOR + "House";
	String HOTEL_VALUE = "PayHousesAmount" + Card.SEPARATOR + "Hotel";
	
	/**
	 * @return The amount a player must pay per house
	 */
	int getHouseAmount();
	
	/**
	 * @return The amount a player must pay per hotel
	 */
	int getHotelAmount();
}
