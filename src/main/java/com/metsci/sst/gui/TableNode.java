package com.metsci.sst.gui;

import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import com.metsci.sst.parser.SSTParser.PrintContext;
import com.metsci.sst.parser.SSTParser.ReadContext;

public interface TableNode<PRC extends ParserRuleContext> {
	public static final List<TableNode<? extends ParserRuleContext>> list = Arrays.asList(new Read(),new Print());
	public abstract Class<PRC> getType();
    public abstract Object getChild( PRC node, int index );
    public abstract int getChildCount( PRC parent );
    public abstract boolean isLeaf( PRC node );
    public static class Read implements TableNode<ReadContext>{

		@Override
		public Class<ReadContext> getType() {
			return ReadContext.class;
		}

		@Override
		public Object getChild(ReadContext parent, int index) {
			if(index == 0)
				return parent.getChild(1);
			return null;
		}

		@Override
		public int getChildCount(ReadContext parent) {
			return 1;
		}

		@Override
		public boolean isLeaf(ReadContext node) {
			return false;
		}
	}
    public static class Print implements TableNode<PrintContext>{

		@Override
		public Class<PrintContext> getType() {
			return PrintContext.class;
		}

		@Override
		public Object getChild(PrintContext parent, int index) {
			if(index == 0)
				return parent.getChild(1);
			return null;
		}

		@Override
		public int getChildCount(PrintContext parent) {
			return 1;
		}

		@Override
		public boolean isLeaf(PrintContext node) {
			return false;
		}
	}
}
