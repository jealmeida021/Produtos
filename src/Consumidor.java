public class Consumidor {
    private String nome;
    private String cpf;
    private Endereco endereco = new Endereco();

    public Consumidor() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        String var10000 = this.nome;
        return "Consumidor{nome='" + var10000 + "', cpf='" + this.cpf + "', endereco=" + String.valueOf(this.endereco) + "}";
    }
}
