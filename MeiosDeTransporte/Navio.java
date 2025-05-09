public class Navio extends MeioDeTransporte {
    public Navio(String nome, double capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void mover() {
        System.out.println("Navio navegando no mar.");
    }
}
