package com.metsci.sst.input.value.parenthesis;

import com.metsci.sst.input.block.Brackets;


public class IdentifierBracketsValue extends IdentifierValue{
	public boolean hasColon;
	public Brackets brackets;
	public IdentifierBracketsValue(String value,boolean hasColon,Brackets brackets){
		super(value);
		this.hasColon = hasColon;
		this.brackets = brackets;
	}
}
