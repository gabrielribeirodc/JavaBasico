class Produto {
    private String nome;
    private double preco;
    private int codigo;
    
    // Getters
    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    void exibirInfo() {
        System.out.println("Nome: " + nome + ", Preço: " + preco + ", Código: " + codigo);
    }
}

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Chocolate");
        produto.setPreco(15.99);
        produto.setCodigo(123);
        produto.exibirInfo();
    }
}
