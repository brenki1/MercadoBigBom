public class Funcionario extends Pessoa{
    private String nroCLT;
    private double salario;

    public Funcionario () {}

    public Funcionario (String CPF, String nome, int idade, String nroCLT, double salario) {
        super(CPF, nome, idade);
        this.nroCLT = nroCLT;
        this.salario = salario;
    }

    public String getNroCLT() {
        return nroCLT;
    }

    public void setNroCLT(String nroCLT) {
        this.nroCLT = nroCLT;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nroCLT='" + nroCLT + '\'' +
                ", salario=" + salario +
                '}';
    }
}
