package lab8;


public class CartaoPagamento implements PagamentoStrategy {
    @Override
    public void pagar(int total) {
        System.out.println("Pagamento realizado com Cartão no valor de R$ " + total);
    }
}
