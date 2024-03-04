# Algoritmos-e-Estrutura-de-Dados-2024
Repositório destinado ao armazenamento de conteúdos e exercícios de Estrutura de Dados.
Objetivo: Desenvolver e aplicar conceitos de abstração, estrutura de dados e suas características funcionais.

a) O que é estrutura de dados? é uma maneira de organizar, gerenciar e armazenar dados de modo a permitir o acesso eficiente e a manipulação eficaz desses dados. 

b) Qual sua importancia? São utéis na otimização de tempo de execução, além de oferecer a estrutura de dados certa para organizar os dados de acordo com as suas necessidades.

c)Explique e exemplifique as estruturas: Array, Lista, fila, pilha.

Array: é uma estrutura de dados fundamental em programação que permite armazenar uma coleção de elementos do mesmo tipo sob um único nome. Onde dependendo da arquitetura do sistema, podemos adotar duas maneiras para trabalharmos com a alocação de memória: Estático: Ao criar um array, pré-definimos a quantidade máxima de registros. Dinâmico: Existe um método para aumentar a capacidade dinamicamente.
Exemplo array estatico: 
public class ArrayEstaticoExemplo {
    public static void main(String[] args) {
        int[] arrayEstatico = new int[3];

        arrayEstatico[0] = 10;
        arrayEstatico[1] = 20;
        arrayEstatico[2] = 30;

        for (int i = 0; i < arrayEstatico.length; i++) {
            System.out.println("Elemento " + i + ": " + arrayEstatico[i]);
        }
    }
}
Exemplo arrey dinamico:

Lista: 
Fila:
Pilha:
