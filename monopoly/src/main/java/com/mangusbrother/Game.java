package com.mangusbrother;

import com.mangusbrother.centralCards.EmptyBottleCards.EmptyBottleCard;
import com.mangusbrother.centralCards.communityChestCards.CommunityChestCard;
import lombok.Data;

import java.util.List;

@Data
public class Game {
	private List<Player> players;
    private List<Step> board;
    private List<EmptyBottleCard> unusedEmptyBottleCards;
	private List<CommunityChestCard> unusedCommunityChestCards;
	private int bankAmount;

    public void rollDice(Player player) {
        // TODO: Random
        int dice = 1;

        try {
            int index = (player.getPosition() + dice) % board.size();
            player.setPosition(index);
            if (board.get(index).action(player, 1))
                System.out.println("User Can Buy The Property");
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
    }
}
