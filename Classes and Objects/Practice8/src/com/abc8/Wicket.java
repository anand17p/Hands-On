package com.abc8;

public class Wicket {
	private long over;
	private long ball;
	private String wicketType;
	private String playerName;
	private String bowlerName;
	public Wicket()
	{
		
	}
	public Wicket(long over, long ball, String wicketType, String playerName, String bowlerName) {
		super();
		this.over = over;
		this.ball = ball;
		this.wicketType = wicketType;
		this.playerName = playerName;
		this.bowlerName = bowlerName;
	}
	public void setOver(long over) {
		this.over = over;
	}
	public void setBall(long ball) {
		this.ball = ball;
	}
	public void setWicketType(String wicketType) {
		this.wicketType = wicketType;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}
	public long getOver() {
		return over;
	}
	public long getBall() {
		return ball;
	}
	public String getWicketType() {
		return wicketType;
	}
	public String getPlayerName() {
		return playerName;
	}
	public String getBowlerName() {
		return bowlerName;
	}
	
	

}
