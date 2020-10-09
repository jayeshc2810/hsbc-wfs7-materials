package com.hsbc;

public class Pan implements Identifier {

	public Pan() {
		System.out.println("Pan() created");
	}
	@Override
	public void display() {
		System.out.println("display() from Pan");
	}

}
