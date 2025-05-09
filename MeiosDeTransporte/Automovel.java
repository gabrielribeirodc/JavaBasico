public class Automovel extends MeioDeTransporte {
    public Automovel(String nome, double capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void mover() {
        System.out.println("Automóvel se movendo na estrada.");
    }
}