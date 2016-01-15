package com.mangusbrother.centralCards;

import com.mangusbrother.Game;
import com.mangusbrother.Player;
import com.mangusbrother.cardTypes.GetOutOfJailCard;
import com.mangusbrother.cardTypes.MoveSpecificPlaceCard;
import com.mangusbrother.cardTypes.MoveSpecificPlacePassGoBonusCard;
import com.mangusbrother.cardTypes.MoveSpecificPlaceRentModifier;
import com.mangusbrother.cardTypes.MoveStepsCard;
import com.mangusbrother.cardTypes.MoveToNearestPlace;
import com.mangusbrother.cardTypes.MoveToNearestPlaceDiceRoll;
import com.mangusbrother.cardTypes.MoveToNearestPlaceRentModifier;
import com.mangusbrother.cardTypes.PayBankAmountCard;
import com.mangusbrother.cardTypes.PayBankHousesCard;
import com.mangusbrother.cardTypes.PayPlayerAmountCard;

@Component
public class DescriptionCardHandler {

	@Autowired
	private Game game;
	
	public void processCentralCard(final DescriptionCard card, final Player currentPlayer) {
		if (card instanceof GetOutOfJailCard) {
			// increase counter of get out of jail for current player in game settings
			
		} 
		// movement related cards
		if (card instanceof MoveSpecificPlaceCard) {
			if (card instanceof MoveSpecificPlacePassGoBonusCard) {
				
			} else if (card instanceof MoveSpecificPlaceRentModifier) {
				
			} else {
				
			}
		} else if (card instanceof MoveStepsCard) {
			
		} else if (card instanceof MoveToNearestPlace) {
			if (card instanceof MoveToNearestPlaceDiceRoll) {
				
			} else if (card instanceof MoveToNearestPlaceRentModifier) {
				
			} else {
				
			}
		}
		
		// payment cards
		if (card instanceof PayBankAmountCard) {
			((PayBankAmountCard) card).getPlayerPayingAmount();
		}
		if (card instanceof PayBankHousesCard) {
			
		}
		if (card instanceof PayPlayerAmountCard) {
			
		}
	}
}
