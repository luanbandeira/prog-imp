import java.util.Scanner;

public class Exemplo09 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double notas [] = new double[5];
        double media = 0;
        int posicao = 0, somatorio;

        recebeNotas(notas);
        imprimeNotas(notas);
        media= calcularMedia(notas);
        System.out.println("A MÉDIA DAS NOTAS DIGITADAS É: " + media);
        System.out.println("DIGITE A NOTA PARA SABER A POSIÇAO DELA: ");
        posicao = buscaPosicao(notas);
        System.out.println("NOTA PROCURADA ESTÁ NA " + posicao + "° POSIÇAO");
        somatorio = soma();
        System.out.println("soma é = "+ somatorio);

        buscaEquantoNaoNegativo(notas);
        


    }





    public static void recebeNotas(double [] v){
        for(int i = 0; i<v.length; i++){
            System.out.println("DIGITE A "+ (i+1)+"° NOTA: ");
            v[i] = input.nextDouble();
        }
    }



    public static void imprimeNotas(double [] v){
        for(int i = 0; i < v.length; i++){
            System.out.println((i+1)+ "° NOTA: " + v[i] );
        }
    }


    public static double calcularMedia(double [] v){
        double soma = 0;
        for (int i = 0; i < v.length; i++ ){
            soma += v[i];
        }
        return soma/v.length;
    }

    public static int buscaPosicao(double [] v){
        double x = input.nextDouble();
        for(int i = 0; i < v.length; i++){
            if (v[i] == x) {

                return i + 1;
                
            }
        }
        return -1;
    }


    public static int soma(){
        System.out.println("digite o 1° numero: ");
        int a = input.nextInt();

        System.out.println("digite o 2° numero: ");
        int b = input.nextInt();

        return a + b;
    }


    public static void buscaEquantoNaoNegativo(double [] v){
        double nota;
        System.out.println("digite uma nota para buscar sua posição: ");
        nota = input.nextDouble();

        while (nota >= 0.0) {
            for (int i = 0; i< v.length; i++){
                if (v[i] == nota) {
                    System.out.println("NOTA ENCONTRADA NA " + (i+1)+ "° POSIÇAO");
                }
            }
            System.out.println("DIGITE UMA NOTA PARA BUSCAR SUA POSIÇAO OU (-1 para encerrar): ");
            nota = input.nextDouble();

        }
    }
}