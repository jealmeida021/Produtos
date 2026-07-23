public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.realizaCadastro();
    }

    public void realizaCadastro() {
        Consumidor consumidor = new Consumidor();
        consumidor.setNome("Aline");
        consumidor.setCpf("123456");
        consumidor.getEndereco().setLogradouro("Rua jose");
        consumidor.getEndereco().setCep("1815151");
        consumidor.getEndereco().setEstado("SP");
        consumidor.getEndereco().setCidade("Sorocaba");
        consumidor.getEndereco().setBairro("Cajuru");
        consumidor.getEndereco().setTipoLogradouro("Residencial");
        consumidor.getEndereco().setNumero("123");
        System.out.println("Nome : " + consumidor.getNome());
        System.out.println("CPF : " + consumidor.getCpf());
        System.out.println("Endereco : " + String.valueOf(consumidor.getEndereco()));
    }
}

