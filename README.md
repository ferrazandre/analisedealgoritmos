# analisedealgoritmos
Análise Experimental de Algoritmos

---- Objetivos -----

Este trabalho consiste em analisar o desempenho de um algoritmo de ordenação em diferentes cenários.

---- Descrição -----

A análise do algoritmo será dividida em duas partes. A primeira parte refere-se à análise assintótica do algoritmo. Na segunda, a análise consistirá em comparar o algoritmo com os seguintes competidores: InsertionSort, SelectionSort, BubbleSort, MergeSort e QuickSort.

Foi considerado arranjos (vetores) com diferentes quantidades de elementos (10, 100, 1.000, 10.000, 100.000, 1.000.000). Os arranjos não possuem valores repetidos. Os valores são inteiros e, para gerar os arranjos iniciais, foram utilizados: (i) arranjos ordenados, (ii) inversamente ordenados, (iii) quase ordenados e (iv) aleatórios.

A análise assintótica foi feita sobre o número de comparações de chaves e o número de movimentações de registros. Três métricas de desempenho foram consideradas na comparação com outros algoritmos: (i) número de comparações de chaves, (ii) número de movimentações de registros e (iii) tempo total gasto para ordenação (tempo de processamento e não o tempo de relógio).
