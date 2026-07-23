public class Produto {
    private int id;
    private String nome;
    private String categoria;
    private double valor;

    public Produto() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString() {
        return "Produto{id=" + this.id + ", nome='" + this.nome + "', categoria='" + this.categoria + "', valor=" + this.valor + "}";
    }
}
