package com.aed.puc.lista4;
import java.util.*;

public class Question5 {

	public static void main(String[] args) {
		/*Faça um programa para ler os votos (sim=1 / não=2) e o gênero
		(mas=1 / fem=2) de um grupo de 7 pessoas.
		Ao final mostre:
		1. A ocorrência de sim e de não nas respostas;
		2. O número de mulheres e o número de homens;
		3. O número de mulheres que responderam sim;
		4. O número de homens que responderam não;
		*/
		
		Scanner entrada = new Scanner (System.in);
		int voto, gen, i, cvum, cvdois, cm, cf, cv1f, cv2m;
		
		i = 0;
		cvum = 0;
		cvdois = 0;
		cm = 0;
		cf = 0;
		cv1f = 0;
		cv2m = 0;
	
		
		while(i < 7) {
			
			do {
			System.out.println("Qual seu voto?\nSim - 1\nNão - 2");
			voto = entrada.nextInt();
			
			if(voto == 1) {
				cvum = cvum + 1;
			} else if(voto == 2) {
				cvdois = cvdois + 1;
				} else {
					System.out.print("Voto inválido! Tente novamente!\n");
					}
			
		} while((voto<1) || (voto>2));
			
			do {
				System.out.println("Qual seu gênero?\nMasculino - 1\nFeminino - 2");
				gen = entrada.nextInt();
				
				if (gen == 1) {
					cm = cm + 1;
				} if (gen == 1 && voto == 2) {
					cv2m = cv2m + 1;
					} 
				
				if (gen == 2) {
					cf = cf + 1;
				} if (gen == 2 && voto == 1){
					cv1f = cv1f + 1;
					}
				
				if (gen != 1 && gen != 2) {
					System.out.print("Gênero inválido Tente novamente");
				}
				
				} while((gen<1) || (gen>2));
			i++;
		}
		
		System.out.println("Total de Votos Sim = " +cvum +"\nTotal de Votos Não = " +cvdois); 
		System.out.println("Total de Homens = " +cm + "\nTotal de Mulheres = " +cf);
		System.out.println("Total de Mulheres que votaram Sim = " +cv1f);
		System.out.println("Total de Homens que votaram Não = " +cv2m);
		
		entrada.close();

	}
}