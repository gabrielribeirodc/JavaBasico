public class Aviao extends MeioDeTransporte {
    public Aviao(String nome, double capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void mover() {
        System.out.println("Avião voando no céu.");
    }
}
