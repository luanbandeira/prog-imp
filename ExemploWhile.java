import java.util.Scanner;

public class ExemploWhile {
    public static Scanner input = new  Scanner(System.in);
    public static void main(String[] args) {
        int num1, num2 , qtdinterv;
        System.out.print("digite um número inteiro: ");
        num1 = input.nextInt();

        System.out.print("Digite um numero inteiro maior que " +num1+ " : " );
        num2 = input.nextInt();


        while (num2 <= num1) {
            System.out.println("NUMERO INVÁLIDO");
            System.out.println("digite um número válido");
            num2 = input.nextInt();
            
        }

        qtdinterv = num2 - num1 + 1;
        System.out.println("Existem " + qtdinterv + " números no intervalo de " + num1 + " a" + num2);


    }
}
