package com.metsci.sst.input;

import com.metsci.sst.input.block.Brackets;

public class PrintEigenrays extends Statement{
	public boolean isGSM;
	public Brackets brackets;
	public PrintEigenrays(boolean isGSM,Brackets brackets) {
		this.isGSM = isGSM;
		this.brackets = brackets;
	}

}
