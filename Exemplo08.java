import java.util.Scanner;

public class Exemplo08 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double[] notas = new double[5];
        double  media = 0, nota = 0;
        int posicao;
 
        // Digitação de todas as notas
        digitacaoNotas(notas);

        // Impressão das notas digitadas
        impressaoNotas(notas);

        // Cálculo da média
        media = calcularMedia(notas);
        System.out.println("a média das notas é: "+ media);

        // Impressão das notas acima da média da turma
        System.out.println("notas acima da média: ");
        impressaoNotasAcimaMedia(notas, media);


        // Impressão da posição da nota procurada
        System.out.println("digite a nota para saber a posição: ");
        nota = input.nextDouble();
        posicao = buscaPosicao(notas, nota);

        // Ipressão notas azima de 7
        System.out.println("NOTAS ACIMA DE 7: ");
        impressaoNotasMaiorValor(notas, 7.0);
    }




    public static void digitacaoNotas(double[] v){
        for (int i = 0; i < v.length; i += 1) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            v[i] = input.nextDouble();
        }

    }

    public static void impressaoNotas(double[] v){
        System.out.println("\nNotas Digitadas:");
        for (int i = 0; i < v.length; i += 1) {
            System.out.println((i + 1) + "ª nota: " + v[i]);
        }
    }

    public static double calcularMedia(double[] v){
        double soma = 0.0;
        for (int i = 0; i < v.length; i += 1) {
            soma += v[i];
            
        }
        return soma / v.length;   
    }

    public static void impressaoNotasAcimaMedia (double [] v, double media){
        for (int i=0; i<v.length; i++){
            if (v[i]> media) {
                System.out.println(v[i]);
            }
        }

    }



    public static int buscaPosicao(double[] v, double nota){
        for (int i = 0; i< v.length;i++){
            if (v[i] == nota ) {
                System.out.println((i+1) + "° posição");;
            }
        }
        return -1;
    }

    public static double impressaoNotasMaiorValor(double[] v, double z){
        for (int i = 0; i< v.length; i++){
            if (v[i]> z) {
                System.out.println(v[i]);
                
            }
        }
        return -1;
    }
    
}
