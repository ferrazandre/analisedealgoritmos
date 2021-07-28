package gerador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeradorDeSequencias {
	
	/**
	 * Método que gera um List ordenado.
	 * @param t (tamnho do vetor)
	 * @return retorna um List ordenado.
	 */
	public static List<Integer> gerarArrayList(int t) {
		List<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < t; i++) {
			array.add(i);
		}
		return array;
	}
	
	/**
	 * Método que gera um vetor de sequencia ordenada.
	 * @param t (tamanho do vetor)
	 * @return retorna um vetor com sequencia ordenada.
	 */
	public static int[] geradorDeSequenciaOrdenadada(int t) {
		int[] v = new int[t];
		for (int i = 0; i < t; i++) {
			v[i] = i;
		}
		return v;
	}
	
	/**
	 * 
	 * @param t (tamanho do vetor)
	 * @return retorna um vetor com sequencia inversa.
	 */
	public static int[] geradorDeSequenciaInversa(int t) {
		int n = t;
		int[] v = new int[t];
		for (int i = 0; i < t; i++) {
			v[i] = n;
			n = n - 1;
		}
		return v;
	}
	/**
	 * Método que gera um vetor de sequencia quase ordenada.
	 * @param t (tamanho do vetor)
	 * @return retorna um vetor quase ordenado.
	 */
	public static int[] geradorDeSequenciaQuaseOrdenada(int t) {
		int[] v = new int[t];
		for (int i = 0; i < t; i++) {
			v[i] = i;
		}
		int f = (int) (t * 0.1);
		while (f > 0) {
			int i = (int) (Math.random() * t);
			int j = (int) (Math.random() * t);
			trocar(v, i, j);
			f--;
		}
		return v;
	}
	
	/**
	 * Método que realiza troca de posições de um vetor.
	 * @param v (vetor long)
	 * @param i (posição da troca)
	 * @param j (posição da troca)
	 */
	private static void trocar(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
	
	/**
	 * Método que gera um vetor de sequecia aleátoria.
	 * @param t (tamanho do vetor)
	 * @return retorna um vetor com sequencia aleátoria.
	 */
	public static int[] geradorDeSequenciaAleatoria(int t) {
		int[] v = new int[t];
		List<Integer> array = gerarArrayList(t);
		Collections.shuffle(array);
		int cont = 0;
		for (Integer n : array) {
			v[cont] = n;
			cont++;
		}
		return v;
	}

}
