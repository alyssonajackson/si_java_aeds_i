package com.TIG;

import javax.swing.JOptionPane;
public class Pesquisa_sustentavel {
	
	public static void main(String args[]){
		
		int num_pessoas;
		String str_continuar = "s", sexo;
		String str_categorias[] = {"Infantil", "Juvenil", "Adulto", "Melhor Idade"};
		int categorias[] = new int[4], idade, cont_sim, categoria = 0;
		int cont_por_sexo[] = new int[2]; //[0] -> fem, [1] -> masc
		
		while(str_continuar.equals("s")){
			
			cont_sim = 0;
			
			//if(JOptionPane.showInputDialog("Qual o seu sexo?").matches('/m(asculino)?/')){
			
			//por sexo

			sexo = JOptionPane.showInputDialog("Qual o seu sexo? (feminino = f, masculino = m)");

			if(sexo.equals("f")){
				cont_por_sexo[0]++;
			}else{
				cont_por_sexo[1]++;
			}
			
			idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
			
			//por idade
			
			if(idade >= 0 && idade <= 11){
				categoria = 0;
				categorias[categoria]++;
			}
			if(idade >= 12 && idade <= 18){
				categoria = 1;
				categorias[categoria]++;
			}
			if(idade >= 19 && idade <= 60){
				categoria = 2;
				categorias[categoria]++;
			}
			if(idade > 60){
				categoria = 3;
				categorias[categoria]++;
			}
			
			if(Integer.parseInt(JOptionPane.showInputDialog("Voc� separa o lixo da sua casa? \n (1 = sim, 2 = n�o)")) == 1) cont_sim++;
			if(Integer.parseInt(JOptionPane.showInputDialog("Voc� tem reaproveitado a �gua da sua casa? \n (1 = sim, 2 = n�o)")) == 1) cont_sim++;
			if(Integer.parseInt(JOptionPane.showInputDialog("Voc� usa algum tipo de energia sustent�vel como por exemplo (solar ou e�lica)? \n (1 = sim, 2 = n�o)")) == 1) cont_sim++;
			if(Integer.parseInt(JOptionPane.showInputDialog("Voc� sempre joga lixo no lugar apropriado para o mesmo? \n (1 = sim, 2 = n�o)")) == 1) cont_sim++;
			if(Integer.parseInt(JOptionPane.showInputDialog("Voc� sabe como deve descartar o lixo eletr�nico (celulares,computadores,baterias,pilhas etc)? \n (1 = sim, 2 = n�o)")) == 1) cont_sim++;
			if(Integer.parseInt(JOptionPane.showInputDialog("Voc� j� ouviu falar sobre o processo de coleta seletiva de lixo da sua cidade? \n (1 = sim, 2 = n�o)")) == 1) cont_sim++;
			if(Integer.parseInt(JOptionPane.showInputDialog("Voc� reaproveita sacola pl�stica como saco de lixo? \n (1 = sim, 2 = n�o)")) == 1) cont_sim++;
			if(Integer.parseInt(JOptionPane.showInputDialog("Voc� reutiliza �leo de cozinha? (ex: para fabricar sab�o) \n (1 = sim, 2 = n�o)")) == 1) cont_sim++;
			if(Integer.parseInt(JOptionPane.showInputDialog("Voc� utiliza resto de mat�ria org�nica para aduba��o? \n (1 = sim, 2 = n�o)")) == 1) cont_sim++;
			if(Integer.parseInt(JOptionPane.showInputDialog("Voc� reaproveita �gua de chuva para lavar o quintal? \n (1 = sim, 2 = n�o)")) == 1) cont_sim++;			

			//resposta para o usu�rio sobre sua rela��o com a natureza ou sustentabilidade
			if(cont_sim > 8){
				JOptionPane.showMessageDialog(null, "Parab�ns voc� � um grande amigo da natureza!");
			}else if(cont_sim < 5){
				JOptionPane.showMessageDialog(null, "Colega, procure se informar sobre sustentabilidade. Todos n�s somos respons�veis pelo planeta que vivemos!");
			}else{
				JOptionPane.showMessageDialog(null, "Voc� precisa saber mais informa��es sobre sustentabilidade!");
			}
			
			JOptionPane.showMessageDialog(null, "Voc� est� na categoria " + str_categorias[categoria]);			
			
			str_continuar = JOptionPane.showInputDialog("Deseja continuar? (s = sim/n = n�o)"); 
		}
		
		JOptionPane.showMessageDialog(null, "Foram entrevistados um total de " + cont_por_sexo[0] + " mulheres, e " + cont_por_sexo[1] + " homens.");
		
	}

}
