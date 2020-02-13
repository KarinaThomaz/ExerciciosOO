package exercicio04;

public class Cliente extends Pessoa {
    private String CPF;

    public Cliente(String nome, int idade, String cidadeNascimento, String CPF) {
        super(nome, idade, cidadeNascimento);
        this.CPF = CPF;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("CPF: "+getCPF());
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
