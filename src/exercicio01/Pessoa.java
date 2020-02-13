package exercicio01;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;

    public Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public Pessoa(){

    }

    public void comer(){
        this.peso+=0.5;
        System.out.println(nome+ " comeu e agora pesa "+this.peso+"kg");
    }

    public void aniversario(){
        this.idade+=1;
        System.out.println(nome+" fez aniversário e agora tem "+this.idade+" anos.");
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
