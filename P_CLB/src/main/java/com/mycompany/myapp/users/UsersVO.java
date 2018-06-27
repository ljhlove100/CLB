package com.mycompany.myapp.users;

public class UsersVO {

	private String uId;
	private String pw;
	private String name;
	private String email;
	private String tel;
	private String phone;
	private String addr;
	private String zipcode;
	private String businessCode;
	private String power;
	private String inserdate;
	private String updateday;
	private String yn;
	
	
	
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getInserdate() {
		return inserdate;
	}
	public void setInserdate(String inserdate) {
		this.inserdate = inserdate;
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
	@Override
	public String toString() {
		return "UsersVO [uId=" + uId + ", pw=" + pw + ", name=" + name + ", email=" + email + ", tel=" + tel
				+ ", phone=" + phone + ", addr=" + addr + ", zipcode=" + zipcode + ", businessCode=" + businessCode
				+ ", power=" + power + ", inserdate=" + inserdate + ", updateday=" + updateday + ", yn=" + yn + "]";
	}
	
		
}













