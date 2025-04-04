import java.util.Scanner;
/* EXEMPLO 4 USO DE IF E ELSE E TABELA DE IMC  */

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura, peso, imc;

        System.out.print("Digite seu peso: ");
        peso = input.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = input.nextDouble();
        
        imc = peso/(altura * altura);

        if (imc < 18.5){
            System.out.println("ABAIXO DO PESO");
        }  else if (imc < 25){
            System.out.println("PESO NORMAL");
        }  else if (imc < 30 ){
            System.out.println("SOBREPESO");
        }  else if (imc < 35){
            System.out.println("OBESIDADE GRAU 1");
        }  else if (imc <= 40){
            System.out.println("OBESIDADE GRAU 2");
        }  else if (imc >= 40){
            System.out.println("OBESIDADE GRAU 3");
        }

        



    }
}
