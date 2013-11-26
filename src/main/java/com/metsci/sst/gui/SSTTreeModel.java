package com.metsci.sst.gui;

import java.awt.Color;
import java.awt.Component;
import java.io.FileInputStream;
import java.util.LinkedHashSet;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.WindowConstants;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.metsci.sst.parser.SSTLexer;
import com.metsci.sst.parser.SSTParser;
import com.metsci.sst.parser.SSTParser.AssignmentContext;
import com.metsci.sst.parser.SSTParser.IdentifierbracketsContext;
import com.metsci.sst.parser.SSTParser.PrintContext;
import com.metsci.sst.parser.SSTParser.ReadContext;
import com.metsci.sst.parser.SSTParser.SstinputContext;

public class SSTTreeModel implements TreeModel
{
    private LinkedHashSet<TreeModelListener> listeners = new LinkedHashSet<>( ); 
    private SstinputContext root;
    public SSTTreeModel(SstinputContext root){
        this.root = root;
    }
    @Override
    public Object getRoot( )
    {
        return root;
    }

    @Override
    public Object getChild( Object parent, int index )
    {
    	if(parent instanceof ReadContext)
    		return ((ReadContext)parent).getChild(1);
    	if(parent instanceof PrintContext)
    		return ((PrintContext)parent).getChild(1);
        if(parent instanceof ParseTree)
            return ((ParseTree)parent).getChild( index );
        return null;
    }

    @Override
    public int getChildCount( Object parent )
    {
    	if(parent instanceof ReadContext)
    		return 1;
    	if(parent instanceof PrintContext)
    		return 1;
        if(parent instanceof ParseTree)
            return((ParseTree)parent).getChildCount( );
        return -1;
    }

    @Override
    public boolean isLeaf( Object node )
    {
    	if(node instanceof ReadContext)
    		return false;
    	if(node instanceof PrintContext)
    		return false;
        return true;
    }

    @Override
    public void valueForPathChanged( TreePath path, Object newValue )
    {
        
    }

    @Override
    public int getIndexOfChild( Object parent, Object child )
    {
        return -1;
    }

    @Override
    public void addTreeModelListener( TreeModelListener l )
    {
        this.listeners.add( l );
        
    }

    @Override
    public void removeTreeModelListener( TreeModelListener l )
    {
        this.listeners.remove( l );
        
    }
    public static void main(String[] args) throws Exception{
        ANTLRInputStream input=new ANTLRInputStream(new FileInputStream("sst/certifyBistatic.sst"));
        SSTLexer lexer=new SSTLexer(input);
        CommonTokenStream tokens=new CommonTokenStream(lexer);
        SSTParser parser=new SSTParser(tokens);
        SSTTreeModel model = new SSTTreeModel( parser.sstinput( ) );
        JTree tree = new JTree(model);
        tree.setCellRenderer( new TreeCellRenderer(){
            @Override
            public Component getTreeCellRendererComponent( JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus )
            {
                JLabel label = new JLabel(value.getClass( ).getSimpleName( ));
                if(value instanceof TerminalNode)
                	label.setText(((TerminalNode)value).getText());
            	if(value instanceof ReadContext)
            		label.setText("read");
            	if(value instanceof PrintContext)
            		label.setText("print");
            	if(value instanceof AssignmentContext)
            		label.setText("assignment");
                label.setOpaque( true );
                label.setBackground( selected?Color.lightGray:new Color(0,0,0,0) );
                return label;
            }}
        );
        tree.setRootVisible( false );
        JDialog dlg = new JDialog();
        dlg.setContentPane( tree );
        dlg.setSize( 500,500 );
        dlg.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE );
        dlg.setVisible( true );
    }

}
