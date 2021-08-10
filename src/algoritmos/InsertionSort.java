package algoritmos;

import gerador.Atributos;

public class InsertionSort extends Atributos {

	public int[] execute(int[] v) {
		iniciar();
		testeChave = 0;
		trocaChave = 0;
		for (int i = 1; i < v.length; i++) {
			int aux = v[i];
			int j = i;
			testeChave++;
			while ((j > 0) && (v[j - 1] > aux)) {
				v[j] = v[j - 1];
				j -= 1;
				trocaChave++;
			}
			v[j] = aux;
		}
		finalizar();
		return v;
	}

	public void run(int[] vetor) {
		execute(vetor);

		System.out.println("---- Insertion Sort ---- \nTempo de Processamento: " + (finalDoTeste - inicioDoTeste)
				+ " milissegundos \nTestes de Chaves: " + testeChave + " \nTrocas de Chaves: " + trocaChave + "\n");

	}
}
