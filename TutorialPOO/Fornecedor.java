class Fornecedor 
{
    private String nome;
    private String endereco;
    private String telefone;

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    void exibirInfo()
    {
        System.out.println("Fornecedor Nome: " + nome + ", Endereço: " + endereco + ", Telefone: " + telefone);
    }

    void exibirInfo(boolean detalhado) 
    {
        if (detalhado) 
        {
            System.out.println("Fornecedor Nome: " + nome + ", Endereço: " + endereco + ", Telefone: " + telefone);
        } 
        else 
        {
            exibirInfo();
        }
    }
}
