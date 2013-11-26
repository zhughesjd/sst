package com.metsci.sst.input;

import java.util.ArrayList;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import com.metsci.sst.input.block.Brackets;
import com.metsci.sst.input.value.assignment.AssignmentValue;
import com.metsci.sst.input.value.assignment.BoolValue;
import com.metsci.sst.input.value.assignment.DollarValue;
import com.metsci.sst.input.value.assignment.DoubleValue;
import com.metsci.sst.input.value.assignment.FloatValue;
import com.metsci.sst.input.value.assignment.IdentifierValue;
import com.metsci.sst.input.value.assignment.StringValue;
import com.metsci.sst.parser.SSTBaseListener;
import com.metsci.sst.parser.SSTParser;
import com.metsci.sst.parser.SSTParser.AssignmentContext;
import com.metsci.sst.parser.SSTParser.AssignmentstatementContext;
import com.metsci.sst.parser.SSTParser.BracketsContext;
import com.metsci.sst.parser.SSTParser.ClearsignalContext;
import com.metsci.sst.parser.SSTParser.PrintContext;
import com.metsci.sst.parser.SSTParser.QuitContext;
import com.metsci.sst.parser.SSTParser.ReadContext;

public class SSTConversionListener extends SSTBaseListener{
	public ArrayList<Statement> list = new ArrayList<>();
	public void enterStatement(@NotNull SSTParser.StatementContext ctx){
		ParseTree tree = ctx.getChild(0);
		if(tree instanceof ReadContext){
			ReadContext context = (ReadContext) tree;
			list.add(new Read(context.getChild(1).toString()));
		}
		if(tree instanceof PrintContext){
			PrintContext context = (PrintContext) tree;
			list.add(new Print(context.getChild(1).toString()));
		}
		if(tree instanceof ClearsignalContext){
			ClearsignalContext context = (ClearsignalContext) tree;
			list.add(new ClearSignal(context.getChild(1).toString()));
		}
		if(tree instanceof QuitContext){
			list.add(new Quit());
		}
		if(tree instanceof AssignmentstatementContext){
			int ascIndex=0;
			AssignmentContext asc = (AssignmentContext)tree.getChild(0);
			ParseTree identifierTree = asc.getChild(ascIndex++);
			boolean isNew = false;
			if(identifierTree.toString().equals("new")){
				isNew = true;
				identifierTree = asc.getChild(ascIndex++);
			}
			ParseTree avTree = asc.getChild(++ascIndex);
			ParseTree lastChild = avTree.getChild(avTree.getChildCount()-1);
			AssignmentValue<?> av = new IdentifierValue(lastChild.toString());
			if(lastChild.toString().equals("}")){
				av = new DollarValue(avTree.getChild(1).toString());
			}
			if(lastChild.toString().toLowerCase().equals("true") || lastChild.toString().toLowerCase().equals("false")){
				av = new BoolValue(avTree.getChildCount()>=3,Boolean.valueOf(lastChild.toString()));
			}
			Number number = toNumber(lastChild.toString());
			if(number !=null){
				av = new DoubleValue(false,number.doubleValue());
				if(avTree.getChildCount() == 3)
					av = avTree.getChild(0).toString().equals("float")?new FloatValue(true,number.floatValue()):new DoubleValue(true,number.doubleValue());
			}
			if(lastChild instanceof BracketsContext){
			}
			if(lastChild.toString().startsWith("\"")){
				av = new StringValue(lastChild.toString());
			}
			list.add(new Assignment(isNew,identifierTree.toString(),av));
		}
	}
	public static Brackets toBrackets() {
		return null;
	}
	private Number toNumber(String string) {
		try{
			return Double.parseDouble(string);
		}catch(Exception e){}
		return null;
	}
}
