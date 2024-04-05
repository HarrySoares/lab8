package lab8;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    List<Item> items = new ArrayList<>();
    
    public void adicionaItem(Item item){
        items.add(item);
    }
    
    public void removeItem(Item item){
        items.remove(item);
    }
    
    public int calculaTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPreco();
        }
        return sum;
    }

    public void realizaPagamento(PagamentoStrategy strategy){
        int total = this.calculaTotal();
        strategy.pagar(total);
    }
    
    // Método para calcular o frete com base em uma estratégia (Sedex ou Normal)
    public double calcularFrete(FreteStrategy freteStrategy){
        int pesoTotal = 0;
        for(Item item : items){
            pesoTotal += item.getPeso();
        }
        return freteStrategy.calcularFrete(pesoTotal);
    }

    double calculaFrete(FreteStrategy freteStrategy) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}