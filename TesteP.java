import java.util.Scanner;


public class TesteP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limite = 100, num;
        int qtdDivisores = 0;

        System.out.print("digite um número para verificar se ele é primo: ");
        num = input.nextInt();
        for (int divisores = 2; divisores <= Math.sqrt(num); divisores++){
            if (num % divisores == 0) {
                qtdDivisores++;
                break;
            }
        }
        if (qtdDivisores == 0) {
            System.out.println(num + " É um número primo!");
            
        } else{
            System.out.println(num + " NÃO é um número primo! ");
        }
        
    }
}
