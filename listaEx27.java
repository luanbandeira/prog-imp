import java.util.Scanner;
import java.lang.Math;
public class listaEx27 {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String [] args){
        int [] lista = new int [10];
        lerNumeros(lista);
        verificaPrimos(lista);
    }

    public static void lerNumeros(int [] v){
        for (int i = 0; i< v.length; i++){
            System.out.println("digite o "+(i+1)+"° numero: ");
            v[i] = input.nextInt();
        }
    }

    public static void verificaPrimos(int [] v){
        for (int i = 0; i< v.length; i++){
            int contadorDivisores = 0;
            for(int j = 2; j <= Math.sqrt(v[i]); j++){
                if((v[i]%j) == 0  ){
                    contadorDivisores +=1;
                }


            }
            if (contadorDivisores == 0) {
                System.out.println((i+1)+"° POSIÇAO " + v[i] + " é numero primo!");
            
            }

        }
    }
    
}
