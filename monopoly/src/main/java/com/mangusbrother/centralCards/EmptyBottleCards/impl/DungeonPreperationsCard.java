package com.mangusbrother.centralCards.EmptyBottleCards.impl;

import com.mangusbrother.cardTypes.MoveToNearestPlaceDiceRoll;
import com.mangusbrother.centralCards.EmptyBottleCards.EmptyBottleCard;

/**
 * Dungeon Preperation. Advance to bomb shop or potion shop, whichever is nearest.
 * If unowned, you may buy it from the bank.
 * If owned, throw dice and pay owner a total ten times amount thrown.
 * @author Aaron Axisa
 *
 */
public class DungeonPreperationsCard extends EmptyBottleCard implements MoveToNearestPlaceDiceRoll {

	@Override
	public int[] getLocationList() {
		return new int[]{10, 2};
	}

	@Override
	public int getDiceMultiplier() {
		return 10;
	}

	@Override
	protected String getIdentifier() {
		return "DungeonPerperations";
	}

}
