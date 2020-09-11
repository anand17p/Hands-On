package com.abc7;
public class Delivery {
	private long over;
	private long ball;
	private long runs;
	private String batsman;
	private String bowler;
	private String nonstriker;
	public Delivery() {
		
	}
	public Delivery(long over, long ball, long runs, String batsman, String bowler, String nonstriker) {
		super();
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonstriker = nonstriker;
	}
	public void setOver(long over) {
		this.over = over;
	}
	public void setBall(long ball) {
		this.ball = ball;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public void setNonstriker(String nonstriker) {
		this.nonstriker = nonstriker;
	}
	public long getOver() {
		return over;
	}
	public long getBall() {
		return ball;
	}
	public long getRuns() {
		return runs;
	}
	public String getBatsman() {
		return batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public String getNonstriker() {
		return nonstriker;
	}

}
