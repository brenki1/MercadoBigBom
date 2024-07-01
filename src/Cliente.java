public class Cliente extends Pessoa{
    private float gasto = 0;

    public Cliente() {}

    public Cliente(String nome, String CPF, int idade, float gasto) {
        super(nome, CPF, idade);
        this.gasto = gasto;
    }

    public float getGasto() {return gasto;}
    public void setGasto(float gasto) {this.gasto = gasto;}

    @Override
    public String toString() {
        return "Cliente{" +
                "gasto=" + gasto +
                '}';
    }
}
