package Exercicio07;

/*
 * Escreva um programa Java que use um laço para ler a nota de vários alunos até
que seja lida a nota -1

Classes e funçoes: 
1. TAD: 
vai conter o valor proibido chamado nota proibida e inicializado com -1
2. Notas: 
vai criar o array como private pra armazenar as notas
vai criar o construtor pra inicializar as variaveis i e valorNotas (vai inicializar com 0)
vai criar os getters e setters
vai criar o método publico LendoNotas onde, no array, vai digitar com while as notas até que a nota seja
igual à nota proibida do TAD
vai criar o método imprimindoNotas onde vai imprimir as notas digitadas
3. Main: 
vai instanciar o Notas
vai chamar o LendoNotas
vai chamar o ImprimindoNotas
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notas notas = new Notas();
		notas.lendoNotas();
        notas.imprimindoNotas();
	}

}
