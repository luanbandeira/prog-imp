
import java.util.Random;
public class exFrequencia {
public static Random gerarAleatorio = new Random();
public static final int tam = 200;

public static void main (String [] args){
    int [] numeros = new int [tam];
    preencherAleatorio(numeros);
    //contarRepetidos(numeros);
    contaRepetidos2(numeros);
    imprimir(numeros);
}

public static void preencherAleatorio(int [] v){
    for (int i = 0; i< tam; i++){
        v[i]= gerarAleatorio.nextInt(20)+1;
    }
}

public static void contaRepetidos2(int [] v ){
    int [] repeticoes = new int [20];
    for (int i = 0; i <= tam; i++){
        for (int j = 1; j <= repeticoes.length ;j++ ){
            if (v[i] == j) {
                repeticoes[j] +=1 ;
                
            }
        }

    }


    for (int i = 0; i< v.length; i++){
        System.out.println(i+1 + "repetiu "+ repeticoes[i]+ "vezes");
    }

}

public static void contarRepetidos(int[] v){
    for (int i = 1; i< 21; i++){
        int cont = 0; 
        for(int j = 0; j< tam; j++){
            if (i == v[j]) {
                cont += 1;
                
            }
        }

        System.out.println(i + " repetido "+ cont + " vezes");

    }

}

public static void imprimir(int [] v){
    for (int i = 0; i< tam; i++){
        System.out.println(v[i]);
    }
}

    
}
