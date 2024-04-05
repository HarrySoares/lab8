package lab8;

public class PixPagamento implements PagamentoStrategy {
    @Override
    public void pagar(int total) {
        System.out.println("Pagamento realizado com Pix no valor de R$ " + total);
    }
}