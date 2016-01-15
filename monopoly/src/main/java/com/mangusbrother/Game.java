package com.mangusbrother;

import java.util.List;

import com.mangusbrother.centralCards.EmptyBottleCards.EmptyBottleCard;
import com.mangusbrother.centralCards.communityChestCards.CommunityChestCard;

@Component
public class Game {

	private List<Player> players;
	private List<Property> unusedProperty;
	private List<EmptyBottleCard> unusedEmptyBottleCards;
	private List<CommunityChestCard> unusedCommunityChestCards;
	private int bankAmount;
	
	public List<Player> getPlayers() {
		return players;
	}
	public List<Property> getUnusedProperty() {
		return unusedProperty;
	}
	public List<EmptyBottleCard> getUnusedEmptyBottleCards() {
		return unusedEmptyBottleCards;
	}
	public List<CommunityChestCard> getUnusedCommunityChestCards() {
		return unusedCommunityChestCards;
	}
	public int getBankAmount() {
		return bankAmount;
	}
	
	
}
