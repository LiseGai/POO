package Exercicio01;

import java.util.*;

public class EscrevendoNomeseImprimindo {
	public static void EscrevendoNomes() {
		String[] nomes = new String[5];
		System.out.println("Escreva os nomes abaixo: ");
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<5;i++) {
			System.out.println("Nome "+(i+1)+": ");
			nomes[i]=sc.nextLine();
			
		}
		sc.close();
		ImprimindoNomes(nomes);
		
	}
	public static void ImprimindoNomes(String[] nomes) {
		System.out.println(Arrays.toString(nomes));
	}
	

}
