public class Utilitario extends Automovel {
    public Utilitario(String nome, double capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void mover() {
        System.out.println("Utilitário para transporte versátil.");
    }
}
