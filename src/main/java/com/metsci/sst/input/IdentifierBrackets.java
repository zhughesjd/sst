package com.metsci.sst.input;


public class IdentifierBrackets<Type> extends Statement{
	public String identifier;
	public IdentifierBrackets(String identifier,Type t) {
		this.identifier = identifier;
	}
	public static enum Type{S,P,B;
		
	}
}
