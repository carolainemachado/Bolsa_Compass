public class Pessoa {
    private String nome;
    private int idade;
    private double altuura;

    public Pessoa(String nome, int idade, double altuura) {
        this.nome = nome;
        this.idade = idade;
        this.altuura = altuura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltuura() {
        return altuura;
    }

    public void setAltuura(double altuura) {
        this.altuura = altuura;
    }

    public String toString() {
        return  nome + ", " + idade + ", " + altuura;
    }
}
