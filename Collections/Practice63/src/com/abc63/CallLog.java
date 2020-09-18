package com.abc63;

public class CallLog {
	String dialledNumber;
	String duration;
	String dialledDate;

	public CallLog(String dialledNumber, String duration, String dialledDate) {
		super();
		this.dialledNumber = dialledNumber;
		this.duration = duration;
		this.dialledDate = dialledDate;
	}

	public void setDialledNumber(String dialledNumber) {
		this.dialledNumber = dialledNumber;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public void setDialledDate(String dialledDate) {
		this.dialledDate = dialledDate;
	}

	public String getDialledNumber() {
		return dialledNumber;
	}

	public String getDuration() {
		return duration;
	}

	public String getDialledDate() {
		return dialledDate;
	}

	public int compareTo(CallLog e) {
		return this.dialledNumber.compareTo(e.dialledNumber);
	}

	@Override
	public String toString() {
		return dialledNumber + duration + dialledDate;
	}

}
