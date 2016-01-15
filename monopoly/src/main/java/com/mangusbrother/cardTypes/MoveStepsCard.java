package com.mangusbrother.cardTypes;

/**
 * Move x steps. do not collect 200 if you pass go
 * 
 * @author Aaron Axisa
 *
 */
public interface MoveStepsCard {

	/**
	 * @return The amount of steps to take forward / backwards if negative
	 */
	int getStepsToMove();
}
