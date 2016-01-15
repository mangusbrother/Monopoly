package com.mangusbrother.cardTypes;

/**
 * Specifically done for one card
 * 
 * Move to the nearest of the given locations.
 * If unowned you may buy
 * if owned. Throw dice, pay owner for 10x amount thrown
 * @author Aaron Axisa
 *
 */
public interface MoveToNearestPlace {

	/**
	 * @return The list of locations that can be moved to
	 */
	int[] getLocationList();
	
}
