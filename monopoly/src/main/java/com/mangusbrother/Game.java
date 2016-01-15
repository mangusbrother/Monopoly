package com.mangusbrother;

import com.mangusbrother.centralCards.EmptyBottleCards.EmptyBottleCard;
import com.mangusbrother.centralCards.communityChestCards.CommunityChestCard;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class Game {

	private List<Player> players;
    private List<Step> board;
    private List<EmptyBottleCard> unusedEmptyBottleCards;
	private List<CommunityChestCard> unusedCommunityChestCards;
	private int bankAmount;
}
