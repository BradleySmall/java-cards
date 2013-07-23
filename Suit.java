public enum Suit { CLUBS, HEARTS, SPADES, DIAMONDS;

	public String getShortName() {return this.toString().substring(0,1); }
	@Override public String toString() { 
		String s = super.toString();
		return s.substring(0,1) + s.substring(1).toLowerCase();
	}
}
	
