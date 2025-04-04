import java.util.Scanner;

public class listaEx06 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int [] numeros = new int [10];
        lerNumeros(numeros);
        achaMaior(numeros);
        acharMenor(numeros);
    }

    public static void lerNumeros(int [] v ){
        for(int i = 0; i< v.length; i++){
            System.out.println("digite o "+ (i + 1) +"° número: ");
            v[i] = input.nextInt();
        }
    }

    public static void achaMaior(int [] v){
        int maiorNum = 0;
        for(int i = 0; i < v.length; i++){
            if (v[i]> maiorNum) {
                maiorNum = v[i];
                
            }
        }
        System.out.println("maior numero da lista é: "+ maiorNum);
    }

    public static void acharMenor(int [] v){
        int menorNum = 1000;
        for (int i = 0; i<v.length;i++){
            if (v[i]<menorNum){
                menorNum = v[i];
            }
        }
        System.out.println("O menor numero da lista é: "+ menorNum);
    }




}
