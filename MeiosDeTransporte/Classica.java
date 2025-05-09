public class Classica extends Carro {
    public Classica(String nome, double capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void mover() {
        System.out.println("Carro clássico passeando.");
    }
}
