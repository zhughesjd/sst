package com.metsci.sst.parser;

import javax.swing.tree.DefaultMutableTreeNode;

import com.metsci.sst.parser.SSTParser.IdentifierbracketsContext;

public class SSTreeNodeListener extends SSTBaseListener {
	DefaultMutableTreeNode root = new DefaultMutableTreeNode();
	public void enterIdentifierbrackets(IdentifierbracketsContext context){
		System.out.println("here");
	}
}
