package ResolucaoVetor;
import java.util.Arrays;
import java.util.Random;
/*
5. Faça um programa onde o usuário irá popular com números do tipo double um vetor com 10
posições. Ao final exiba na tela o maior e o menor valor digitado.
 */
public class ExercicioCincoVetor {
    public static void main(String[] args) {
        Random random = new Random();

        double[] vetorUm = new double[10];
        double menor = 999;
        double maior = 0;

        for(int i = 0; i < vetorUm.length; i++){
            vetorUm[i] = random.nextDouble(999);

            if(vetorUm[i] < menor) menor = vetorUm[i];
            else if (vetorUm[i] > maior) maior = vetorUm[i];
        }
        System.out.println(Arrays.toString(vetorUm));
        System.out.printf("Menor valor: %.2f\ṇ̣Maior valor: %.2f", menor, maior);
    }
}
