public class Produto {
    private String nome;
    private String codigo;
    private String tipo;
    private int quantia;
    private float preco;
    private float custo;

    public Produto () {}

    public Produto (String nome, String codigo, String tipo, int quantia, float preco, float custo) {
        this.nome = nome;
        this.codigo = codigo;
        this.tipo = tipo;
        this.quantia = quantia;
        this.preco = preco;
        this.custo = custo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantia() {
        return quantia;
    }

    public void setQuantia(int quantia) {
        this.quantia = quantia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", quantia=" + quantia +
                ", preco=" + preco +
                ", custo=" + custo +
                '}';
    }
}
