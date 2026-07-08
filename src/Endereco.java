public class Endereco  {

    String tipoLogradouro;
    String numero;
    String logradouro;
    String bairro;
    String cidade;
    String cep;
    String estado;


    @Override
    public String toString() {
        return "Endereco{" +
                "tipoLogradouro='" + tipoLogradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
