class Distribuidor extends Fornecedor 
{
    private String regiaoDeAtuacao;

    // Getter e Setter
    public String getRegiaoDeAtuacao() 
    {
        return regiaoDeAtuacao;
    }

    public void setRegiaoDeAtuacao(String regiaoDeAtuacao) 
    {
        this.regiaoDeAtuacao = regiaoDeAtuacao;
    }

    @Override
    void exibirInfo() 
    {
        super.exibirInfo();
        System.out.println("Região de Atuação: " + regiaoDeAtuacao);
    }
}
