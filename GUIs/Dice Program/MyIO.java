//Written by Dr. Abbas Dehkhoda
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class MyIO{
	public static int getInt(String s){
		String strNum = "";
		int n1 = 0;
		boolean ok = false;
		while ( !ok ){
			try{
				strNum = JOptionPane.showInputDialog(s);
				n1 = Integer.parseInt(strNum);
				ok = true;
			} catch (Exception ex){
				JOptionPane.showMessageDialog(null, strNum + " is not integer try again" );
			}
		}
		return n1;
	}
	public static void display(String x, Color bc, Color fc){
		JTextArea jt = new JTextArea(15,20);
		jt.setBackground(bc);
		jt.setForeground(fc);
		Font f = new Font("Times new Roman",
		Font.BOLD+Font.ITALIC,30);
		jt.setFont(f);
		jt.setText(x);
		JOptionPane.showMessageDialog( null,jt);
	}
	// overload display
	public static void display(String x){
		JTextArea jt = new JTextArea(15,20);
		jt.setBackground(Color.BLACK);
		jt.setForeground(Color.WHITE);
		Font f = new Font("Times new Roman",
		Font.BOLD+Font.ITALIC,30);
		jt.setFont(f);
		jt.setText(x);
		JScrollPane sr = new JScrollPane(jt);
		JOptionPane.showMessageDialog(null,sr);
	}
}