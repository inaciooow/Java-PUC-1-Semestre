package com.aed.puc.lista2;
import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		/*Faça um programa para ler 3 temperaturas medidas ao longo de
		um dia e após as leituras, mostre a média entre elas e uma das mensagens abaixo:
			- se a média for <= 10 graus, diga “Muito Frio!”;
			- se a média estiver > 10 e <= 20, diga “Frio !”;
			- se a média estiver > 20 e <= 30, diga “Quente!”;
			- se a média estiver > 30, diga “Muito Quente!”;
		*/
		
		Scanner entrada = new Scanner (System.in);
		int temp1, temp2, temp3, resultado;
		
		System.out.print("Digite a temperatura das 6:00 horas : ");
		temp1 = entrada.nextInt();
		
		System.out.print("Digite a temperatura de 12:00 horas : ");
		temp2 = entrada.nextInt();
		 
		System.out.print("Digite a temperatura das 18:00 horas : ");
		temp3 = entrada.nextInt();
		 
		resultado = (temp1 + temp2 + temp3) / 3;
		
		if (resultado <=10)
			System.out.printf("A média foi " + resultado + " graus. E é considerado muito frio.");
		
		if ((resultado >10)&&(resultado <=20))
			System.out.printf("A média foi " + resultado + " graus. E é considerado frio.");
		 
		if ((resultado >20)&&(resultado <=30))
			System.out.printf("A média foi " + resultado + " graus. E é considerado quente.");
		 
		if (resultado >30)
			System.out.printf("A média foi " + resultado + " graus. E é considerado muito quente.");
		
		entrada.close();
		
	}

}