public class Consumidor {

    public   String nome;
    public  String cpf;
    public  Endereco endereco;

    @Override
    public String toString() {
        return "Consumidor{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
