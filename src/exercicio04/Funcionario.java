package exercicio04;

public class Funcionario extends Pessoa {
    private int numMatricula;

    public Funcionario(String nome, int idade, String cidadeNascimento, int numMatricula) {
        super(nome, idade, cidadeNascimento);
        this.numMatricula = numMatricula;
    }

    public Funcionario(){

    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Número de Matrícula: "+getNumMatricula());
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }
}
