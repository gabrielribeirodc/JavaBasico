public class F1 extends Carro {
    public F1(String nome, double capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void mover() {
        System.out.println("F1 correndo na pista.");
    }
}
