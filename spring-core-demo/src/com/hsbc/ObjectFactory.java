package com.hsbc;

public class ObjectFactory {
	
	public static Identifier getIdentifierInstance() {
		Pan p = new Pan();
		return p;
	}
	
}
