import java.util.Scanner;
import java.util.Random;
public class Exemplo10 {
    public static Scanner input = new Scanner(System.in);
    public static Random geradorRandom = new Random();
    public static void main (String[] args){
        int [] numeros = new int [1000];
        preenchendoCrescente(numeros);
        embaralhando(numeros);
        imprimindo(numeros);
        int num = busca(numeros, 999, 1000);
        System.out.println("numero encontrado na posição "+ num + "°");

    }

    public static int busca(int[] v, int tam, int x) {
        for (int i = 0; i < tam; i += 1) {
            if (v[i] == x) {
                return i+1 ;
            }
        }
        return -1;
    }

    public static void preenchendoCrescente(int [] v){
        for(int i = 0; i< v.length; i++){
            v[i] = i + 1;
        }
    }

    public static void embaralhando(int [] v){

        for(int i = 0; i< v.length; i++){
            int posicaoAleatoria = geradorRandom.nextInt(v.length);
            int aux = v[i];
            v[i] = v[posicaoAleatoria];
            v[posicaoAleatoria] = aux;
        }

    }

    public static void imprimindo(int [] v){
        for(int i = 0; i< v.length; i++){
            System.out.println((i+1)+ "° posição: "+ v[i]);
        }
    }


    
}
