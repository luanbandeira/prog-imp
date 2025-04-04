import java.util.Scanner;
public class listaEx07 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String [] args){
        int [] numeros = new int [10];
        lerNumeros(numeros);
        imprimirNumeros(numeros);
        acaharMaior(numeros);

    }

    public static void lerNumeros(int [] v){
        for (int i = 0; i< v.length; i++){
            System.out.println("digite o "+ (i+1) + "° número:");
            v[i] = input.nextInt();
        }
    }

    public static void imprimirNumeros(int [] v){
        for(int i = 0; i< v.length; i++){
            System.out.println((i+1)+"°: " + v[i]);
        }
    }

    public static void acaharMaior(int [] v){
        int maiorNum = -1000;
        int posicao = 0;
        for(int i = 0; i< v.length; i++){
            if(v[i]> maiorNum){
                maiorNum = v[i];
                posicao = (i+1);
            }
        }
        System.out.println("MAIOR NUMERO DA LISTA É: "+ maiorNum);
        System.out.println("O MAIOR NÚMERO ESTÁ NA - "+ posicao+"° posição");

    }
}


