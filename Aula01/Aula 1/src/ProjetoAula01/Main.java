package ProjetoAula01;


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @param leitura está relacionada com o valor de leitura que vai ser digitado
 * @param algo    é a variável que vai receber a palavra digitada, descrita como
 *                uma String
 * @param numero  está relacionada com o valor de leitura que vai ser digitado
 * @param idade   é a variável que vai receber o número digitado
 */

public class Main {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat( "#.###" );
		
		System.out.println("Olá mundo");
		Scanner leitura = new Scanner(System.in);
		System.out.println("Escreva algo: ");
		String algo = leitura.nextLine();
		System.out.println("A palavra digitada foi " + algo);

		System.out.println("Digite um número aleatório:");
		Scanner numero = new Scanner(System.in);
		int idade = numero.nextInt();
		System.out.println("O número digitado foi " + idade);
		
		System.out.println("Entre com um valor float: ");
		Scanner numfloat = new Scanner (System.in);
		
		float digitar = numfloat.nextFloat();
		System.out.println("O valor float: "+df.format(digitar));//Arredonda e ajeita o formato inserindo virgula
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero entre 1 e 3");
		int numerodigitado=entrada.nextInt();
		

		switch(numerodigitado) {
			case 1: 
				System.out.println("O numero foi 1");
				break;
			case 2: 
				System.out.println("O numero foi 2");
				break;
			case 3: 
				System.out.println("O numero foi 3");
				break;
			default: 
				System.out.println("Numero invalido");
		}
	}

}
