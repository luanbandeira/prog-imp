import java.util.Scanner;
public class listaEx11 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String [] args){
        double [] numeros = new double[10];
        lerNumeros(numeros);
        int quantidadeNegativos = contarNegativos(numeros);
        System.out.println("existem "+ quantidadeNegativos + " números negativos na lista.");
        double soma = somaPositivos(numeros);
        System.out.println("soma dos positivos é = " + soma);
    }

    public static void lerNumeros(double [] v){
        for(int i = 0; i<v.length;i++){
            System.out.println("digite o "+ (i+1) + "° número: ");
            v[i] = input.nextDouble();
        }
    }


    public static int contarNegativos(double [] v){
        int cont = 0;
        for(int i = 0; i<v.length;i++){
            if (v[i]<0){
                cont +=1;
            }
        }
        return cont;
    }

    public static double somaPositivos(double [] v){
        double soma = 0;
        for (int i = 0; i<v.length; i++){
            if (v[i]>= 0){
                soma +=v[i];
            }
            
        }
        return soma;
    }
}
