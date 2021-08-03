package algoritmos;

import gerador.TempoDeExecucao;

public class InsertionSort extends TempoDeExecucao{

	public int[] execute(int[] v) {
		iniciar();
		for (int i = 1; i < v.length; i++) {
			int aux = v[i];
			int j = i;
			while ((j > 0) && (v[j - 1] > aux)) {
				v[j] = v[j - 1];
				j -= 1;
			}
			v[j] = aux;
		}
		finalizar();
		return v;
	}

	public void run(int[] vetor) {
		execute(vetor);
		
		System.out.println("---- Insertion Sort ---- \nTempo de Processamento: "+ (finalDoTeste - inicioDoTeste) +" milissegundos \n");
		
	}
}
