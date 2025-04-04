import java.util.Scanner;

public class ex01 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int diasAtraso = 0;
        double valorConta = 0, valorMulta = 0, juros = 0, valorFinal = 0, multa = 0, valorJuros = 0;


        System.out.print("DIGITE O VALOR DA CONTA: ");
        valorConta = input.nextDouble();

        System.out.print("DIGITE O VALOR DE % DA MULTA: ");
        multa = input.nextDouble();

        System.out.print("DIGITE O VALOR DE % DOS JUROS: ");
        juros = input.nextDouble();

        System.out.println("DIGITE A QUANTIDADE DE DIAS QUE A CONTA ESTÁ VENCIDA: ");
        diasAtraso = input.nextInt();
        if (diasAtraso > 45) {
            System.out.println("NÃO É POSSÍVEL CALCULAR CONTAS COM MAIS DE 45 DIAS DE ATRASO");
            
        }else{
        valorMulta = valorConta * (multa/100);
        valorJuros = valorConta * (juros/100) * (diasAtraso/30.0);
        valorFinal = valorConta + valorJuros + valorMulta;
    }
        System.out.println(String.format("O VALOR FINAL DA CONTA É: %.2f", + valorFinal));

        

    }
}