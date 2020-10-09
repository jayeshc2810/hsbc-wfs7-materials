package com.hsbc;

public class OldApproach {

	public static void main(String[] args) {
		//Identifier identifier = new Pan();
		Identifier identifier = ObjectFactory.getIdentifierInstance();
		identifier = ObjectFactory.getIdentifierInstance();
		identifier.display();
	}

}
