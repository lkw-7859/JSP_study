package com.saeyan.javabeans;

public class MemberBean {
	private String name;
	private String userid;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public MemberBean(String name,String userid) {
		this.name = name;
		this.userid = userid;
	}
	
	public MemberBean() {
	}
	
	public String toString() {
		return "MemberBean [name=" + name+", userid="+userid+"]";
	}
}
