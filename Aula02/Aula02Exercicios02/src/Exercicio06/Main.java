package Exercicio06;

/*
 * Escreva um programa Java que use um laço para ler uma sequência de números
inteiros do usuário até que o número 0 seja lido.

Logica: 
- TAD: numero proibido (0)
- Sequencia: 
1. Lista
2. Construtor
3. Adicionar valor em loop usando while (numproibido!=0)
4. Imprimindo valores
- Main: Chama adicionandoValores e imprimindo valores
 */

public class Main {
	public static void main(String[] args) {
		Sequencia exercicio06 = new Sequencia();
		exercicio06.AdicionandoValores();
		exercicio06.ImprimindoValores();
	}

}
