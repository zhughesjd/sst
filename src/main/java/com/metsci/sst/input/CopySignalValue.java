package com.metsci.sst.input;

import com.metsci.sst.input.value.comparesignals.CompareSignalsValue;

public class CopySignalValue extends Statement{
	public CompareSignalsValue compareSignalsValue;

	public CopySignalValue(CompareSignalsValue compareSignalsValue) {
		this.compareSignalsValue = compareSignalsValue;
	}
}
