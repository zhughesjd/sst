package com.metsci.sst.input.value.copysignalvalue;

import com.metsci.sst.input.block.Parenthesis;

public class ParenthesisValue extends CopySignalValue{
	public Parenthesis parenthesis;
	public ParenthesisValue(Parenthesis parenthesis) {
		this.parenthesis = parenthesis;
	}
}
