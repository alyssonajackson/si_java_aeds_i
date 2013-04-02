package com.AlyssonAjackson;

import javax.swing.JOptionPane;

public class Retangulo {
	
	public static void main(String args[]){
	
		Integer width, height, area;
		width = height = area = 0;
		
		try{
			width = Integer.parseInt(JOptionPane.showInputDialog("Type the width: "));
			height = Integer.parseInt(JOptionPane.showInputDialog("Type the height: "));
		}catch(Exception e){
			//error found
		}
		
		area = width * height;
		
		JOptionPane.showMessageDialog(null, "The area is: " + area);
	
	}

}
