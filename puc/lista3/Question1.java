package com.aed.puc.lista3;
import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		/*Utilizando a estrutura de repetição WHILE, implemente um
		programa em Java para ler as notas de 10 alunos, calcular e imprimir a
		média da turma.
		*/
		
		Scanner entrada = new Scanner(System.in);
		int soma=0, media=0;
		int x=1, n=0;
		 
		 do
		 { 
			 System.out.printf("Entre com a nota do %dº aluno: " ,x);
			 n = entrada.nextInt();
			 soma = soma + n;
			 x = x +1;
		 }
		 
		while (x<=10);
		media = soma/10;
		System.out.print("A média da turma foi: "+media);
		
		entrada.close();

	}

}