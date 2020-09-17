package com.hsbc.banking.models;
.
import java.util.Random;

public class Member {
	private int memberNo;
	private String name;
	private long phoneNo;
	private String password;
	public Member(int memberNo, String name) {
		this(name);
		this.memberNo = memberNo;
	}
	
	public Member( String name) {
	
		this.memberNo = new Random().nextInt(1000);
		this.name = name;
		this.password = new Random();
	}
	
	
}
