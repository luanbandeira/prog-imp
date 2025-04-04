import java.util.Random;

public class jogoDados {
    public static Random valorDado = new Random();
    public static void main(String[] args) {
        int d1, d2;
        
        int vitorias1 = 0;
        int vitorias2 = 0;
        int emaptes = 0;

        for(int i = 1; i<= 10; i++){
            d1 = valorDado.nextInt(6) +1;
            d2 = valorDado.nextInt(6) +1;
            if (d1 > d2) {
                System.out.println("Rodada: "+i+ " jogador 1 venceu por " +d1+ " x " + d2);
                vitorias1++;
                
            } else if (d2 > d1) {
                System.out.println("Rodada: "+i+ " jogador 2 venceu por " +d2+ " x " + d1);
                vitorias2++;
                
            } else{
                System.out.println("Rodada: "+i+ " EMPATOU EM:  " +d1+ " x " + d2);
                emaptes++;
            }
        }
        if (vitorias1 > vitorias2) {
            System.out.println("jogador 1 venceu a PARTIDA com " + vitorias1 + " rodadas vencidas e " + emaptes + " rodadas empatadas");
            
        }else if (vitorias2 > vitorias1) {
            System.out.println("jogador 2 venceu a PARTIDA com " + vitorias2 + " rodadas vencidas e " + emaptes + " rodadas empatadas");
            
        }else{
            System.out.println("acabou empatada a partida em: " + vitorias1+ " x " + vitorias2);
        }
    }
}
