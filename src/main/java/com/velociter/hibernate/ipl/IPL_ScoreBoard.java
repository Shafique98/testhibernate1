package com.velociter.hibernate.ipl;

public class IPL_ScoreBoard {
	private String playerFirstName;
	private String playerLastName;
	private long playerID;
	private int IPLRuns;
	private float AVGRuns;
	private float strikeRate;
	private int century;
	private int halfCentury;
	private int numOfSix;
	private int numOfFour;

	public IPL_ScoreBoard() {}

	public IPL_ScoreBoard(String playerFirstName, String playerLastName, long playerID, int iPLRuns, float aVGRuns,
			float strikeRate, int century, int halfCentury, int numOfSix, int numOfFour) {
		super();
		this.playerFirstName = playerFirstName;
		this.playerLastName = playerLastName;
		this.playerID = playerID;
		IPLRuns = iPLRuns;
		AVGRuns = aVGRuns;
		this.strikeRate = strikeRate;
		this.century = century;
		this.halfCentury = halfCentury;
		this.numOfSix = numOfSix;
		this.numOfFour = numOfFour;
	}

	public String getPlayerFirstName() {
		return playerFirstName;
	}

	public void setPlayerFirstName(String playerFirstName) {
		this.playerFirstName = playerFirstName;
	}

	public String getPlayerLastName() {
		return playerLastName;
	}

	public void setPlayerLastName(String playerLastName) {
		this.playerLastName = playerLastName;
	}

	public long getPlayerID() {
		return playerID;
	}

	public void setPlayerID(long playerID) {
		this.playerID = playerID;
	}

	public int getIPLRuns() {
		return IPLRuns;
	}

	public void setIPLRuns(int iPLRuns) {
		IPLRuns = iPLRuns;
	}

	public float getAVGRuns() {
		return AVGRuns;
	}

	public void setAVGRuns(float aVGRuns) {
		AVGRuns = aVGRuns;
	}

	public float getStrikeRate() {
		return strikeRate;
	}

	public void setStrikeRate(float strikeRate) {
		this.strikeRate = strikeRate;
	}

	public int getCentury() {
		return century;
	}

	public void setCentury(int century) {
		this.century = century;
	}

	public int getHalfCentury() {
		return halfCentury;
	}

	public void setHalfCentury(int halfCentury) {
		this.halfCentury = halfCentury;
	}

	public int getNumOfSix() {
		return numOfSix;
	}

	public void setNumOfSix(int numOfSix) {
		this.numOfSix = numOfSix;
	}

	public int getNumOfFour() {
		return numOfFour;
	}

	public void setNumOfFour(int numOfFour) {
		this.numOfFour = numOfFour;
	}


	
}
