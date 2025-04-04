import java.util.Scanner;
public class listaEx17 {
    public static Scanner input = new Scanner(System.in);

    public static void main (String [] args){
        double [] numeros = new double [10];
        lerNumeros(numeros);
        zerarNegativos(numeros);
        imprimirNumeros(numeros);
    }

    public static void lerNumeros(double [] v){
        for (int i = 0; i< v.length; i++){
            System.out.println("digite o "+ (i+1)+ "° numero: ");
            v[i] = input.nextDouble();
        }
    }

    public static void zerarNegativos(double [] v){
        for (int i = 0; i< v.length; i++){
            if(v[i]< 0 ){
                v[i] = 0;
            }
        }
    }

    public static void imprimirNumeros(double [] v){
        for(int i = 0; i< v.length; i++){
            System.out.println((i+1)+ "° numero: "+ v[i]);
        }
    }
}
