package Exercicio02;

public class ListaPares implements TAD02 {
	//Se redefinir os minimos e maximos aqui também, acaba dando erro e considerando os 2 como 0
    private int vetorPar[];

	public int[] getVetorPar() {
		return vetorPar;
	}

	public void setVetorPar(int[] vetorPar) {
		this.vetorPar = vetorPar;
	}

	public ListaPares() {
		// TODO Auto-generated constructor stub
		vetorPar = new int[TAMANHO];
		gerandoVetorPar();
	}

    private void gerandoVetorPar() {
        int i = 0;
        for (int num = minimo; num <= maximo; num++) {
            if (num % 2 == 0) {  // Verifica se o número é par
                vetorPar[i] = num;  // Adiciona o número par ao vetor
                i++;
            }
        }
    }
	
    public void imprimindoVetor() {
        System.out.println("Vetor dos pares entre " + minimo + " e " + maximo + ": ");
        for (int num : vetorPar) {
            System.out.print(num + "\t");  // Imprime os números do vetor separados por tabulação
        }
    }
	

}
