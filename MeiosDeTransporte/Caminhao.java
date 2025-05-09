public class Caminhao extends Automovel {
    public Caminhao(String nome, double capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void mover() {
        System.out.println("Caminhão transportando carga.");
    }
}
