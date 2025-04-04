public class listaEx19 {
    public static void main (String [] args){
        double [] numeros = new double [50];
        preencherLista(numeros);
        imprimirLista(numeros);
    }

    public static void preencherLista(double [] v){
        for (int i = 0; i<v.length; i++){
            v[i] = (i+5*i)%(i+1);
        }
    }

    public static void imprimirLista(double [] v){
        for (int i = 0; i<v.length;i++){
            System.out.println((i+1)+"° numero: "+ v[i]);
        }
    }


}
