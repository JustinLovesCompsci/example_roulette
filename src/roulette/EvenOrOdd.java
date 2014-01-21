package roulette;

import util.ConsoleReader;

public class EvenOrOdd extends Bet {
	private int myOdds;
	
	public EvenOrOdd(int odds){
		super(odds);
	}
	
	public String prompt() {
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}
	
    private boolean isMade (String betChoice, Wheel myWheel)
    {

    return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
           (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
    }
    
    private String placeBet()
    {
        System.out.println();
        return prompt();
    }
	
}
