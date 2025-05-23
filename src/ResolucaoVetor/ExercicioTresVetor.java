package ResolucaoVetor;
import java.util.Arrays;
import java.util.Random;

/*
3. Faça um algoritmo que realize a união de dois vetores de mesmo tamanho e tipo em um
terceiro vetor com o dobro do tamanho dos dois primeiros.
 */
public class ExercicioTresVetor {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetorUm = new int[5];
        int[] vetorDois = new int[vetorUm.length];
        int[] vetorTres = new int[vetorUm.length * 2];

        for(int i = 0; i < vetorUm.length; i++){
            vetorUm[i] = random.nextInt(999);
            vetorDois[i] = random.nextInt(999);
            vetorTres[i] = vetorUm[i];
            vetorTres[vetorUm.length + i] = vetorDois[i];
        }

        System.out.println("Vetor um: " + Arrays.toString(vetorUm));
        System.out.println("Vetor dois: " + Arrays.toString(vetorDois));
        System.out.println("Vetor três: " + Arrays.toString(vetorTres));
    }
}
