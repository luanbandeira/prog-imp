import java.util.Scanner;
public class listaEx14 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String [] args){
        int [] numeros = new int [10];
        lerNumeros(numeros);
        verificaIguais(numeros);
    }

    public static void lerNumeros(int [] v){
        for (int i = 0; i< v.length; i++){
            System.out.println("digite o "+ (i+1) + "° número: ");
            v[i] = input.nextInt();
        }
    }

    public static void verificaIguais(int [] v){
        int [] repetidos = new int [10];
        for (int i = 0; i<v.length; i++){
            for(int j = (i+1);j<v.length;j++){
                if (v[i] == v[j]) {
                    repetidos[i] = v[j];
                          
                }
            }
        }
        for (int i = 0; i<repetidos.length; i++){

            if (repetidos[i] != 0) {
                System.out.println("REPETIDO: "+ repetidos[i]);
                
            }
        }
    }
    
}
