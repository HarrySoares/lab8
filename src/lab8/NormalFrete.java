package lab8;


public class NormalFrete implements FreteStrategy {
    @Override
    public double calcularFrete(int pesoTotal) {
        return pesoTotal * 0.3; 
    }
}