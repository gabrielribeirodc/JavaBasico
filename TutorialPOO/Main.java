import java.util.ArrayList;

class Main 
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
}

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
}*/
