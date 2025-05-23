package ResolucaoVetor;
/*
4. Faça um algoritmo que apresente na tela as tabuadas de 1 até 10. Para isto, utilize apenas
dois vetores como elementos de multiplicação.
 */
public class ExercicioQuatroVetor {
    public static void main(String[] args) {
       int[] vetorUm = new int[10];
       int[] vetorDois = new int[vetorUm.length];

       for(int i = 0; i < vetorUm.length; i++){
           vetorUm[i] = i+1;
           vetorDois[i] = vetorUm[i];

           System.out.printf("%d * %d = %d\n", vetorUm[i], vetorDois[i], vetorUm[i] * vetorDois[i]);
       }

    }
}
