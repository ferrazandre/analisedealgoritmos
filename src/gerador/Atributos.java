package gerador;

public class Atributos {

	public long inicioDoTeste;
	public long finalDoTeste;
	public static long testeChave = 0;
	public static long trocaChave = 0;

	public void iniciar() {
		inicioDoTeste = 0;
		inicioDoTeste = System.currentTimeMillis();
	}

	public void finalizar() {
		finalDoTeste = 0;
		finalDoTeste = System.currentTimeMillis();
	}

	public long getInicioDoTeste() {
		return inicioDoTeste;
	}

	public void setInicioDoTeste(long inicioDoTeste) {
		this.inicioDoTeste = inicioDoTeste;
	}

	public long getFinalDoTeste() {
		return finalDoTeste;
	}

	public void setFinalDoTeste(long finalDoTeste) {
		this.finalDoTeste = finalDoTeste;
	}

}
