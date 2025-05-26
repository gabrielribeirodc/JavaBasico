import java.util.ArrayList;
import java.util.List;

public class VendingMachine 
{
    private List<Gondola> gondolas;
    private int numeroPosicoes;

    public VendingMachine(int numeroPosicoes) 
    {
        this.numeroPosicoes = numeroPosicoes;
        this.gondolas = new ArrayList<>();
    }

    public void adicionarGondola(Gondola gondola) 
    {
        if (gondolas.size() < numeroPosicoes) 
        {
            this.gondolas.add(gondola);
        } 
        else 
        {
            System.out.println("Número máximo de gôndolas atingido.");
        }
    }

    public String enviarMensagemReabastecimento() 
    {
        StringBuilder mensagem = new StringBuilder();
        for (Gondola gondola : gondolas) 
        {
            mensagem.append("Produto: ").append(gondola.getProduto().getNome())
                    .append(", Quantidade atual: ").append(gondola.getQuantidade())
                    .append(", Capacidade máxima: ").append(gondola.getCapacidadeMaxima())
                    .append("\n");
        }
        return mensagem.toString();
    }

    public void receberReabastecimento(Produto[] produtosReabastecidos, int[] quantidades) 
    {
        if (produtosReabastecidos.length == quantidades.length && produtosReabastecidos.length == gondolas.size()) 
        {
            for (int i = 0; i < gondolas.size(); i++) 
            {
                Produto produtoReabastecido = produtosReabastecidos[i];
                int quantidade = quantidades[i];
                Gondola gondola = gondolas.get(i);

                if (produtoReabastecido != null && gondola.getProduto() != null &&
                    gondola.getProduto().getCodigo() == produtoReabastecido.getCodigo()
                   ) 
                {
                    gondola.adicionarProduto(quantidade);
                } 
                else 
                {
                    System.out.println("Produto " + produtoReabastecido.getNome() + " não corresponde à gôndola " + i);
                }
            }
        } 
        else 
        {
            System.out.println("Dados de reabastecimento inválidos.");
        }
    }

    // Getters
    public List<Gondola> getGondolas() {
        return gondolas;
    }

    public int getNumeroPosicoes() {
        return numeroPosicoes;
    }
}