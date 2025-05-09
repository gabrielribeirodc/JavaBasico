public class Carro extends Automovel {
    public Carro(String nome, double capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void mover() {
        System.out.println("Carro de passeio.");
    }
}
