package ResolucaoVetor;
import java.util.Arrays;
import java.util.Random;

public class ExercicioDoisVetor {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetorUm = new int[5];
        int[] vetorDois = new int[vetorUm.length];
        int[] soma = new int[vetorUm.length];

        for(int i = 0; i < vetorDois.length; i++){
            vetorUm[i] = random.nextInt(999);
            vetorDois[i] = random.nextInt(999);

            soma[i] = vetorUm[i] + vetorDois[i];
        }


        System.out.println("Vetor um: " + Arrays.toString(vetorUm));
        System.out.println("Vetor dois: " + Arrays.toString(vetorDois));
        System.out.println("Vetor de soma: " + Arrays.toString(soma));
    }
}
