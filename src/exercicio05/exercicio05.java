package exercicio05;

public class exercicio05{
    public static void main(String[] args) {
        Caneta caneta = new Caneta("Plástico", "tinta");
        Lapis lapis = new Lapis("Madeira", "grafite");
        PenaMosquito penaMosquito = new PenaMosquito("Metal", "nanquim");

        caneta.escrever();
        lapis.escrever();
        penaMosquito.escrever();
    }

}
