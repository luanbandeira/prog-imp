import java.util.Scanner;
/* EXEMPLO 3 USO DE IF E ELSE */
public class Exemplo03{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("digite um número: ");
        num = input.nextInt();

        if (num < 0){
            System.out.println("numero digitado é negativo: " + num);
        } else if (num == 0){
            System.out.println("numéro é igual a ZERO");
        } else{
            System.out.println("O número é positivo: " + num);
        }
    }
}