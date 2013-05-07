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
			
			if(Integer.parseInt(JOptionPane.showInputDialog("Você separa o lixo da sua casa? \n (1 = sim, 2 = não)")) == 1) cont_sim++;
			if(Integer.parseInt(JOptionPane.showInputDialog("Você tem reaproveitado a água da sua casa? \n (1 = sim, 2 = não)")) == 1) cont_sim++;
			if(Integer.parseInt(JOptionPane.showInputDialog("Você usa algum tipo de energia sustentável como por exemplo (solar ou eólica)? \n (1 = sim, 2 = não)")) == 1) cont_sim++;
			if(Integer.parseInt(JOptionPane.showInputDialog("Você sempre joga lixo no lugar apropriado para o mesmo? \n (1 = sim, 2 = não)")) == 1) cont_sim++;
			if(Integer.parseInt(JOptionPane.showInputDialog("Você sabe como deve descartar o lixo eletrônico (celulares,computadores,baterias,pilhas etc)? \n (1 = sim, 2 = não)")) == 1) cont_sim++;
			if(Integer.parseInt(JOptionPane.showInputDialog("Você já ouviu falar sobre o processo de coleta seletiva de lixo da sua cidade? \n (1 = sim, 2 = não)")) == 1) cont_sim++;
			if(Integer.parseInt(JOptionPane.showInputDialog("Você reaproveita sacola plástica como saco de lixo? \n (1 = sim, 2 = não)")) == 1) cont_sim++;
			if(Integer.parseInt(JOptionPane.showInputDialog("Você reutiliza óleo de cozinha? (ex: para fabricar sabão) \n (1 = sim, 2 = não)")) == 1) cont_sim++;
			if(Integer.parseInt(JOptionPane.showInputDialog("Você utiliza resto de matéria orgânica para adubação? \n (1 = sim, 2 = não)")) == 1) cont_sim++;
			if(Integer.parseInt(JOptionPane.showInputDialog("Você reaproveita água de chuva para lavar o quintal? \n (1 = sim, 2 = não)")) == 1) cont_sim++;			

			//resposta para o usuário sobre sua relação com a natureza ou sustentabilidade
			if(cont_sim > 8){
				JOptionPane.showMessageDialog(null, "Parabéns você é um grande amigo da natureza!");
			}else if(cont_sim < 5){
				JOptionPane.showMessageDialog(null, "Colega, procure se informar sobre sustentabilidade. Todos nós somos responsáveis pelo planeta que vivemos!");
			}else{
				JOptionPane.showMessageDialog(null, "Você precisa saber mais informações sobre sustentabilidade!");
			}
			
			JOptionPane.showMessageDialog(null, "Você está na categoria " + str_categorias[categoria]);			
			
			str_continuar = JOptionPane.showInputDialog("Deseja continuar? (s = sim/n = não)"); 
		}
		
		JOptionPane.showMessageDialog(null, "Foram entrevistados um total de " + cont_por_sexo[0] + " mulheres, e " + cont_por_sexo[1] + " homens.");
		
	}

}
