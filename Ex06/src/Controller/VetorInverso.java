package Controller;

public class VetorInverso {

    // Construtor
    public VetorInverso() {
        // Instanciação da classe
    }

    public void inverterVetor(int[] vetor, int inicio, int fim) {

        /*
         * Quando inicio for maior ou igual a fim,
         * significa que todas as trocas já foram feitas.
         */
        if (inicio >= fim) {
            return;
        }

        /*
         * TROCA DOS ELEMENTOS
         */
        int temp = vetor[inicio];
        vetor[inicio] = vetor[fim];
        vetor[fim] = temp;


        inverterVetor(vetor, inicio + 1, fim - 1);
    }

    // Metodo apenas para exibir o vetor
    public void mostrarVetor(int[] vetor) {
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
