package com.mycompany.myapp.product_comments;

public class Product_commentsVO {

	private String pc_no;
	private String p_no;
	private String c_name;
	private String c_contents;
	private String insertid;
	private String updateid;
	private String insertdate;
	private String updateday;
	private String yn;
	private String c_title;
	private String searchKeyword;
	private String searchCondition;
	
	private String uploadfile;
	
	public String getUploadfile() {
		return uploadfile;
	}
	public void setUploadfile(String uploadfile) {
		this.uploadfile = uploadfile;
	}
	
	public String getPc_no() {
		return pc_no;
	}
	public void setPc_no(String pc_no) {
		this.pc_no = pc_no;
	}
	public String getP_no() {
		return p_no;
	}
	public void setP_no(String p_no) {
		this.p_no = p_no;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_contents() {
		return c_contents;
	}
	public void setC_contents(String c_contents) {
		this.c_contents = c_contents;
	}
	public String getInsertid() {
		return insertid;
	}
	public void setInsertid(String insertid) {
		this.insertid = insertid;
	}
	public String getUpdateid() {
		return updateid;
	}
	public void setUpdateid(String updateid) {
		this.updateid = updateid;
	}
	public String getInsertdate() {
		return insertdate;
	}
	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}
	public String getUpdateday() {
		return updateday;
	}
	public void setUpdateday(String updateday) {
		this.updateday = updateday;
	}
	public String getYn() {
		return yn;
	}
	public void setYn(String yn) {
		this.yn = yn;
	}
	public String getC_title() {
		return c_title;
	}
	public void setC_title(String c_title) {
		this.c_title = c_title;
	}
	
	
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	public String getSearchCondition() {
		return searchCondition;
	}
	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
	
	
	@Override
	public String toString() {
		return "Product_commentsVO [pc_no=" + pc_no + ", p_no=" + p_no + ", c_name=" + c_name + ", c_contents="
				+ c_contents + ", insertid=" + insertid + ", updateid=" + updateid + ", insertdate=" + insertdate
				+ ", updateday=" + updateday + ", yn=" + yn + ", c_title=" + c_title + "]";
	}
	
	
}
