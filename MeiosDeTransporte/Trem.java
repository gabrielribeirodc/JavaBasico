public class Trem extends MeioDeTransporte {
    public Trem(String nome, double capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void mover() {
        System.out.println("Trem se movendo nos trilhos.");
    }
}
