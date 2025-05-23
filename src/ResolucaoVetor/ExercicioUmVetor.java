package ResolucaoVetor;
import java.util.Arrays;
import java.util.Random;

public class ExercicioUmVetor {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetorUm = new int[10];
        int[] vetorDois = new int[vetorUm.length];
        for (int i = 0; i < vetorUm.length; i++) vetorUm[i] = random.nextInt(999);
        for(int i = 0; i<vetorUm.length; i++) vetorDois[i] = vetorUm[i];

        System.out.println("Valores do primeiro vetor");
        for(int i:vetorUm) System.out.println(i);

        System.out.println("-------------------------------------------------------");
        System.out.println("Valores do segundo vetor");
        for(int i:vetorDois) System.out.println(i);


        //ou podemos fazer dessa forma:
        System.out.println("Vetor um: " + Arrays.toString(vetorUm));
        System.out.println("Vetor dois: " + Arrays.toString(vetorDois));
    }
}

