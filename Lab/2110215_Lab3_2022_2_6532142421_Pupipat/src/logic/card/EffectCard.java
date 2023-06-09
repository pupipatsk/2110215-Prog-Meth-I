package logic.card;

import logic.game.CardColor;
import logic.game.CardSymbol;
import logic.game.GameLogic;

//You CAN modify the first line
public abstract class EffectCard extends BaseCard{
    // TODO Implement here

	//Methods
	public EffectCard(CardColor color, CardSymbol symbol) {
		super(color, symbol);
	}
		//abstract methods
	public abstract String performEffect();
	
	public String play() {
		GameLogic.getInstance().setTopCard(this);
		GameLogic.getInstance().getCurrentPlayerHand().remove(this);
		return this.performEffect();
	}
}