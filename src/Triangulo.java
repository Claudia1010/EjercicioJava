public class Triangulo extends Figura {
    private double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2) * Math.sqrt(3) / 4;
    }

    @Override
    public double calcularPerimetro() {
        return 3 * lado;
    }
}

