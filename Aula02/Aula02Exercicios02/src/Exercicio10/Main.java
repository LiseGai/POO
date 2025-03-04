package Exercicio10;

/*
 * - Escreva um programa Java que use um para calcular a média de vários
números reais lidos do usuário até que seja lido o número 0.

Organizaçao: 
1. TAD10: Vai conter a variavel float numeroProibido que vai receber 0
2. Médias: Vai implementar TAD10 e conter...
- Um ArrayList que vai armazenar as médias
- Uma variavel médiaDigitada de float que vai armazenar as notas
- Um construtor que vai inicializar o Array e a médiaDigitada com zero
- Um método chamado ArmazenandoMédias publico e void que vai armazenar as médias com o while
Mas que, com um if, se a média for negativa ou maior que 10, nao vai ser armazenada
3. Main: Que vai chamar o ArmazenandoMédias
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medias medias = new Medias();
		medias.ArmazenandoMedias();
		medias.ImprimindoMedias();

	}

}
