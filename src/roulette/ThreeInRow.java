package roulette;

import util.ConsoleReader;

public class ThreeInRow extends Bet {
	private int myOdds;
	
	public ThreeInRow(int odds){
		super(odds);
	}
    
	public String prompt() {
		 return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers", 1, 34);
	}
	
    private boolean isMade (String betChoice, Wheel myWheel)
    {
        int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
    }
    
    private String placeBet()
    {
        System.out.println();
        return prompt();
    }
	
}
