package algoritmos;

import gerador.Atributos;

public class QuickSort extends Atributos {

	public void execute(int[] v, int i, int f) {

		int n = (int) (Math.random() * ((f) - i + 1) + i);
		int pivo = v[n];
		int e = i;
		int d = f;
		while (e <= d) {
			testeChave++;
			while (e <= f && v[e] < pivo) {
				e++;
				testeChave++;
			}
			while (d >= i && v[d] > pivo) {
				d--;
				testeChave++;

			}
			testeChave++;
			if (e <= d) {
				int aux = v[e];
				v[e] = v[d];
				v[d] = aux;
				e++;
				d--;
				trocaChave+=2;
			}
		}
		if (e < f)
			execute(v, e, f);
		if (d > i)
			execute(v, i, d);
	}

	public void run(int[] vetor) {
		testeChave = 0;
		trocaChave = 0;
		iniciar();
		execute(vetor, 0, vetor.length - 1);
		finalizar();

		System.out.println("---- Quick Sort ---- \nTempo de Processamento: " + (finalDoTeste - inicioDoTeste)
				+ " milissegundos \nTestes de Chaves: " + testeChave + " \nTrocas de Chaves: " + trocaChave + "\n");

	}

}
