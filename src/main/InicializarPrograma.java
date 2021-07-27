package main;

import java.util.Scanner;

import algoritmos.BubbleSort;
import algoritmos.InsertionSort;
import gerador.GeradorDeSequencias;

public class InicializarPrograma {

	private static Scanner leitor;

	public static void main(String[] args) {
		int[] vetor = null;
		leitor = new Scanner(System.in);
		while (true) {

			System.out.println(
					"---Escolha um algoritmo---\n \n1 - InsertionSort \n2 - SelectionSort \n3 - BubbleSort \n4 - MergeSort \n5 - QuickSort");
			int algoritmo = leitor.nextInt();

			System.out.println(
					"---Escolha uma quantidade---\n \n1 - 10 \n2 - 100 \n3 - 1000 \n4 - 10000 \n5 - 100000 \n6 - 1000000");
			int qtd = leitor.nextInt();

			System.out.println(
					"---Escolha um tipo de ordenação---\n \n1 - Ordenados \n2 - Ordenados inversamente \n3 - Quase ordenados \n4 - Aleatórios");
			int ord = leitor.nextInt();

			switch (qtd) {
			case 1:
				qtd = 10;
				break;
			case 2:
				qtd = 100;
				break;
			case 3:
				qtd = 1000;
				break;
			case 4:
				qtd = 10000;
				break;
			case 5:
				qtd = 100000;
				break;
			case 6:
				qtd = 1000000;
				break;
			default:
				System.out.println("Valor inválido!");
				break;
			}

			switch (ord) {
			case 1:
				vetor = GeradorDeSequencias.geradorDeSequenciaOrdenadada(qtd);
				break;
			case 2:
				vetor = GeradorDeSequencias.geradorDeSequenciaInversa(qtd);
				break;
			case 3:
				vetor = GeradorDeSequencias.geradorDeSequenciaQuaseOrdenada(qtd);
				break;
			case 4:
				vetor = GeradorDeSequencias.geradorDeSequenciaAleatoria(qtd);
				break;
			default:
				System.out.println("Valor inválido");
				break;
			}

			switch (algoritmo) {
			case 1:
				InsertionSort insertionSort = new InsertionSort();
				insertionSort.execute(vetor);
				break;
			case 3:
				BubbleSort bubbleSort = new BubbleSort();
				bubbleSort.execute(vetor);
				System.out.println("Tempo de processamento: "
						+ (bubbleSort.finalDoTeste - bubbleSort.inicioDoTeste) / 1000 + " segundos");
				break;
			default:
				System.out.println("Valor inválido!");
				break;
			}

		}

	}

}
