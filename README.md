# Algoritmos-e-Estrutura-de-Dados-2024
Repositório destinado ao armazenamento de conteúdos e exercícios de Estrutura de Dados.
Objetivo: Desenvolver e aplicar conceitos de abstração, estrutura de dados e suas características funcionais.

a) O que é estrutura de dados? é uma maneira de organizar, gerenciar e armazenar dados de modo a permitir o acesso eficiente e a manipulação eficaz desses dados. 

b) Qual sua importancia? São utéis na otimização de tempo de execução, além de oferecer a estrutura de dados certa para organizar os dados de acordo com as suas necessidades.

c)Explique e exemplifique as estruturas: Array, Lista, fila, pilha.

Array: é uma estrutura de dados fundamental em programação que permite armazenar uma coleção de elementos do mesmo tipo sob um único nome. Onde dependendo da arquitetura do sistema, podemos adotar duas maneiras para trabalharmos com a alocação de memória: Estático: Ao criar um array, pré-definimos a quantidade máxima de registros. Dinâmico: Existe um método para aumentar a capacidade dinamicamente.

Exemplo array estatico: 
//classe
public class ArrayEstaticoExemplo {
        int[] arrayEstatico = new int[3];
}

Exemplo array dinamico:
//classe
public class ArrayDinamicoExamplo {
   int[] numeros;

   public ArrayDinamico(){
       this.numeros = new int[10];
   }
}

Lista: pode ser implementada usando a interface List, que define uma sequência de elementos ordenados. Uma das implementações mais comuns dessa interface é o ArrayList, que oferece uma lista redimensionável que cresce automaticamente conforme os elementos são adicionados. 

Exemplo lista:
//ArrayList
public class ListaExemplo {
        List<String> lista = new ArrayList<>();
        // Adicionando elementos à lista
        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Laranja");

        // Imprimindo a lista
        System.out.println(lista);

        //removendo o nome da posição 1
        lista.remove(1);

        // Imprimindo a lista atualizada
        System.out.println(lista);       
}

Fila: nessa estrutura de dados é aplicado o conceito de que o "primeiro a entrar, primeiro a sair" (FIFO - First-In-First-Out), ou seja o primeiro elemento inserido na fila será o primeiro a ser removido, esse é um dos padrões mais utilizados nos projetos.

Exemplo fila:
//Criando uma fila com LinkedList
public class Fila{
    Queue<String> fila = new LinkedList<>();
    // Adicionando elementos à fila
        fila.add("Primeiro");
        fila.add("Segundo");
        fila.add("Terceiro");
        
    // Imprimindo a fila
        System.out.println(fila);
        
    // Acessando e removendo o primeiro elemento da fila
    String removido = fila.remove();
    System.out.println("Elemento removido: " + removido);

    //Exibindo a fila após a remoção
    System.out.println("Fila após a remoção: " + fila);
}

Pilha: nessa estrutura de dados é aplicado o conceito de que o Último a Entrar é Primeiro a Sair (LIFO): O elemento mais recentemente adicionado é o primeiro a ser removido. O padrão de pilha é comumente utilizado em programação para realizar operações como desfazer ações (undo), rastreamento de chamadas de função, análise de expressões matemáticas e muito mais.

Exemplo pilha:
public class Pilha {
        // Criando uma pilha
        Stack<String> pilha = new Stack<>();

        // Adicionando elementos à pilha
        pilha.push("Primeiro");
        pilha.push("Segundo");
        pilha.push("Terceiro");

        // Acessando o elemento no topo da pilha sem removê-lo
        System.out.println("Topo da pilha:" pilha.peek());

        // Acessando e removendo o elemento no topo da pilha
        while(!pilha.isEmpty()){
            String topo = pilha.pop();
            System.out.println("Elemento removido do topo da pilha: " + topo);
        }

        // Verificando se a pilha está vazia
        boolean vazia = pilha.isEmpty();
        System.out.println("\nA pilha está vazia? " + vazia);  
}

