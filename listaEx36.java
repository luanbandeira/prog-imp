import java.util.Scanner;
public class listaEx36 {
    public static Scanner input = new Scanner(System.in);

    public static void main (String [] args){
        double [] lista = new double [10];
        lerNumeros(lista);
        ordenarNumeros(lista);
        imprimirLista(lista);
    }

    public static void lerNumeros(double [] v){
        for (int i = 0 ; i < v.length; i++){
            System.out.println("digite o "+ (i+1) + "° numero: ");
            v[i] = input.nextDouble();
        }
    }

    public static void ordenarNumeros(double [] v){
        double aux = 0;
        for(int i = 0; i< v.length; i++){
            for (int j = i+1; j< v.length; j++){
                if(v[j]<v[i]){
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
    }

    public static void imprimirLista(double [] v){
        for (int i = 0; i< v.length; i++){
            System.out.println((i+1)+ "° numero: "+ v[i]);
        }
    }
    
}
