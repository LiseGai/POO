package Exercicio04;

public class Somatorio implements TAD04 {
	private int vetorSoma[];
	private int soma;
	
	public int getSoma() {
		return soma;
	}


	public void setSoma(int soma) {
		this.soma = soma;
	}


	public int[] getVetorSoma() {
		return vetorSoma;
	}


	public void setVetorSoma(int[] vetorSoma) {
		this.vetorSoma = vetorSoma;
	}


	public Somatorio() {
		// TODO Auto-generated constructor stub
		vetorSoma = new int[TAMANHO];
		soma=0;
		gerarVetor();
		gerarSoma();
		
	}
	
    private void gerarVetor() {
        // Preenche o vetor com valores de 1 a 100
        for (int i = 0; i < vetorSoma.length; i++) {
            vetorSoma[i] = i + 1; 
        }
    }


	private void gerarSoma() {
		// TODO Auto-generated method stub
		for (int i=0; i<vetorSoma.length; i++) {
			soma += vetorSoma[i];
		}
		
	}
	
	public void imprimindoSoma() {
		System.out.println("A soma dos valores é: "+soma);
	}

}
