package exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Karina", 26, "Bragança Paulista", "30987654321");
        Funcionario funcionario = new Funcionario("Joana", 30, "São Paulo", 1234);

        cliente.exibirDados();
        funcionario.exibirDados();
    }

}
