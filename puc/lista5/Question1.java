package com.aed.puc.lista5;
import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		/*Utilizando a estrutura de repetição FOR, implemente um programa
		em Java para ler as notas de 10 alunos e após calcule e mostre a
		média da turma, a maior e a menor nota verificada.
		*/
		
		Scanner entrada = new Scanner(System.in);
		double nota, media=0, maior=0, menor=9999;
		
		for (int i=0; i<10; i++) {
			System.out.print("Insira a nota: ");
			nota = entrada.nextInt();
			media = media + nota;
			
			if (nota < menor) {
				menor = nota;
			} else if (nota > maior) {
				maior = nota;
				} 
		} 
		
		System.out.print("A média da turma foi: "+media);
		System.out.print("\nA maior nota foi: "+maior);
		System.out.print("\nA menor nota foi: "+menor);
		 
		entrada.close();
		
	}

}