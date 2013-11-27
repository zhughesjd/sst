package com.metsci.sst.input.value.assignment;

import java.util.Map.Entry;

import com.metsci.sst.input.block.Parenthesis;

public class IdentifierParenthesisValue extends ColonValue<Entry<String,Parenthesis>>{
	public IdentifierParenthesisValue(boolean hasColon,Entry<String,Parenthesis> entry) {
		super(hasColon,entry);
	}
	
}
