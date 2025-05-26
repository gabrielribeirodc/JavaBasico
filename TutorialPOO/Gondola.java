public class Gondola 
{
    private Produto produto;
    private int quantidade;
    private int capacidadeMaxima;

    public Gondola(Produto produto, int capacidadeMaxima) 
    {
        this.produto = produto;
        this.quantidade = 0;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public boolean adicionarProduto(int quantidadeAdicionar) 
    {
        if (this.quantidade + quantidadeAdicionar <= capacidadeMaxima) 
        {
            this.quantidade += quantidadeAdicionar;
            return true;
        }
        return false; // Não foi possível adicionar todos os produtos
    }

    public boolean removerProduto(int quantidadeRemover) 
    {
        if (this.quantidade >= quantidadeRemover) 
        {
            this.quantidade -= quantidadeRemover;
            return true;
        }
        return false; // Não foi possível remover todos os produtos
    }

    // Getters e Setters
    public Produto getProduto() 
    {
        return produto;
    }

    public int getQuantidade() 
    {
        return quantidade;
    }

    public void setQuantidade(int quantidade) 
    {
        this.quantidade = quantidade;
    }

    public int getCapacidadeMaxima() 
    {
        return capacidadeMaxima;
    }
}