import java.util.Scanner;

public class ordenacao {
    public static Scanner input = new Scanner(System.in);
    public static void main (String [] args){
        int [] numeros = new int[10];
        lerNum(numeros);
        ordenar(numeros);
        imprimir(numeros);
    }


    public static void lerNum(int [] v){
        for(int i = 0; i< v.length; i++){
            v[i]= input.nextInt();
        }

    }


    public static void ordenar(int [] v){
        int aux = 0;
        for(int i = 0; i< v.length;i++){
            for(int b = i+1; b<v.length;b++){
                if(v[i]>v[b]){
                    aux  = v[i];
                    v[i] = v[b];
                    v[b] = aux; 
                }
            }
        }
    }

    public static void imprimir(int [] v){
        System.out.println("ARRUMADOS");
        for (int i = 0; i< v.length;i++){
            System.out.print(v[i] + ", ");
        }
    }

}
