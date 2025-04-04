import java.util.Scanner;
/*EXERCICIO 2 CALCULO DE QUANTIDADE OPERADOR INCREMENTADOR PARA SOMA USO DE FOR SABENDO QUANTAS VEZES REPETIR */
public class Exemplo02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtdMulher = 0, qtdHomem = 0, sexo;

        for(int i = 0; i< 10; i++){
            System.out.print("digite 1-MULHER OU 2-HOMEM: ");
            sexo = input.nextInt();

            if (sexo == 1){
                qtdMulher++;
            } else if (sexo == 2){
                qtdHomem++;
            } else{
                System.out.println("SEXO INVÁLIDO");
            }
        }

        System.out.println("QUANTIDADE DE HOMEMS FOI: "+ qtdHomem);
        System.out.println("QUANTIDADE DE MULHERES FOI: "+ qtdMulher);

    }
}