public abstract class MeioDeTransporte {
    private String nome;
    private double capacidade;

    public MeioDeTransporte(String nome, double capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public abstract void mover();

    public String getNome() {
        return nome;
    }

    public double getCapacidade() {
        return capacidade;
    }
}