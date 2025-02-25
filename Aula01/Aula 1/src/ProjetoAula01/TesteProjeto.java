package ProjetoAula01;

public class TesteProjeto<TIPO> implements TADProjeto01<TIPO> {

	@Override
	public boolean mesmoValor(TIPO digitado, TIPO armazenado) {
		return digitado==armazenado ? true : false;
	}
	public void imprimirValores(TIPO digitado, TIPO armazenado) {
		System.out.println("Os valores são: "+digitado+" e "+armazenado);
		
	}

}
