class MateriaPrima extends Produto 
{
    private String unidadeDeMedida;

    // Getter
    public String getUnidadeDeMedida() 
    {
        return unidadeDeMedida;
    }

    // Setter
    public void setUnidadeDeMedida(String unidadeDeMedida) 
    {
        this.unidadeDeMedida = unidadeDeMedida;
    }

    @Override
    void exibirInfo() {
        super.exibirInfo();
        System.out.println("Unidade de Medida: " + unidadeDeMedida);
    }
}
