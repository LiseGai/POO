package Exercicio03;

public class Tabuada implements TAD03{
	private int tabuadaSete[];
	private int valor;
	public int[] getTabuadaSete() {
		return tabuadaSete;
	}
	public void setTabuadaSete(int[] tabuadaSete) {
		this.tabuadaSete = tabuadaSete;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Tabuada() {
		tabuadaSete = new int[TAMANHO];
		valor=0;
		gerarTabuada();
	}
	private void gerarTabuada() {
		// TODO Auto-generated method stub
		for (int i=0; i<tabuadaSete.length;i++) {
			tabuadaSete[i]=valor*multiplicador;
			valor++;
		}
		
	}
	
	public void imprimindoTabuada() {
		System.out.println("A tabuada do sete é: ");
		for (int num : tabuadaSete) System.out.print(num+"\t");
	}

}
