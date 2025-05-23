package resolucao;
import java.util.Arrays;
import java.util.Scanner;
public class resolucao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[vetor1.length];
        int[] vetorResultado = new int[vetor1.length];
        System.out.println("Digite 5 números para o vetor 1: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Vetor1[" + (i+1) + "]: ");
            vetor1[i] = input.nextInt();

        }


        System.out.println("\nDigite mais 5 números para o vetor 2 : ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Vetor2[" + i + "]: ");
            vetor2[i] = input.nextInt();

        }
        for (int i = 0; i < 5; i++) {
            vetorResultado[i] = vetor1[i] + vetor2[i];
        }


//        System.out.println("\nVetor 1:");
//        for (int i = 0; i < 5; i++) {
//            System.out.print(vetor1[i] + " ");
//        }
//
//        System.out.println("\nVetor 2:");
//        for (int i = 0; i < 5; i++) {
//            System.out.print(vetor2[i] + " ");
//        }
//
//        System.out.println("\nVetor Resultado: ");
//        for (int i = 0; i < 5; i++) {
//            System.out.print(vetorResultado[i] + " ");
//        }
        System.out.println(Arrays.toString(vetor1));

        input.close();
    }
}
