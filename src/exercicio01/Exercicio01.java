package exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Karina", 26, 50.0);
        Pessoa pessoa2 = new Pessoa("Gabriela", 27, 56);
        Pessoa pessoa3 = new Pessoa("Maria", 30, 70);

        pessoa1.aniversario();
        pessoa2.comer();
        pessoa3.comer();
        pessoa3.aniversario();
    }
}
