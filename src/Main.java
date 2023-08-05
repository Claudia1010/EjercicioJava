import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese el número que corresponde al tipo de figura:");
        System.out.println("1: Circulo");
        System.out.println("2: Cuadrado");
        System.out.println("3: Triangulo");

        int figura = -1;
        while (figura < 1 || figura > 3) {
            while (!scanner.hasNextInt()) {
                System.out.println("Eso no es un número. Intente de nuevo:");
                scanner.next(); // esto descarta la entrada incorrecta
            }
            figura = scanner.nextInt();
            if (figura < 1 || figura > 3) {
                System.out.println("El número ingresado debe ser 1, 2 o 3. Intente de nuevo.");
            }
        }

        double tamano = -1;
        while (tamano <= 0) {
            System.out.println("Por favor, ingrese el tamaño de la figura (debe ser un número mayor que cero):");
            while (!scanner.hasNextDouble()) {
                System.out.println("Eso no es un número. Intente de nuevo:");
                scanner.next(); // esto descarta la entrada incorrecta
            }
            tamano = scanner.nextDouble();
            if (tamano <= 0) {
                System.out.println("El número ingresado debe ser mayor que cero. Intente de nuevo.");
            }
        }

        switch (figura) {
            case 1:
                Circulo circulo = new Circulo(tamano);
                System.out.println("Área del círculo: " + circulo.calcularArea());
                System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
                break;
            case 2:
                Cuadrado cuadrado = new Cuadrado(tamano);
                System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
                System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());
                break;
            case 3:
                Triangulo triangulo = new Triangulo(tamano);
                System.out.println("Área del triángulo: " + triangulo.calcularArea());
                System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
                break;
        }

        scanner.close();
    }
}
