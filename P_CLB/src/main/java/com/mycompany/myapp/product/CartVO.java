package com.mycompany.myapp.product;

public class CartVO {

	private String s_no;
	private int p_no;
	private String ea;
	private String price;
	private String id;
	private String insertdate;
	private String updatedate;
	private String state;
	private String p_name;
	private String total_amt;
	
	private String searchKeyword;
	private String searchCondidtion;
	
	
	
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
	
	public String getS_no() {
		return s_no;
	}
	public void setS_no(String s_no) {
		this.s_no = s_no;
	}
	public int getP_no() {
		return p_no;
	}
	public void setP_no(int p_no) {
		this.p_no = p_no;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getTotal_amt() {
		return total_amt;
	}
	public void setTotal_amt(String total_amt) {
		this.total_amt = total_amt;
	}
	@Override
	public String toString() {
		return "CartVO [s_no=" + s_no + ", p_no=" + p_no + ", ea=" + ea + ", price=" + price + ", id=" + id
				+ ", insertdate=" + insertdate + ", updatedate=" + updatedate + ", state=" + state + ", p_name="
				+ p_name + ", total_amt=" + total_amt + "]";
	}
	
	
}
