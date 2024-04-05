package lab8;


public class SedexFrete implements FreteStrategy {
    @Override
    public double calcularFrete(int pesoTotal) {
        // Lógica para calcular o frete utilizando Sedex
        return pesoTotal * 0.5; // Exemplo simples de cálculo de frete
    }
}