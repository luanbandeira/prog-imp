import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valorInicial = 0, incremento = 0, qtdTermos = 0, valorFinal = 0, numero=0;

        System.out.println("DIGITE O VALOR INICIAL DA SEQUENCIA: ");
        valorInicial = input.nextInt();

        System.out.println("DIGITE O VALOR DO FATOR DE INCREMENTO: ");
        incremento = input.nextInt();

        System.out.println("DIGITE A QUANTIDADE DE TERMOS QUE VOCÊ QUER: ");
        qtdTermos = input.nextInt();

        

        for(int i = 0; i< qtdTermos -1; i++){
            numero = valorInicial + (incremento*i);
            System.out.print(numero + ", ");
        }
        System.out.print(valorInicial + (incremento*qtdTermos - incremento) + ".");
        
    }
}
