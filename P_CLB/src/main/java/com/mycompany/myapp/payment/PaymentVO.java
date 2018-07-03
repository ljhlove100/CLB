package com.mycompany.myapp.payment;

public class PaymentVO {

	private int paymentId;
	private String pName;
	private String totalAmt;
	private int pNo;
	private String pCount;
	private String pSum;
	
	
	public String getpCount() {
		return pCount;
	}
	public void setpCount(String pCount) {
		this.pCount = pCount;
	}
	public String getpSum() {
		return pSum;
	}
	public void setpSum(String pSum) {
		this.pSum = pSum;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}
	public int getpNo() {
		return pNo;
	}
	public void setpNo(int pNo) {
		this.pNo = pNo;
	}
	
	
}
