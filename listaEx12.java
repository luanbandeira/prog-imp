import java.util.Scanner;
public class listaEx12 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String [] args){
        double [] valores = new double [5];
        lerNumeros(valores);
        imprimeNumeros(valores);
        double maior = localizarMaior(valores);
        System.out.println("maior numero da lista é: "+ maior);
        double menor = localizaMenor(valores);
        System.out.println("menor numero da lista é: "+ menor);
        double media = calcularMedia(valores);
        System.out.println("media dos valores da lista é: "+ media);

    }


    public static void lerNumeros(double [] v){
        for(int i = 0; i<v.length; i++){
            System.out.println("digite o "+(i+1)+ "° numero: ");
            v[i] = input.nextDouble();
        }
    }

    public static double localizarMaior(double [] v){
        double maiorNum = -999;
        for (int i = 0; i<v.length;i++){
            if (v[i]>maiorNum){
                maiorNum=v[i];
            }
        }
        return maiorNum;
    }

    public static double localizaMenor(double [] v){
        double menorNum = 999;

        for (int i = 0; i< v.length; i++){
            if(v[i]<menorNum){
                menorNum = v[i];
            }
        }
        return menorNum;
    }

    public static double calcularMedia(double [] v){
        double media = 0;
        double soma = 0;

        for (int i =0; i<v.length;i++){
            soma += v[i];
        }
        media = soma/v.length;
        return media;
    }

    public static void imprimeNumeros(double [] v){
        for (int i = 0; i<v.length;i++){
            System.out.println((i+1)+"° numero: "+ v[i]);
        }
    }

    
    
}
