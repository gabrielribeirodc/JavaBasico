public class StockCar extends Carro {
    public StockCar(String nome, double capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void mover() {
        System.out.println("StockCar no circuito.");
    }
}
