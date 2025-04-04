import java.util.Scanner;
public class listaEx10 {
    public static Scanner input = new Scanner(System.in);

    public static void main (String [] args){
        double [] notas = new double[15];

        lerNotas(notas);
        double media = calcularMedia(notas);
        System.out.println("média é = " + media);
    }

    public static void lerNotas(double [] v){
        for(int i = 0; i <v.length; i++){
            System.out.println("digite a " +(i+1) + "° nota: ");
            v[i] = input.nextDouble();
        }
    }

    public static double calcularMedia(double [] v){
        double soma = 0;
        for (int i = 0; i<v.length;i++){
            soma = v[i] + soma;
        }
        double media = soma/v.length;
        return media;
    }


}
