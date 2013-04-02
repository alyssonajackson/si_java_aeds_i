package com.AlyssonAjackson;

import javax.swing.JOptionPane;

public class MostraNome {

	public static void main(String[] args) {
		
		String nome;
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		
		try{
			JOptionPane.showMessageDialog(null, "O nome digitado foi: " + nome);
		}catch(Exception e){
			System.out.println("Erro encontrado.");
		}
		
	}
	
}
