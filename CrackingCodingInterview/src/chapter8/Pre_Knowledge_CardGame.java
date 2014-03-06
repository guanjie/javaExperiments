package chapter8;

public class Pre_Knowledge_CardGame {
	public static Pre_Knowledge_CardGame createCardGame(GameType type){
		if(type==GameType.Poker){
			return new PokerGame();
		} else if(type == GameType.BlackJack){
			return new BlackJackGame();
		}
		return null;
	}
	
}
