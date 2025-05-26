import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criar produtos
        Produto produto1 = new Produto("Coca-Cola", 5.0, 101);
        Produto produto2 = new Produto("Chocolate", 3.5, 202);

        // Criar gôndolas
        Gondola gondola1 = new Gondola(produto1, 10);
        Gondola gondola2 = new Gondola(produto2, 15);

        // Criar vending machine
        VendingMachine vendingMachine = new VendingMachine(2);
        vendingMachine.adicionarGondola(gondola1);
        vendingMachine.adicionarGondola(gondola2);

        // Simular reabastecimento
        Produto[] produtosReabastecidos = {produto1, produto2};
        int[] quantidades = {5, 10};
        vendingMachine.receberReabastecimento(produtosReabastecidos, quantidades);

        // Imprimir status
        System.out.println(vendingMachine.enviarMensagemReabastecimento());
    }
}

/*class Main 
{
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        
        Produto produto1 = new Produto("Chocolate", 15.99, 123);
        Produto produto2 = new Produto("Biscoito", 4.99, 124);
        
        produtos.add(produto1);
        produtos.add(produto2);
        
        for (Produto produto : produtos) {
            produto.exibirInfo();
        }
    }
}*/

// exercicio 9
/*
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Leite", 4.50, 101));
        produtos.add(new Produto("Café", 12.00, 102));
        produtos.add(new Produto("Açúcar", 3.80, 103));

        for (Produto p : produtos) {
            p.exibirInfo();
        }
    }
}

// exercicio 10
/*
public class Main 
{
    public static void main(String[] args) 
    {
        // Criando alguns produtos
        Produto p1 = new Produto("Açúcar Orgânico", 5.50, 201);
        Produto p2 = new Produto("Farinha de Trigo", 2.80, 202);
        Produto p3 = new Produto("Chocolate Amargo", 10.00, 203);

        // Lista de produtos
        Produto[] produtos = { p1, p2, p3 };

        // Pesquisa por palavra "Açúcar"
        String busca = "açúcar";

        System.out.println("Produtos que contêm a palavra '" + busca + "':");
        for (Produto p : produtos) 
        {
            if (p.nomeContem(busca)) 
            {
                p.exibirInfo();
            }
        }
    }
} 
*/ 
