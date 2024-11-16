package com.cjc.bms.model;

public class Account {
	private long Accno;
	private int age;
	private String name;
	private String mobno;
	private String Adharno;
	private String gender;
	private double balance;
	public long getAccno() {
		return Accno;
	}
	public void setAccno(long accno) {
		Accno = accno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getAdharno() {
		return Adharno;
	}
	public void setAdharno(String adharno) {
		Adharno = adharno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
