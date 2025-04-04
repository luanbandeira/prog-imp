import java.util.Scanner;
public class ex02{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        double precoProduto = 0, descontoCategoria = 0., descontoQtd = 0, totalCompra= 0, economia= 0, novoPrecoProduto;
        int categoriaProduto, qtd;
        do{
        System.out.println("DIGITE QUAL A CATEGORIA DO PRODUTO: \n CATEGORIA- 1 \n CATEGORIA- 2\n CATEGORIA- 3");
        categoriaProduto= input.nextInt();
        if (categoriaProduto == 1) {
            descontoCategoria = 0.1;
        }else if (categoriaProduto == 2) {
            descontoCategoria = 0.15;
        }else if (categoriaProduto == 3) {
            descontoCategoria = 0.08;
        } else{
            System.out.println("categoria inválida!");
        }
    }while(categoriaProduto < 1 || categoriaProduto > 3 );

        System.out.println("DIGITE O PREÇO DO PRODUTO: ");
        precoProduto = input.nextDouble();

        System.out.println("DIGITE A QUANTIDADE DE ITENS: ");
        qtd = input.nextInt();

        if (qtd<=2) {
            descontoQtd = 0.02;
        }else if (qtd<=10) {
            descontoQtd = 0.05;
            
        }else{
            descontoQtd= 0.1;
        }

        novoPrecoProduto = (precoProduto  * (1- descontoCategoria));
        novoPrecoProduto = (novoPrecoProduto * (1- descontoQtd));
        totalCompra = novoPrecoProduto * qtd;
        economia = (precoProduto * qtd)- (novoPrecoProduto * qtd);
        

        System.out.println("O NOVO PREÇO INDIVIDUAL DO PRODUTO É: "+ novoPrecoProduto);
        System.out.println("O TOTAL DA COMPRA É: "+ totalCompra);
        System.out.println("VOCÊ ECONOMIZOU :" + economia +"reais");
            
            



    }


}