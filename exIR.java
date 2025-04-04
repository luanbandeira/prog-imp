import java.util.Scanner;

public class exIR {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double deducaoInicial = 564.80, rendimentosTributaveis = 0, baseDoCalculo = 0;
    double  vImpostoF2, vImpostoF3, vImpostoF4, vImpostoF5, valorFinal, aliquotaPercentual; 


    System.out.println("VAMOS CALCULAR SEU IMPOSTO SOBRE A RENDA MENSAL \n VAMOS UTILIZAR DE BASE O PERÍODO JANEIRO/2025");
    System.out.print("DIGITE O VALOR DOS SEUS RENDIMENTOS TRIBUTÁVEIS MENSAL: ");
    rendimentosTributaveis = input.nextDouble();

    baseDoCalculo = rendimentosTributaveis ;

    if (baseDoCalculo < 2259.21) {
        System.out.println("USUÁRIO ISENTO DO PAGAMENTO!");
    }
    else if (baseDoCalculo <= 2826.65 ) {
        double aliquotaF2 = 0.075;
        vImpostoF2 = (baseDoCalculo - 2259.22) * aliquotaF2;
        aliquotaPercentual = (vImpostoF2/baseDoCalculo)*100;
        System.out.println("USUÁRIO DEVE PAGAR: " + vImpostoF2 + " R$");
        System.out.println("O PERCENTUAL É DE: "+ aliquotaPercentual + "%");
    }
    else if (baseDoCalculo <= 3751.05) {
        double aliquotaF3 = 0.15;
        vImpostoF3 = ((baseDoCalculo - 2826.66) * aliquotaF3) + 42.5588;
        aliquotaPercentual = (vImpostoF3/baseDoCalculo)*100;
        System.out.println("USUÁRIO DEVE PAGAR: "+ vImpostoF3 + " R$");
        System.out.println("O PERCENTUAL É DE: "+ aliquotaPercentual + "%");
    }
    else if (baseDoCalculo <= 4664.68) {
        double aliquotaF4 = 0.225;
        vImpostoF4 = ((baseDoCalculo - 3751.06) * aliquotaF4) + 42.5588 + 138.6600;
        aliquotaPercentual = (vImpostoF4/baseDoCalculo)*100;
        System.out.println("USUÁRIO DEVE PAGAR: "+ vImpostoF4 + "R$");
        System.out.println("O PERCENTUAL É DE: "+ aliquotaPercentual + "%");
    }
    else if (baseDoCalculo > 4664.68) {
        double aliquotaF5= 0.275;
        vImpostoF5 = ((baseDoCalculo - 4664.68) * aliquotaF5) + 42.5588 + 138.6600 + 205.5667;
        aliquotaPercentual = (vImpostoF5/baseDoCalculo)*100;
        System.out.println("USUÁRIO DEVE PAGAR: "+ vImpostoF5 + "R$");
        System.out.println("O PERCENTUAL É DE: "+ aliquotaPercentual + "%");
        
    }



}    
}
