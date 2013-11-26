package com.metsci.sst.input;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.metsci.sst.parser.SSTLexer;
import com.metsci.sst.parser.SSTParser;

public class Utility {
	public static void main(String[] args) throws Exception{
		for(File file : new File("sst").listFiles()){
			ArrayList<File> allFiles = new ArrayList<File>();
			if(file.isDirectory())
				allFiles.addAll(Arrays.asList(file.listFiles()));
			else
				allFiles.add(file);
			for(File f : allFiles){
				ArrayList<Statement> statementList = fileToStatements(f.getAbsolutePath());
				System.out.println("size:\t"+statementList.size());
			}

		}
	}
    public static ArrayList<Statement> fileToStatements(String sstFilepath) throws Exception{
        ANTLRInputStream input=new ANTLRInputStream(new FileInputStream(sstFilepath));
        SSTLexer lexer=new SSTLexer(input);
        CommonTokenStream tokens=new CommonTokenStream(lexer);
        SSTParser parser=new SSTParser(tokens);
        SSTConversionListener listener = new SSTConversionListener();
        ParseTreeWalker.DEFAULT.walk( listener, parser.sstinput( ));
        return listener.list;
    }

}
