package roulette;

import util.ConsoleReader;

/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 * 
 * @author Robert C. Duvall
 */
public class Bet
{
	public String myDescription;
    private int myOdds;


    /**
     * Constructs a bet with the given name and odds.
     * 
     * @param description name of this kind of bet
     * @param odds odds given by the house for this kind of bet
     */
    public Bet (int odds)
    {
        myOdds = odds;
    }


    /**
     * @return odds given by the house for this kind of bet
     */
    public int getOdds ()
    {
        return myOdds;
    }
    
    public String prompt(){
    	return null;
    }
    


	public String promptBet() {
           return prompt();
	}
	
    /**
     * Checks if the given bet is won or lost given the user's choice and the result
     * of spinning the wheel.
     *
     * @param whichBet specific bet chosen by the user
     * @param betChoice specific value user chose to try to win the bet 
     */
    
	boolean isMade (String betChoice, Wheel myWheel)
    {
        return false;
    }
	
    /**
     * Place the given bet by prompting the user for the specific information
     * need to complete the given bet.
     *
     * @param whichBet specific bet chosen by the user
     */
    String placeBet()
    {
        return null;
    }


    /**
    * @return name of this kind of bet
    */
    public String getDescription ()
    {
        return myDescription;
    }
}
