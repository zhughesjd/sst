package com.metsci.sst.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class SSTUtility
{

    public static void main( String[] args ) throws Exception{
    	test();
    }
    public static void test2() throws Exception{
        ANTLRInputStream input=new ANTLRInputStream(new FileInputStream("sst/aplBottoms.sst"));
        SSTLexer lexer=new SSTLexer(input);
        CommonTokenStream tokens=new CommonTokenStream(lexer);
        SSTParser parser=new SSTParser(tokens);
        ParseTreeListener listener = new SSTBaseListener(){
            public void enterAssignment(@NotNull SSTParser.AssignmentContext ctx) { 
                                    System.out.println(ctx.getChild( 1 )+"\t"+ctx.getText( ));
            }
        };
//        parser.sstinput().removeLastChild();
        ParseTreeWalker.DEFAULT.walk( listener, parser.sstinput( ));
        System.out.println("################################################");
        parser.reset();
        ParseTreeWalker.DEFAULT.walk( listener, parser.sstinput( ));
    }
    public static void test() throws Exception
    {
        for(File file : new File("sst").listFiles( ))
            if(file.isDirectory( )){
                for(File sstFile : file.listFiles( )){
                	test(sstFile);
                }
            }
            else
            	test(file);
    }
    public static void test(File file) throws FileNotFoundException, IOException{
        System.err.println("\t\t"+file.getName( ));
        ANTLRInputStream input=new ANTLRInputStream(new FileInputStream(file));
        SSTLexer lexer=new SSTLexer(input);
        CommonTokenStream tokens=new CommonTokenStream(lexer);
        SSTParser parser=new SSTParser(tokens);
        ParseTreeListener listener = new SSTBaseListener(){
            public void enterAssignment(@NotNull SSTParser.AssignmentContext ctx) { 
                //                    System.out.println(ctx.getText( ));
            }
        };
        ParseTreeWalker.DEFAULT.walk( listener, parser.sstinput( ) );

    }
}
