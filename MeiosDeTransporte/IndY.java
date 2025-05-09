public class IndY extends Carro {
    public IndY(String nome, double capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void mover() {
        System.out.println("IndY em alta velocidade.");
    }
}
