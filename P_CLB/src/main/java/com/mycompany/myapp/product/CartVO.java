package com.mycompany.myapp.product;

public class CartVO {

	private String cartId;
	private int pNo;
	private String ea;
	private String price;
	private String uId;
	private String insertdate;
	private String updatedate;
	private String state;
	private String pName;
	private String totalAmt;
	private int amount;
	private String image;
	
	private String searchKeyword;
	private String searchCondidtion;
	
	
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	public String getSearchCondidtion() {
		return searchCondidtion;
	}
	public void setSearchCondidtion(String searchCondidtion) {
		this.searchCondidtion = searchCondidtion;
	}
	
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public String getEa() {
		return ea;
	}
	public void setEa(String ea) {
		this.ea = ea;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getInsertdate() {
		return insertdate;
	}
	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}
	public String getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getpNo() {
		return pNo;
	}
	public void setpNo(int pNo) {
		this.pNo = pNo;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "CartVO [cartId=" + cartId + ", pNo=" + pNo + ", ea=" + ea + ", price=" + price + ", uId=" + uId
				+ ", insertdate=" + insertdate + ", updatedate=" + updatedate + ", state=" + state + ", pName=" + pName
				+ ", totalAmt=" + totalAmt + ", amount=" + amount + ", image=" + image + ", searchKeyword="
				+ searchKeyword + ", searchCondidtion=" + searchCondidtion + "]";
	}
	
	
}
