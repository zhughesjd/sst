package com.metsci.sst.input;

import com.metsci.sst.input.value.assignment.AssignmentValue;

public class Assignment extends Statement{
	public boolean isNew;
	public String identifier;
	public AssignmentValue<?> assignmentValue;
	public Assignment(boolean isNew, String identifier,	AssignmentValue<?> assignmentValue) {
		this.isNew = isNew;
		this.identifier = identifier;
		this.assignmentValue = assignmentValue;
	}
}
