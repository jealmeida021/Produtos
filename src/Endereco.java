public class Endereco {
    private String tipoLogradouro;
    private String numero;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String cep;
    private String estado;

    public Endereco() {
    }

    public String getTipoLogradouro() {
        return this.tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString() {
        return "Endereco{tipoLogradouro='" + this.tipoLogradouro + "', numero='" + this.numero + "', logradouro='" + this.logradouro + "', bairro='" + this.bairro + "', cidade='" + this.cidade + "', cep='" + this.cep + "', estado='" + this.estado + "'}";
    }
}
