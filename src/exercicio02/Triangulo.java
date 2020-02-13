package exercicio02;

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(){

    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void area(){
        double valor = (base*altura)/2;
        System.out.println("A área do triangulo é: "+valor);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
