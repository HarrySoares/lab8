package lab8;

public class Main {
    
    public static void main(String ... args){
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
       carrinho.adicionaItem(new Item("livro x", 50, 500) ); 
       carrinho.adicionaItem(new Item("tenis y", 800, 1000)); 

        
       
        PagamentoStrategy strategy = new PixPagamento();
        carrinho.realizaPagamento(strategy);
        
        
        FreteStrategy freteStrategy = new SedexFrete();
        double valorFrete = carrinho.calculaFrete(freteStrategy);
        System.out.println("Valor do frete (Sedex): " + valorFrete);
        
       
        freteStrategy = new NormalFrete();
        valorFrete = carrinho.calculaFrete(freteStrategy);
        System.out.println("Valor do frete (Normal): " + valorFrete);
    }
}