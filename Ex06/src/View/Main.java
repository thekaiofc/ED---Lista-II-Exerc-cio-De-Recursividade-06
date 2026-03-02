package View;

import Controller.VetorInverso;

public class Main {

    public static void main(String[] args) {

    	VetorInverso controller = new VetorInverso();

        // Vetor com 10 posições
        int[] vetor10 = {1,2,3,4,5,6,7,8,9,10};

        // Vetor com 11 posições
        int[] vetor11 = {1,2,3,4,5,6,7,8,9,10,11};

        System.out.println("Vetor 10 posições (antes):");
        controller.mostrarVetor(vetor10);

        controller.inverterVetor(vetor10, 0, vetor10.length - 1);

        System.out.println("Vetor 10 posições (depois):");
        controller.mostrarVetor(vetor10);

        System.out.println("---------------------------");

        System.out.println("Vetor 11 posições (antes):");
        controller.mostrarVetor(vetor11);

        controller.inverterVetor(vetor11, 0, vetor11.length - 1);

        System.out.println("Vetor 11 posições (depois):");
        controller.mostrarVetor(vetor11);
    }
}