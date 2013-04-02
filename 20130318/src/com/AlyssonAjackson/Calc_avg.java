package com.AlyssonAjackson;

import javax.swing.JOptionPane;

public class Calc_avg {

	public static void main (String args[]){
		String in1, in2, in3;
		Integer n1, n2, n3, sum, avg;
		
		n1 = n2 = n3 = sum = avg = 0;
		
		in1 = JOptionPane.showInputDialog("Type 1st value: ");
		in2 = JOptionPane.showInputDialog("Type 2nd value: ");
		in3 = JOptionPane.showInputDialog("Type 3rd value: ");
		
		try{
			n1 = Integer.parseInt(in1);
			n2 = Integer.parseInt(in2);
			n3 = Integer.parseInt(in3);
			
			sum = n1 + n2 + n3;
			avg = sum/3;
		}catch(Exception e){
			System.out.println("Error found.");
		}
		
		JOptionPane.showMessageDialog(null, "The final avg is: " + avg);
		
	}
	
}
