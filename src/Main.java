public class Main {


    public static void main(String[] args) {

        Main main = new Main();
        main.realizaCadastro();

    }

        public void realizaCadastro(){


            Consumidor consumidor = new Consumidor();
            Consumidor consumidor1 = new Consumidor();
            consumidor.nome = "Aline";
            consumidor.cpf = "123456789";
            consumidor.endereco = new Endereco();
            consumidor.endereco.cep = "15000";
            consumidor.endereco.numero = "150";
            consumidor.endereco.estado = "Sao Paulo";
            consumidor.endereco.cidade = "Sorocaba";
            consumidor.endereco.bairro = "Cajuru";
            consumidor.endereco.logradouro = "Praca";
            consumidor.endereco.tipoLogradouro = "Ponto";

            consumidor1.nome = "Isabella";
            consumidor1.cpf = "1212121212";
            consumidor1.endereco = new Endereco();
            consumidor1.endereco.cep = "1810500";
            consumidor1.endereco.numero = "120";
            consumidor1.endereco.estado = "Sao Paulo";
            consumidor1.endereco.cidade = "Sorocaba";
            consumidor1.endereco.bairro = "Cajuru";
            consumidor1.endereco.logradouro = "Rua Jose";
            consumidor1.endereco.tipoLogradouro = "Praça";



            System.out.println(consumidor.endereco);

            System.out.println(consumidor1.endereco);

        }


}
