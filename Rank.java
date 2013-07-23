public enum Rank { 
	ACE   ("A")
  , DEUCE ("2")
  , THREE ("3")
  , FOUR  ("4")
  , FIVE  ("5")
  , SIX   ("6")
  , SEVEN ("7")
  , EIGHT ("8")
  , NINE  ("9")
  , TEN   ("10")
  , JACK  ("J")
  , QUEEN ("Q")
  , KING  ("K")
  ;
	private final String shortName;
	
	Rank(String shortName){this.shortName = shortName;};

	public String getShortName() {return shortName;}
	
	@Override public String toString() { 
		String s = super.toString();
		return s.substring(0,1) + s.substring(1).toLowerCase();
	}
}
