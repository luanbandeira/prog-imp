import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int idade= 0, qtdPessoas,sexo=0, idadeMaiorPeso= 0,contHomensMenos30=0, contMulherMenos50Kg = 0, totalH= 0, totalM=0;
        double peso =0,  maiorPeso = 0, somaPesosMenor30 = 0, mediaPHomensMenor30= 0, percentualMulheresMenos50Kg;
        
        System.out.println("QUANTAS PESSOAS TEM NO GRUPO: ");
        qtdPessoas = input.nextInt();

        for(int i = 1; i<= qtdPessoas;i++){
            System.out.println("DIGITE O SEXO DA " + i + "° PESSOA \n 1- MASCULINO \n 2- FEMININO");
            sexo = input.nextInt();
            if (sexo != 1 && sexo != 2) {
                System.out.println("SEXO INVÁLIDO");
                System.out.println("DIGITE O SEXO DA " + i + "° PESSOA \n 1- MASCULINO \n 2- FEMININO");
                sexo = input.nextInt();

            }

            System.out.println("DIGITE A IDADE DA "+ i + "° PESSOA: ");
            idade = input.nextInt();

            System.out.println("DIGITE O PESO DA "+ i + "° PESSOA: ");
            peso = input.nextDouble();


            if (sexo == 1) {
                totalH++;
                
            }else if (sexo == 2) {
                totalM++;
            }
    
            if (peso > maiorPeso) {
                idadeMaiorPeso = idade;
            }
    
            if (idade<30 && sexo == 1) {
                contHomensMenos30++;
                somaPesosMenor30 = peso + somaPesosMenor30;

                
            }
    
            if (sexo == 2 && peso < 50 ) {
                contMulherMenos50Kg++;
            }
        }

        System.out.println("IDADE DA PESSOA MAIS PESADA É: "+ idadeMaiorPeso + " anos");

        mediaPHomensMenor30 = somaPesosMenor30/contHomensMenos30;
        System.out.println("A MEDIA DE PESO DOS HOMENS COM MENOS DE 30 ANOS É DE: "+ mediaPHomensMenor30+ " KG");

        percentualMulheresMenos50Kg = (contMulherMenos50Kg/totalM)*100;
        System.out.println("O PERCENTUAL DE MULHERES COM MENOS DE 50KG É: "+ percentualMulheresMenos50Kg+ "%");

        input.close();




        


    }

    
}
