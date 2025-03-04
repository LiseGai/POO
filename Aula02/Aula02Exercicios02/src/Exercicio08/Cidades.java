package Exercicio08;

import java.util.*;

public class Cidades implements TAD08 {
	ArrayList<String> cidadesDigitadas = new ArrayList<>(); 
	private String nomeDigitado;
	
	public ArrayList<String> getCidadesDigitadas() {
		return cidadesDigitadas;
	}

	public void setCidadesDigitadas(ArrayList<String> cidadesDigitadas) {
		this.cidadesDigitadas = cidadesDigitadas;
	}

	public String getNomeDigitado() {
		return nomeDigitado;
	}

	public void setNomeDigitado(String nomeDigitado) {
		this.nomeDigitado = nomeDigitado;
	}

	public Cidades() {
		// TODO Auto-generated constructor stub
		this.nomeDigitado=null;
	}
	
	public void DigitandoCidades () {
		Scanner digitado = new Scanner(System.in);
		System.out.println("Digite o nome das cidades (menos Sao Paulo):");
		while (nomeDigitado!=cidadeProibida) {
			nomeDigitado = digitado.nextLine();
			if (nomeDigitado.equals(cidadeProibida)) { //== compara referências de memória, e não o conteúdo.
				System.out.println("Cidade proibida. Nao armazenada");
				ImprimindoCidades();
			}
			cidadesDigitadas.add(nomeDigitado);
		}
		digitado.close();
	}
	
	public void ImprimindoCidades() {
		//Validaçoes: 
		if (cidadesDigitadas.isEmpty()) System.out.println("Lista vazia");
		else System.out.println("As cidades digitadas foram: \n"+cidadesDigitadas);
	}

}
