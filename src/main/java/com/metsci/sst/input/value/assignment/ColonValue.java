package com.metsci.sst.input.value.assignment;

public class ColonValue<N> extends AssignmentValue<N>{
	public boolean hasColon;
	public ColonValue(boolean hasColon,N value) {
		super(value);
	}
	
}
