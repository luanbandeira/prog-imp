import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String operacao = " ";
        int num1, num2, resultado=0;

        System.out.print("digite o Primeiro Número: ");
        num1 = input.nextInt();

        System.out.print("digite o Segundo Número: ");
        num2 = input.nextInt();
        input.nextLine();

        System.out.println("Agora digite a operação que dejesa realizar: ");
        System.out.println("Digite '+' para soma");
        System.out.println("Digite '-' para subtrair");
        System.out.println("Digite '/' para dividir");
        System.out.println("Digite '*' para multiplicar");
        operacao = input.nextLine();

        if (operacao.equals("+")) {
            resultado = num1 + num2;
            
        } else if (operacao.equals("-")) {
            resultado = num1 - num2;

        } else if (operacao.equals("/")) {
            resultado = num1 / num2;
            
        } else if (operacao.equals("*")){
            resultado = num1 * num2;
        } else{
            System.out.println("operação inválida");

        }

        System.out.println("RESULTADO DA OPERAÇAO: " + resultado);
    }
    
}
