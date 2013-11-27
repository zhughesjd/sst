package com.metsci.sst.input;

import java.util.AbstractMap;
import java.util.ArrayList;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import com.metsci.sst.input.block.Brackets;
import com.metsci.sst.input.block.Parenthesis;
import com.metsci.sst.input.value.assignment.AssignmentValue;
import com.metsci.sst.input.value.assignment.BoolValue;
import com.metsci.sst.input.value.assignment.BracketsValue;
import com.metsci.sst.input.value.assignment.DollarValue;
import com.metsci.sst.input.value.assignment.DoubleValue;
import com.metsci.sst.input.value.assignment.FloatValue;
import com.metsci.sst.input.value.assignment.IdentifierBracketsValue;
import com.metsci.sst.input.value.assignment.IdentifierParenthesisValue;
import com.metsci.sst.input.value.assignment.IdentifierValue;
import com.metsci.sst.input.value.assignment.StringValue;
import com.metsci.sst.input.value.parenthesis.NumberValue;
import com.metsci.sst.input.value.parenthesis.ParenthesisParenthesisValue;
import com.metsci.sst.parser.SSTBaseListener;
import com.metsci.sst.parser.SSTParser;
import com.metsci.sst.parser.SSTParser.AssignmentContext;
import com.metsci.sst.parser.SSTParser.AssignmentstatementContext;
import com.metsci.sst.parser.SSTParser.BracketsContext;
import com.metsci.sst.parser.SSTParser.ClearsignalContext;
import com.metsci.sst.parser.SSTParser.ParenthesisContext;
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
			list.add(toAssignment((AssignmentContext)tree.getChild(0)));
		}
	}
	public static Brackets toBrackets(BracketsContext bc) {
		Brackets brackets = new Brackets();
		for(int index=1;index<bc.getChildCount()-1;index++)
			brackets.list.add(toAssignment((AssignmentContext)bc.getChild(index)));
		return brackets ;
	}
	public static Assignment toAssignment(AssignmentContext ac) {
		int ascIndex=0;
		ParseTree identifierTree = ac.getChild(ascIndex++);
		boolean isNew = false;
		if(identifierTree.toString().equals("new")){
			isNew = true;
			identifierTree = ac.getChild(ascIndex++);
		}
		ParseTree avTree = ac.getChild(++ascIndex);
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
			Brackets brackets = toBrackets((BracketsContext) lastChild);
			if(avTree.getChildCount() == 1)
				av = new BracketsValue(brackets);
			else
				av = new IdentifierBracketsValue(avTree.getChildCount() == 3,new AbstractMap.SimpleEntry<String, Brackets>(avTree.getChild(0).toString(),brackets));
		}
		if(lastChild instanceof ParenthesisContext){
			Parenthesis parenthesis = toParenthesis((ParenthesisContext) lastChild);
			if(avTree.getChildCount() == 1)
				av = new com.metsci.sst.input.value.assignment.ParenthesisValue(parenthesis);
			else
				av = new IdentifierParenthesisValue(avTree.getChildCount() == 3,new AbstractMap.SimpleEntry<String,Parenthesis>(avTree.getChild(0).toString(),parenthesis));
		}
		if(lastChild.toString().startsWith("\"")){
			av = new StringValue(lastChild.toString());
		}
		return new Assignment(isNew,identifierTree.toString(),av);
	}
	public static Parenthesis toParenthesis(ParenthesisContext pc){
		Parenthesis parenthesis = new Parenthesis();
		System.out.println("***\t"+pc.getText());
		for(int index=1;index<pc.getChildCount()-1;index++){

			ParseTree child = pc.getChild(index);
			System.out.println(child.getText());
			com.metsci.sst.input.value.parenthesis.ParenthesisValue<?> pv = child.toString().startsWith("\"")?new com.metsci.sst.input.value.parenthesis.StringValue(child.toString()):new com.metsci.sst.input.value.parenthesis.IdentifierValue(child.toString());
			if(child instanceof ParenthesisContext)
				pv = new ParenthesisParenthesisValue(toParenthesis((ParenthesisContext)child));
			if(child instanceof BracketsContext)
				pv = new com.metsci.sst.input.value.parenthesis.BracketsValue(toBrackets((BracketsContext) child));
			Number number = toNumber(child.toString());
			if(number!=null)
				pv = new NumberValue(number);
			parenthesis.list.add(pv);
		}
		return parenthesis;
	}
	private static Number toNumber(String string) {
		try{
			return Double.parseDouble(string);
		}catch(Exception e){}
		return null;
	}
}
