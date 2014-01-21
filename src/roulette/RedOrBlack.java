package roulette;

import util.ConsoleReader;

public class RedOrBlack extends Bet {
	private int myOdds;
	
	public RedOrBlack(int odds){
		super(odds);
		myDescription = "Red or Black";
	}
    
	public String prompt() {
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}
	
    private boolean isMade (String betChoice, Wheel myWheel)
    {
        return myWheel.getColor().equals(betChoice);
    }
    
    private String placeBet()
    {
        System.out.println();
        return prompt();
    }
}
