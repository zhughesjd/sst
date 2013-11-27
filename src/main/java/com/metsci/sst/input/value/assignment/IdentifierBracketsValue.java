package com.metsci.sst.input.value.assignment;

import java.util.Map.Entry;

import com.metsci.sst.input.block.Brackets;

public class IdentifierBracketsValue extends ColonValue<Entry<String,Brackets>>{
	public IdentifierBracketsValue(boolean hasColon,Entry<String,Brackets> entry) {
		super(hasColon,entry);
	}
	
}
