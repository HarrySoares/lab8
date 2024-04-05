package lab8;


public class Item {
    private int preco;
    private int peso;
    private String nome;
    
    public Item(String nome, int preco, int peso){
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getPeso() {
        return peso;
    }
}