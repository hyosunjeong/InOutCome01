package com.biz.inout.vo;

public class IoComeVO {
	
	private String stDate;
	private String stInout;
	private String stPum;
	private int intSu;
	private int intDan;
	private int intTotal;
	
	
	public String getStDate() {
		return stDate;
	}
	public void setStDate(String stDate) {
		this.stDate = stDate;
	}
	public String getStInout() {
		return stInout;
	}
	public void setStInout(String stInout) {
		this.stInout = stInout;
	}
	public String getStPum() {
		return stPum;
	}
	public void setStPum(String stPum) {
		this.stPum = stPum;
	}
	public int getIntSu() {
		return intSu;
	}
	public void setIntSu(int intSu) {
		this.intSu = intSu;
	}
	public int getIntDan() {
		return intDan;
	}
	public void setIntDan(int intDan) {
		this.intDan = intDan;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}
	@Override
	public String toString() {
		return "InComeVO [stDate=" + stDate + ", stInout=" + stInout + ", stPum=" + stPum + ", intSu=" + intSu
				+ ", intDan=" + intDan + ", intTotal=" + intTotal + ", getStDate()=" + getStDate() + ", getStInout()="
				+ getStInout() + ", getStPum()=" + getStPum() + ", getIntSu()=" + getIntSu() + ", getIntDan()="
				+ getIntDan() + ", getIntTotal()=" + getIntTotal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
